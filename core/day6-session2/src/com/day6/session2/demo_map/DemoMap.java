package com.day6.session2.demo_map;
import java.util.*;
import java.util.Map.Entry;
public class DemoMap {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("foo", 44);
		map.put("foo", 404);
		map.put("bar", 56);
		
		//How to iterate a map
		//1. key set
		//2. entry set
		//3. java 8 syn *
		
		//1. key set
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.println(key + ": " + map.get(key));
		}
		
//		//2. entry set (better performacne) why ==> arch
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		for(Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey() + " :  "+ entry.getValue());
		}
		
		
		//map.putIfAbsent("bar", 78);
		
		//System.out.println(map);
		
	}
}
