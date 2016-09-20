package home;

import java.util.Scanner;

public class Ex4_11 {

	public static void main(String[] args) {
		char gender;
		Scanner scanner = new Scanner(System.in);

		System.out.print("주민번호 입력 : ");
		String num = scanner.nextLine();

		gender = num.charAt(8);

		int year = num.charAt(1);
		if (gender == 1) {
			if (year > 1) {
				System.out.println("2000년 이후에 탄생한 남자입니다.");
			} else {
				System.out.println("2000년 이전에 탄생한 남자입니다.");
			}
		} else {
			if (year > 1) {
				System.out.println("2000년 이후에 탄생한 여자입니다.");
			} else {
				System.out.println("2000년 이전에 탄생한 여자입니다.");
			}

		}

	}

}
