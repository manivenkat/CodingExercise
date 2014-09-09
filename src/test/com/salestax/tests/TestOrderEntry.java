package test.com.salestax.tests;

import static org.junit.Assert.*;

import main.com.salestax.products.Product;
import main.com.salestax.products.ProductFactory;
import main.com.salestax.products.ProductType;
import main.com.salestax.products.TaxableProduct;
import main.com.salestax.tax.TaxPracticeImpl;

import org.junit.Before;
import org.junit.Test;


public class TestOrderEntry {

	@Before
	public void setUp() throws Exception {
		ProductFactory.taxpractice=TaxPracticeImpl.getInstance();
	}

	@Test
	public void testFood() {
		Product chocolates = ProductFactory.addProduct(
				ProductType.FOOD, "box of imported chocolates", true);

		float expetedProductCosts = 11.25f;
		int expectedQty = 1;

		TaxableProduct item = ProductFactory.createItem(chocolates,
				expetedProductCosts, expectedQty);

		assertEquals(chocolates, item.getProduct());
		assertEquals(expectedQty, item.getQty());
		assertEquals(expetedProductCosts * expectedQty, item.getProdPrice(),
				0.01f);
	}

}
