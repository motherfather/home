package game3;

public class Updown {
	public static void updown() {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int comRandom = (int) (Math.random() * 100 + 1);
			System.out.println("숫자를 입력하세요 (0 입력시 게임종료)");

			for (int i = 0; i < 5; i++) {
				int scanInt = scan.nextInt();
				if (scanInt == comRandom) {
					System.out.println("정답");
					Main.win++;
					Main.count++;
				}
			}
		}
	}
}
