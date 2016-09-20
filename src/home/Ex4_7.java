package home;

import java.util.*;

public class Ex4_7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while (true) {
			int com = (int) (Math.random() * 3);
			System.out.println(com);

			System.out.println("입력!");
			String man = scan.nextLine();

			int man2 = 3;
			if (man.equals("가위")) {
				man2 = 0;
			} else if (man.equals("바위")) {
				man2 = 1;
			} else if (man.equals("보")) {
				man2 = 2;
			} else {
				System.out.println("잘못입력");
			}
			switch (com) {
			case 0:
				switch (man2) {
				case 0:
					System.out.println("비김");
					break;
				case 1:
					System.out.println("이김");
					break;
				case 2:
					System.out.println("짐");
					break;
				}
				break;
			case 1:
				switch (man2) {
				case 0:
					System.out.println("짐");
					break;
				case 1:
					System.out.println("비김");
					break;
				case 2:
					System.out.println("이김");
					break;
				}
				break;
			case 2:
				switch (man2) {
				case 0:
					System.out.println("이김");
					break;
				case 1:
					System.out.println("짐");
					break;
				case 2:
					System.out.println("비김");
					break;
				}
				break;
			}
			System.out.println("계속?(y/n) ");
			man = null;
			String a = scan.nextLine();
			if (a.equals("y")) {
				continue;
			} else {
				break;
			}

		}
		scan.close();
	}

}
