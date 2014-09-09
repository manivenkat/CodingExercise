package test.com.salestax.tests;

import static org.junit.Assert.*;

import main.com.salestax.Order;
import main.com.salestax.OrderEntry;
import main.com.salestax.products.Product;
import main.com.salestax.products.ProductFactory;
import main.com.salestax.products.ProductType;

import org.junit.Before;
import org.junit.Test;


public class TestOrder {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testGetTotal() {

		Product importedBottleOfPerfume = ProductFactory.addProduct(ProductType.OTHERS,
				"imported bottle of perfume", true);

Product bottleOfPerfume = ProductFactory.addProduct(
	ProductType.OTHERS, "bottle of perfume", false);

Product packetOfHeadachePills = ProductFactory.addProduct(
		ProductType.MEDICAL, "packet of headache pills", false);

Product boxOfImportedChocolates = ProductFactory.addProduct(
		ProductType.FOOD, "box of imported chocolates", true);
Order order3 = new OrderEntry("Output #3");

order3.addItem(importedBottleOfPerfume, 27.99f, 1);
order3.addItem(bottleOfPerfume, 18.99f, 1);
order3.addItem(packetOfHeadachePills, 9.75f, 1);
order3.addItem(boxOfImportedChocolates, 11.25f, 1);
	
		

		
		order3.calculateTotal();
		
		float expectedTotal=74.68f;
	//	assertEquals(expectedTotalTaxes, order3.getTotalTaxes(),0.01f);
		assertEquals(expectedTotal, order3.getTotal(),0.01f);
	}

	@Test
	public void testGetTotalTaxes() {

		Product importedBottleOfPerfume = ProductFactory.addProduct(ProductType.OTHERS,"imported bottle of perfume", true);

Product bottleOfPerfume = ProductFactory.addProduct(
	ProductType.OTHERS, "bottle of perfume", false);

Product packetOfHeadachePills = ProductFactory.addProduct(
		ProductType.MEDICAL, "packet of headache pills", false);

Product boxOfImportedChocolates = ProductFactory.addProduct(
		ProductType.FOOD, "box of imported chocolates", true);
Order order3 = new OrderEntry("Output #3");

order3.addItem(importedBottleOfPerfume, 27.99f, 1);
order3.addItem(bottleOfPerfume, 18.99f, 1);
order3.addItem(packetOfHeadachePills, 9.75f, 1);
order3.addItem(boxOfImportedChocolates, 11.25f, 1);
	
		

		
		order3.calculateTotalTaxes();
		
		float expectedTotalTaxes=6.70f;
	assertEquals(expectedTotalTaxes, order3.getTotalTaxes(),0.01f);
		//assertEquals(expectedTotalTaxes, order3.getTotal(),0.01f);
	}

}
