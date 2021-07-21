package com.facerec.controller;

import com.facerec.pesistance.Face;

public class Main {

	public static void main(String[] args) {
		Face face=new Face();
		face.saveFacePixelOnDb();
		
		com.facerec.web.Face face2=new com.facerec.web.Face();
		face2.printFaceOnUi();
		
	}
}
