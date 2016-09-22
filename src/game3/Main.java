package game3;

import java.util.*;

public class Main {
	public static int count;
	public static int win;
	public static int lose;
	private static int num;
	
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("게임선택");
			System.out.println("1.가위바위보 2.주사위숫자맞추기 3.숫자Up&Down (0 입력시 종료)");
			num = scan.nextInt();
			
			if (num == 1) {
				R_S_P.rsp();
			} else if (num == 2) {
				Dice.dice();				
			} else if (num == 3) {
				
			} else if (num == 0) {
				System.out.println("-게임종료-");
				break;
			} else {
				System.out.println("숫자를 잘못 입력!!!");
				continue;
			}
			show();
			
			
		}
		scan.close();
	}

	public static void show() {
		System.out.println(count + "전 " + win + "승 " + lose + "패");
	}
}
