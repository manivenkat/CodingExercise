package main.com.salestax.tax;

import java.util.HashSet;
import java.util.Set;

import main.com.salestax.products.Product;
import main.com.salestax.products.ProductType;



public class TaxPracticeImpl implements TaxPractice {
	private Set<ProductType> exemptList;

	private static TaxPractice instance;

	private TaxPracticeImpl() {
		exemptList = new HashSet<ProductType>();
		exemptList.add(ProductType.BOOK);
		exemptList.add(ProductType.MEDICAL);
		exemptList.add(ProductType.FOOD);
	}

	public synchronized static TaxPractice getInstance() {
		if (instance == null) {
			instance = new TaxPracticeImpl();
		}
		return instance;
	}

	@Override
	public void applyTax(ProductType type, Product product) {

		// Assign the base tax to the product other than exempted products
		if (!exemptList.contains(type)) {
			product.getSalesTaxes().add(Taxtype.LOCAL);
		}

		// Import duty
		if (product.isImported()) {
			product.getSalesTaxes().add(Taxtype.IMPORTED);
		}
	}

}
