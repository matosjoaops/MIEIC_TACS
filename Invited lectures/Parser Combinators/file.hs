module Parser where

import Prelude hiding ((<*>), (<$>))

import Data.Char

infixl 2 <|>
infixl 3 <*>

type Parser r = String -> [(r, String)]

symbolA :: Parser Char
symbolA [] = []
symbolA (h:t) | h == 'a' = [('a', t)]
              | otherwise = []

symbol :: Char -> Parser Char
symbol c [] = []
symbol c (h:t) | c == h = [(h,t)]
               | otherwise = []

satisfy :: (Char -> Bool) -> Parser Char
satisfy p [] = []
satisfy p (h:t) | p h = [(h,t)]
                | otherwise = []

pDigit = satisfy isDigit
pLowerLetters = satisfy isLower

token :: String -> Parser String
token t input | take (length t) input == t = [(t,drop (length t) input)]
              | otherwise = []

succeed :: a -> Parser a
succeed r input = [(r,input)]

------------------
-- Combinators
------------------

(<|>) :: Parser a -> Parser a -> Parser a
(p <|> q) input = p input ++ q input
aOrb = symbol 'a' 
    <|> symbol 'b'

ex = token "for"
  <|> token "while"

(p <**> q) input = [((r,r'), rrinput)
                  |(r, rinput) <- p input
                  ,(r', rrinput) <- q rinput
                  ]

--aThenb = symbol 'a' <*> symbol 'b'

--aThenbThenc = symbol 'a' <**> symbol 'b' <**> symbol 'c'

(p <*> q) input = [ (f v,rrinput)
                  | (f, rinput) <- p input 
                  , (v,rrinput) <- q rinput
                  ]

(f <$> p) inp = [ (f r, rinput)
                | (r,rinput) <- p inp         
                ]

aThenbThenc = f <$> symbol 'a' <*> symbol 'b' <*> symbol 'c'
  where f a b c = [a,b,c]

-- Example

pX = f <$> pA <*> pB
  where f a b = (a,b)

pA = f <$> symbol 'a' <*> pA
  <|> succeed 0
  where f a b = 1 + b

pB = f <$> symbol 'b' <*> pB
  <|> g <$> symbol 'b'
  where f a b = a:b
        g a = [a]

zeroOrMore p = f <$> p <*> (zeroOrMore p)
            <|> succeed []
            where f a b = a:b

oneOrMore p = f <$> p <*> (oneOrMore p)
            <|> g <$> p
            where f a b = a:b
                  g a = [a]

spaces = zeroOrMore (satisfy isSpace)

ident = oneOrMore (satisfy isLower)


