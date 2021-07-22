package com.day2.session2.part1.q6;

public class MatrixUtilTest {

	public static void main(String[] args) {
		
		int arr[][]= {{1,0,0},{0,1,0},{0,0,1}};
		
		boolean isIdetityMatrix= MatrixUtil.isIdentityMatrix(arr);
		System.out.println(isIdetityMatrix);
	}
}

