package main.com.salestax;

import java.util.ArrayList;
import java.util.List;

import main.com.salestax.products.Product;
import main.com.salestax.products.ProductFactory;
import main.com.salestax.products.TaxableProduct;



public class OrderEntry implements Order {

	
	private String name;
	private float total;
	private float totalTaxes;
	private List<TaxableProduct> itemsList;
	private TaxCalculation taxcalc;
	
	public OrderEntry(String name) {
		itemsList = new ArrayList<TaxableProduct>();
		taxcalc = new TaxCalculationImpl();
		this.name = name;
	}
	


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setCalculator(TaxCalculation taxcalc) {
		this.taxcalc = taxcalc;
	}

	@Override
	public TaxCalculation getCalculator() {
		// TODO Auto-generated method stub
		return taxcalc;
	}
	@Override
	public void addItem(Product product, float productCost, int qty) {
		
		TaxableProduct newprod = ProductFactory.createItem(product, productCost, qty);
	
		taxcalc.applyTaxCalculations(newprod);
		itemsList.add(newprod);
		newprod = null;

	}

	@Override
	public float getTotal() {
		// TODO Auto-generated method stub
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public void setTotalTaxes(float totalTaxes) {
				this.totalTaxes = totalTaxes;
				
	}
	@Override
	public float getTotalTaxes() {
		return totalTaxes;
	}


	@Override
	public void calculateTotal() {
		total = taxcalc.applyTotalCalculation(itemsList);

	}
	
		

	@Override
	public void calculateTotalTaxes() {
		totalTaxes = taxcalc.applyTotalTaxCalculation(itemsList);
		
	}
	
	
	@Override
	public List<TaxableProduct> getItemsList() {
		// TODO Auto-generated method stub
		return itemsList;
	}
	
	

}
