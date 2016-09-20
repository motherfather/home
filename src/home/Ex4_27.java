package home;

import java.util.Scanner;

public class Ex4_27 {

	public static void main(String[] args) {
		System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");
		System.out.print(">>");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		for(;num != 0;){
			sum += num;
			System.out.print(">>");
			num = scan.nextInt();
		}
		System.out.println(sum);
		
	}

}
