package com.day6.session1.part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DiffBwCharVsByte {
	public static void main(String[] args) throws IOException {
		
		
		//i am using char stram to read a photo
		FileInputStream fr=new FileInputStream("ali.jpeg");
		
		FileOutputStream fw=new FileOutputStream("ali_copy2.jpeg");
		
		int i=0;
		while((i=fr.read())!=-1) {
			fw.write(i);
		}
		fw.flush();
		fw.close();
		fr.close();
		
//		
//		//i am using char stram to read a photo
//		FileReader fr=new FileReader("ali.jpeg");
//		
//		FileWriter fw=new FileWriter("ali_copy.jpeg");
//		
//		int i=0;
//		while((i=fr.read())!=-1) {
//			fw.write(i);
//		}
//		fw.flush();
//		fw.close();
//		fr.close();
		
	}

}
