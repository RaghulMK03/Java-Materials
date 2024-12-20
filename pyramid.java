package intro_example;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter number of rows: ");
	        int rows = scanner.nextInt();

	        for (int i = 1; i <= rows; i++) {
	            // Print spaces before asterisks
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }

	            // Print asterisks
	            for (int k = 1; k <= 2 * i - 1; k++) {
	            	 if (k == 1 || k == 2 * i - 1 || i == rows) {
	                     System.out.print("0");
	                 } else {
	                     System.out.print(" ");
	                 }
	                
	            }

	            System.out.println(); // Move to next line
	        }

	        scanner.close();

	}

}
