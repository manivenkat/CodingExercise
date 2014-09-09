package main.com.salestax;

import main.com.salestax.products.Product;
import main.com.salestax.products.ProductFactory;
import main.com.salestax.products.ProductType;
import main.com.salestax.tax.TaxPracticeImpl;




public class ReceiptOutput {
	
	public static void outputOne() {

		// Input 1:
		// 1 book at 12.49
		// 1 music CD at 14.99
		// 1 chocolate bar at 0.85

		

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

		// Output 1:
		// 1 book : 12.49
		// 1 music CD: 16.49
		// 1 chocolate bar: 0.85
		// Sales Taxes: 1.50
		// Total: 29.83

	}

	public static void outputTwo() {

		// Input 2:
		// 1 imported box of chocolates at 10.00
		// 1 imported bottle of perfume at 47.50

		//GoodsFactory.taxStrategy = TaxStrategyImpl.getInstance();

		Product boxOfChocolates = ProductFactory.addProduct(ProductType.FOOD,"imported box of chocolate", true);
		Product bottleOfParfume = ProductFactory.addProduct(ProductType.OTHERS,"imported bottle of perfume", true);

		Order order = new OrderEntry("Output #2");

		order.addItem(boxOfChocolates, 10.00f, 1);
		order.addItem(bottleOfParfume, 47.50f, 1);

		order.calculateTotalTaxes();
		order.calculateTotal();

		SimpleReceipt printer = new SimpleReceipt();
		printer.print(order);

		// Output 2:
		// 1 imported box of chocolates: 10.50
		// 1 imported bottle of perfume: 54.65
		// Sales Taxes: 7.65
		// Total: 65.15

	}

	public static void outputThree() {
		// Input 3:
		// 1 imported bottle of perfume at 27.99
		// 1 bottle of perfume at 18.99
		// 1 packet of headache pills at 9.75
		// 1 box of imported chocolates at 11.25
		
		

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

		// Output 3:
		// 1 imported bottle of perfume: 32.19
		// 1 bottle of perfume: 20.89
		// 1 packet of headache pills: 9.75
		// 1 imported box of chocolates: 11.85
		// Sales Taxes: 6.70
		// Total: 74.68

	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProductFactory.taxpractice = TaxPracticeImpl.getInstance();
		ReceiptOutput.outputOne();
		ReceiptOutput.outputTwo();
		ReceiptOutput.outputThree();
	}


}
