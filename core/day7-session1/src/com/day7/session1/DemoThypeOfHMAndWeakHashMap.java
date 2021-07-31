package com.day7.session1;

import java.util.*;

// if u are using a HashMap with custom key , then it must imp hashcode...
class Key implements Comparable<Key>{
	private int k;

	public Key(int k) {
		this.k = k;
	}
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + k;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (k != other.k)
			return false;
		return true;
	}
	@Override
	public int compareTo(Key o) {
		return Integer.compare(this.getK(), o.getK());
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("i am being called...");
		super.finalize();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Key [k=");
		builder.append(k);
		builder.append("]");
		return builder.toString();
	}
	
	
}

public class DemoThypeOfHMAndWeakHashMap {

	public static void main(String[] args) throws InterruptedException {
		
		//normal map vs weak hashmap
		
		
		Key key =new Key(33);
		
		WeakHashMap<Key, String> map=new WeakHashMap<>();
		
		map.put(key, "33");
		
		key=null;
		
		Thread.sleep(3000);//ms
		System.gc(); // it not guranteed.... GC (collect the garbage)
		Thread.sleep(3000);//ms
		
		System.out.println(map);
	
	
	
	
	
	
	
		
//		String val= map.get(new Key(33));
//		System.out.println(val);
		
	}
}




