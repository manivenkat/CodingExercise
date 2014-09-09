package main.com.salestax.products;

public class TaxableProductImpl implements TaxableProduct {
	Product product;
	
	float productPrice;
	float taxCosts;
	float totalProdPrice;
	int quantity;
	
	public TaxableProductImpl(Product product, float productPrice,int qty)
	{
		super();
		this.product=product;
		this.productPrice=productPrice*qty;
		this.totalProdPrice=this.productPrice;
	
		this.quantity=qty;
	}
	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		return product;
	}

	@Override
	public void setProduct(Product product) {
		// TODO Auto-generated method stub
		this.product=product;

	}

	@Override
	public void setProdPrice(float productPrice) {
		
 this.productPrice=productPrice;
	}

	@Override
	public float getProdPrice() {
	//System.out.println(productPrice);
		return productPrice;
	}

	@Override
	public void setTaxCosts(float taxCosts) {
		
    this.taxCosts=taxCosts;
   // System.out.println(taxCosts);
	}

	@Override
	public float getTaxCosts() {
		
		return taxCosts;
	}

	@Override
	public void setTotalProdPrice(float totalProdPrice) {
		this.totalProdPrice=totalProdPrice;

	}

	@Override
	public float getTotalProdPrice() {
		// TODO Auto-generated method stub
	
		return totalProdPrice;
	}

	@Override
	public int getQty() {
	
		return quantity;
	}

}
