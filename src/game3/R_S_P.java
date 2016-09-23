package game3;

import java.util.*;

public class R_S_P {

	public static void rsp() {
		Scanner scan = new Scanner(System.in);
		// Random r = new Random(3);
		// int r1 = r.nextInt(3);

		End: while (true) {
			while (true) {
				int r1 = (int) (Math.random() * 3); // 바위=0 가위=1 보=2
				System.out.println("가위, 바위, 보 입력 (0 입력시 종료)");

				String str = scan.nextLine();

				if (str.equals("가위")) {
					if (r1 == 0) {
						System.out.println("패");
						Main.count++;
						Main.lose++;
						break;
					} else if (r1 == 1) {
						System.out.println("무");
						continue;
					} else {
						System.out.println("승");
						Main.count++;
						Main.win++;
						break;
					}

				} else if (str.equals("바위")) {
					if (r1 == 0) {
						System.out.println("무");
						continue;
					} else if (r1 == 1) {
						System.out.println("승");
						Main.count++;
						Main.win++;
						break;
					} else {
						System.out.println("패");
						Main.count++;
						Main.lose++;
						break;
					}

				} else if (str.equals("보")) {
					if (r1 == 0) {
						System.out.println("승");
						Main.count++;
						Main.win++;
						break;
					} else if (r1 == 1) {
						System.out.println("패");
						Main.count++;
						Main.lose++;
						break;
					} else {
						System.out.println("무");
						continue;
					}

				} else if (str.equals("0")) {
					break End;
				} else {
					System.out.println("오타!");
				}
			}
			// scan.close();
		}
	}
}
