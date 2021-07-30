package com.day6.session2.demo_map;
import java.util.*;

//Map with user define key?
final class Key{
	final private int k;

	public int getK() {
		return k;
	}

	public Key(int k) {
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
	
	
}
public class DemoMap2 {
	public static void main(String[] args) {
		// map of user define key 
		
		Map<Key, Integer> map=new HashMap<>();
		
		map.put(new Key(33), 33);
		map.put(new Key(330), 330);
		map.put(new Key(31), 31);
		map.put(new Key(45), 45);
	
		//never make you key mutable: bug
		Key key=new Key(449);
		map.put(key, 449);
		//key.setK(450);
		
		
		Integer val = map.get(key);
		System.out.println(val);
		
		//GPP: key should be ideally String , Integer, dont create your own key
		
	}
}
