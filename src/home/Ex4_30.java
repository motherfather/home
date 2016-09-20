package home;

import java.util.Scanner;

public class Ex4_30 {

	public static void main(String[] args) {
		loop : while (true) {
			System.out.print("(1) square" + '\n' + "(2) square root" + '\n' + "(3) log" + "\n"
					+ " 원하는 메뉴 (1~3)를 선택하세요. (종료:0)>");
			Scanner scanner = new Scanner(System.in);

			int num = scanner.nextInt();
			switch (num) {
			case 0:
				break loop;
			case 1:
				System.out.println("선택하신 메뉴는 1번입니다.");
				for(;;) {
				System.out.print("계산할 값을 입력하세요. (계산 종료:0, 전체 종료:99)>");
				int num2 = scanner.nextInt();
				if(num2 == 0) {
					break;
				}else if(num2 == 99) {
					break loop;
				}
				int num2_1 = num2 * num2;
				System.out.println(num2_1);
				continue;
				}
				break;
			case 2:
				System.out.println("선택하신 메뉴는 2번입니다.");
				while(true) {
					System.out.print("계산할 값을 입력하세요. (계산 종료:0, 전체 종료:99)>");
					double num3 = scanner.nextDouble();
					if(num3 == 0) {
						break;
					}else if(num3 == 99) {
						break loop;
					}
					double num3_1 = Math.sqrt(num3);
					System.out.println(num3_1);
					continue;
				}
				continue;
			case 3:
				System.out.println("선택하신 메뉴는 3번입니다.");
				while(true) {
					System.out.print("계산할 값을 입력하세요. (계산 종료:0, 전체 종료:99)>");
					double num4 = scanner.nextDouble();
					if(num4 == 0) {
						break;
					}else if(num4 == 99) {
						break loop;
					}
//					double num4_1 = Math.log(num4);			로그 함수를 못찾았음
					System.out.println(num4_1);
					continue;
				}
				continue;
			default:
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
				continue;
			}
			
		}
	System.out.println("프로그램을 종료합니다.");
	}

	private static double (double num4, double d) {
		// TODO Auto-generated method stub
		return 0;
	}
}
