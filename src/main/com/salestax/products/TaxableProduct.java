package main.com.salestax.products;

/* interface to calculate total tax, products price total and product price + tax on that product */

public interface TaxableProduct {
	
Product getProduct();
	
	void setProduct(Product product);

	void setProdPrice(float productPrice);

	float getProdPrice();

	void setTaxCosts(float taxCosts);

	float getTaxCosts();

	void setTotalProdPrice(float totalProdPrice);

	float getTotalProdPrice();
	
	int getQty();


}
