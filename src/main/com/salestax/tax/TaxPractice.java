package main.com.salestax.tax;

import main.com.salestax.*;
import main.com.salestax.products.Product;
import main.com.salestax.products.ProductType;


public interface TaxPractice {
	
	void applyTax( ProductType type, Product product);

}
