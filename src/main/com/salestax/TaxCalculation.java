package main.com.salestax;

import java.util.List;

import main.com.salestax.products.TaxableProduct;



public interface TaxCalculation {
	
void applyTaxCalculations(TaxableProduct prod);
	
float applyTotalCalculation(List<TaxableProduct> prodtaxlist);
	
float applyTotalTaxCalculation(List<TaxableProduct> prodtotaltaxlist);

}
