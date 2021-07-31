package com.day7.session1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
public class DemoProperteis {

	public static void main(String[] args) throws IOException {
		
		InputStream ios=DemoProperteis.class.getClassLoader().getResourceAsStream("db.properties");
		
		//InputStream ios=new FileInputStream("db.properties");
		
		Properties properties=new Properties();
		properties.load(ios);
		System.out.println(properties.getProperty("jdbc.username"));
		System.out.println(properties.getProperty("jdbc.password"));
		
	}
}

