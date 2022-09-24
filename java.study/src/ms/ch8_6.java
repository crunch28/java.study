package ms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ch8_6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int trgValue = (int)(Math.random() * 100) + 1;

		System.out.println("1~100 사이 값을 입력하세요~");
		
		while (true) {
			try {
				int inputValue = sc.nextInt();
				if (trgValue == inputValue) {
					System.out.println("정답!");
				}else if(trgValue > inputValue){
					System.out.println("up");
				} else {
					System.out.println("down");
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자가 아님 숫자 입력하세요");
				sc.nextLine();
			}
		}
	}
}
