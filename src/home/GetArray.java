package home;

import java.util.Scanner;

public class GetArray {

	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,5};
		int[] b = new int[5];
		int[] c =  {1,2,3,4,5};
		getArray(a);
		getArray(b);
		getArray(c);
		
	}
	
	private static void getArray(int[] array){
		Scanner sc = new Scanner(System.in);
		for(int value : array)
			System.out.print(value + " ");
			System.out.println();
		
	}

}
