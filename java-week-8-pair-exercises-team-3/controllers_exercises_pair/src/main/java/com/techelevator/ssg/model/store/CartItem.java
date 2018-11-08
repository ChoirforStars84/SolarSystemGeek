package com.techelevator.ssg.model.store;

public class CartItem {
	
	Product product;
	int quantity;
	DollarAmount subTotal;
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int calculateSubTotal(Product product, int quantity) {
		DollarAmount price = (product.getPrice()).hashcode();
		
		subTotal = price * qt;
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	

}
