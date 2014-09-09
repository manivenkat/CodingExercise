package main.com.salestax.products;

public enum ProductType {
	BOOK(2), FOOD(1), MEDICAL(1), OTHERS(0);

	private int value;
	
	private ProductType(int value)
	{
		this.value=value;
	}
	
	public int getProductType()
	{
		return value;
	}

}
