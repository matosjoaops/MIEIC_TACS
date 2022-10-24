module Parser where

import Data.Char

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


