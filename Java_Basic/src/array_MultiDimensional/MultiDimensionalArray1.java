package array_MultiDimensional;

public class MultiDimensionalArray1 {

	public static void main(String[] args) {

		// declaring & initializing 2D array_SingleDimensional
		int a[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };

		// printing 2D array_SingleDimensional
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
