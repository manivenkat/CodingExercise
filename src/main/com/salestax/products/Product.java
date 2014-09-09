package main.com.salestax.products;

import java.util.HashSet;
import java.util.Set;

import main.com.salestax.tax.Taxtype;




public abstract class Product {
	private boolean imported;
	private String name;
	
	private Set<Taxtype> taxesList;

	protected Product() {
	
		taxesList = new HashSet<Taxtype>();
	}

	public boolean isImported() {
		return imported;
	}

	public void setImported(boolean imported) {
		this.imported = imported;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Taxtype> getSalesTaxes() {
		return taxesList;
	}
}
