package com.day6.session1.part2;

import java.io.File;
import java.io.FileFilter;

public class DemoFIle {
	
	public static void main(String[] args) {
		//print all files of files
		//print all files of a folder recrusively ... watch mode in java!
		
		File dir=new File("/opt/sts_eclipse");
		
		if(dir.isDirectory()) {
			//gettting list of all hiddes files
			File[]files=dir.listFiles(new FileFilter() {
				
				@Override
				public boolean accept(File pathname) {
					return pathname.isHidden();
				}
			});
			
			//print them
			for(File file: files) {
				System.out.println(file.getName());
				
			}
			
		}
	}

}
