package com.day7.session1;
import java.util.*;
import java.util.Map.Entry;

class Product{
	private int id;
	private String name;
	private double unitPrice;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}		
}
class LineItem{
	private Product product;
	private int qty;
	private double total;
	public LineItem(Product product, int qty) {
		super();
		this.product = product;
		this.qty = qty;
		this.total = product.getUnitPrice() * qty;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
}
class Customer{
	private int id;
	private String name;
	private String phone;
	private String email;
	private Address address;
	
	
	
}

class Address{
	private String houseNo;
	private String addressLine1;
	private String city;
	private String country;
	///
	
}
class ShoppingCart{
	private int cardId;
	private List<LineItem> items=new LinkedList<LineItem>();
	private String customerId;
	
	///
}
public class SomeUseCaseOfMap {
	
	public static void main(String[] args) {
		
		Map<Customer, ShoppingCart> map=new HashMap<Customer, ShoppingCart>();
		
		
		
		
//		Map<String, Integer>map=new HashMap<String, Integer>();
//		map.put("foo", 33);
//		map.put("bar", 77);
//		
//		//keyset
////		Set<String> keySet = map.keySet();
////		for(String key: keySet) {
////			System.out.println(key + " : "+ map.get(key));
////		}
//		//entry set
////		
////		Set<Entry<String, Integer>> entrySet = map.entrySet();
////		for(Entry<String, Integer> e: entrySet) {
////			System.out.println(e.getKey() + " : " + e.getValue());
////		}
//		
//		//java 8: (best)*
//		//map.forEach((k, v)->System.out.println(k+": "+ v));
	}

}
