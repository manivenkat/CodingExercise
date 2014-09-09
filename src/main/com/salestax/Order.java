package main.com.salestax;

import java.util.List;

import main.com.salestax.products.Product;
import main.com.salestax.products.TaxableProduct;



public interface Order {
	
   void addItem(Product product, float productCost, int qty);
	
	void setCalculator(TaxCalculation taxcalc);
	
	TaxCalculation getCalculator();
	
	void calculateTotal();
	
	float getTotal();
	
	void calculateTotalTaxes();
	
	float getTotalTaxes();
	
	List<TaxableProduct> getItemsList();
	
	String getName();

}
