package main.com.salestax.products;

import main.com.salestax.tax.TaxPractice;




public class ProductFactory {
	public static TaxPractice taxpractice;
	
	
	public static TaxableProduct createItem(Product product, float prodPrice, int qty) {
		//System.out.println(prodPrice);
		TaxableProduct prod = new TaxableProductImpl(product, prodPrice, qty);
		//System.out.println(prod.getProdPrice());
		return prod;

}
	
	

	public static Product addProduct(ProductType type, String name,boolean imported) {
		Product prod =null;
	
		
			
		if(type==ProductType.BOOK)
			{
			Book book= new Book();
			prod=book;
			}
		else if(type==ProductType.FOOD)
		{
			Book food=new Book();
			prod=food;
		}
		else if(type==ProductType.MEDICAL)
		{
			Book medical=new Book();
			prod=medical;
		}
		else if(type==ProductType.OTHERS)
		{
			Book others=new Book();
			prod=others;
		}
		
		
	prod.setName(name);
		prod.setImported(imported);
		
	taxpractice.applyTax(type, prod);
	return prod;
	}

}
