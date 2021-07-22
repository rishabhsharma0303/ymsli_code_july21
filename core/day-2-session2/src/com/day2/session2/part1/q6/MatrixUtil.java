package com.day2.session2.part1.q6;

// it have all static method , no need instance variable
public class MatrixUtil {

	// matrix add

	public static int[][]   addMatric(int x[][], int y[][]) {

		return null;
	}

	// matric mutiple

	public static int[][] mulitlyMatric(int x[][], int y[][]) {

		return null;
	}

	// transpose

	// inverse

	public static boolean isIdentityMatrix(int x[][]) {
		boolean isIdentityMatrix = true;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (i == j) {
					if (x[i][j] != 1) {
						isIdentityMatrix = false;
						break;
					}
				} else {

					if (x[i][j] != 0) {
						isIdentityMatrix = false;
						break;
					}

				}
			}

		}
		return isIdentityMatrix;
	}

}
