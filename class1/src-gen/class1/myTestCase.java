package class1;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;

public class myTestCase {

	@Test
	public void test() {
		Address address = Class1Factory.eINSTANCE.createAddress();
		address.setCountry("Portugal");
		address.setStreet("Avenida Boavista");
		
		address.eClass().getEAllAttributes();
		
		EList<EAttribute> allAttributes = address.eClass().getEAllAttributes();
		for (EAttribute attribute : allAttributes) {
			address.eUnset(attribute);
		}
		
		Address copy = EcoreUtil.copy(address);
	}

}
