package kk;

import java.util.Scanner;

public class ch8_1 {
	public static boolean check(int scanNum, int number) {
		boolean res = false;
		
		if(1 > scanNum && scanNum > 100) {
			System.out.println("1-100 ������ ���ڰ� �ƴմϴ�.");
		} else {
			if(scanNum == 0) {
				System.out.println("NO number");
			} else if(number == scanNum) {
				System.out.println("���ڸ� ������ϴ�!");
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
		System.out.println("1-100 ������ ���ڸ� �Է��ϼ���.");
		
		do {
			try {
				scanNum = sc.nextInt();
				chk = check(scanNum, number);
			} catch(Exception e){
				System.out.println("���ڰ� �ƴ� ���ڸ� �Է��߽��ϴ�.");
				chk = false;
				sc.nextLine();
			}
			
		} while(!chk);
		
		return;
	}
}
