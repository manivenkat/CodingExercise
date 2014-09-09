package test.com.salestax.tests;

import static org.junit.Assert.*;

import main.com.salestax.Order;
import main.com.salestax.OrderEntry;
import main.com.salestax.SimpleReceipt;
import main.com.salestax.products.Product;
import main.com.salestax.products.ProductFactory;
import main.com.salestax.products.ProductType;
import main.com.salestax.tax.TaxPracticeImpl;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestSalesTax {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ProductFactory.taxpractice=TaxPracticeImpl.getInstance();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOutputOne() {
		Product book = ProductFactory.addProduct(ProductType.BOOK, "book", false);
		Product musicCd = ProductFactory.addProduct(ProductType.OTHERS,"music CD",false);
		Product chocolateBar = ProductFactory.addProduct(ProductType.FOOD,"chocolate bar", false);

		Order order = new OrderEntry("Output #1");

		order.addItem(book, 12.49f, 1);
		order.addItem(musicCd, 14.99f, 1);
						order.addItem(chocolateBar, 0.85f, 1);
//System.out.println(order.getItemsList().);


		order.calculateTotalTaxes();
		order.calculateTotal();

		SimpleReceipt printer = new SimpleReceipt();
		printer.print(order);
	}

	@Test
	public void testOutputTwo() {
		Product boxOfChocolates = ProductFactory.addProduct(ProductType.FOOD,"imported box of chocolate", true);
		Product bottleOfParfume = ProductFactory.addProduct(ProductType.OTHERS,"imported bottle of perfume", true);

		Order order = new OrderEntry("Output #2");

		order.addItem(boxOfChocolates, 10.00f, 1);
		order.addItem(bottleOfParfume, 47.50f, 1);

		order.calculateTotalTaxes();
		order.calculateTotal();

		SimpleReceipt printer = new SimpleReceipt();
		printer.print(order);
	}

	@Test
	public void testOutputThree() {
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

order3.calculateTotalTaxes();
order3.calculateTotal();

SimpleReceipt printer = new SimpleReceipt();
printer.print(order3);

	}

}
