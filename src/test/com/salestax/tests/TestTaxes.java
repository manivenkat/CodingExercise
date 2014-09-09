package test.com.salestax.tests;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import main.com.salestax.products.Product;
import main.com.salestax.products.ProductFactory;
import main.com.salestax.products.ProductType;
import main.com.salestax.tax.TaxPracticeImpl;
import main.com.salestax.tax.Taxtype;

import org.junit.Before;
import org.junit.Test;


public class TestTaxes {

	@Before
	public void setUp() throws Exception {
		ProductFactory.taxpractice=TaxPracticeImpl.getInstance();
	}

	@Test
	public void testBook() {
   Set<Taxtype> expectedList = new HashSet<Taxtype>();
   
		
		Product book = ProductFactory.addProduct(ProductType.BOOK, "book",false);
		
		assertEquals(expectedList, book.getSalesTaxes());
	}
	@Test
	public void testMedical() {
   Set<Taxtype> expectedList = new HashSet<Taxtype>();
   expectedList.add(Taxtype.IMPORTED);
   
		
		Product medical = ProductFactory.addProduct(ProductType.MEDICAL, "headache",true);
		
		assertEquals(expectedList, medical.getSalesTaxes());
	}

}
