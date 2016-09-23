package game3;

import java.util.Scanner;

public class Updown {
	public static void updown() {
		Scanner scan = new Scanner(System.in);
		int max = 100;
		int min = 1;

		End: while (true) {
			int comRandom = (int) (Math.random() * 100 + 1);
			System.out.println("숫자를 입력하세요 (0 입력시 게임종료)");

			for (int i = 0; i < 5; i++) {
				int scanInt = scan.nextInt();
				if (scanInt == 0)
					break End;
				if (scanInt == comRandom) {
					System.out.println("정답");
					Main.count++;
					Main.win++;
					// Main.count++;
				} else if (scanInt > comRandom) {
					System.out.println("더 낮게");
					if (scanInt < max)
						max = scanInt;
					System.out.println(min + " ~ " + max);
				} else if (scanInt < comRandom) {
					System.out.println("더 높게");
					if (scanInt > min)
						min = scanInt;
					System.out.println(min + " ~ " + max);
				}
			}
			System.out.println("정답은 " + comRandom + "입니다.");
			Main.count++;
			Main.lose++;
		}
	}
}
