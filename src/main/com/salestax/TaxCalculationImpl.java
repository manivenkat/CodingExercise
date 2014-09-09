package main.com.salestax;

import java.util.List;

import main.com.salestax.products.TaxableProduct;
import main.com.salestax.tax.Taxtype;



public class TaxCalculationImpl implements TaxCalculation {
	private float roundOff = 0.05f;
	@Override
	public void applyTaxCalculations(TaxableProduct prod) {
		// TODO Auto-generated method stub
for (Taxtype tax : prod.getProduct().getSalesTaxes()) {
			
			//System.out.println(prod.getProduct().getName());// Rounding off the sales tax to the nearest 5 cents
			prod.setTaxCosts(prod.getTaxCosts()
					+ Utils.roundofftoNearest(prod.getProdPrice() * tax.getRate(), roundOff));
	
			
			// consolidated cost which includes tax and product price
		prod.setTotalProdPrice(prod.getProdPrice()
					+ prod.getTaxCosts());
		}
	}

	@Override
	public float applyTotalTaxCalculation(List<TaxableProduct> prodtaxlist) {
		// TODO Auto-generated method stub
		float total = 0.0f;
		for(TaxableProduct item : prodtaxlist) {
			total += item.getTaxCosts();
		}
		return total;
	}

	@Override
	public float applyTotalCalculation(List<TaxableProduct> prodtotaltaxlist) {
		// TODO Auto-generated method stub
		float total = 0.0f;
		// Total cost of the product with tax
		for (TaxableProduct item : prodtotaltaxlist) {
			total += item.getTotalProdPrice();
		}
		return total;
	}

}
