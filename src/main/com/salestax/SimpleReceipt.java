package main.com.salestax;

import java.io.PrintWriter;

import main.com.salestax.products.TaxableProduct;

/* 

To print the output in a specified format - makes use of printwriter to print the output 
*/



public class SimpleReceipt {
	
		PrintWriter writer;

		public SimpleReceipt() {
			writer = new PrintWriter(System.out, true);
		}
		
		public void setWriter(PrintWriter writer) {
			this.writer = writer;
		}

		public void print(Order order) {
			writer.printf("Output: %s\n", order.getName());
			for (TaxableProduct prod : order.getItemsList()) {
				writer.printf("%d %s at %.2f\n", prod.getQty(), prod.getProduct().getName(),
						prod.getTotalProdPrice());
			}
			writer.printf("Taxes: %.2f\n", order.getTotalTaxes());
			writer.printf("Total: %.2f\n\n", order.getTotal());
			
		}

	}


