package game3;

import java.util.*;

public class Dice {
	public static void dice() {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int com = (int) (Math.random() * 6 + 1);
			System.out.println("주사위 숫자를 맞춰보세요 (0 입력시 돌아가기)");
			int me = scan.nextInt();

			if (me == com) {
				System.out.println("정답");
				Main.count++;
				Main.win++;
				Main.show();
			} else if (me == 0) {
				break;
			} else if(me > 6) {
				System.out.println("오타");
			} else {
				System.out.println("오답");
				Main.count++;
				Main.lose++;
				Main.show();
			}
		}
	}
}
