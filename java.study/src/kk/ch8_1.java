package kk;

import java.util.Scanner;

public class ch8_1 {
	public static boolean check(int scanNum, int number) {
		boolean res = false;
		
		if(1 > scanNum && scanNum > 100) {
			System.out.println("1-100 사이의 숫자가 아닙니다.");
		} else {
			if(scanNum == 0) {
				System.out.println("NO number");
			} else if(number == scanNum) {
				System.out.println("숫자를 맞췄습니다!");
				res = true;
			} else if(number > scanNum){
				System.out.println("Up!");
			} else {
				System.out.println("Down!");
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		int number = (int)(Math.random()*100)+1;
		int scanNum = 0;
		boolean chk =false;
		Scanner sc = new Scanner(System.in);
		System.out.println("1-100 사이의 숫자를 입력하세요.");
		
		do {
			try {
				scanNum = sc.nextInt();
				chk = check(scanNum, number);
			} catch(Exception e){
				System.out.println("숫자가 아닌 문자를 입력했습니다.");
				chk = false;
				sc.nextLine();
			}
			
		} while(!chk);
		
		return;
	}
}
