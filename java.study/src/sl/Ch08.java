package sl;

import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch08 {
	public static void main(String[] args) {
		//����1 
		/*
		 * test01(true); test01(false);
		 */
		//����2
		numberOnly();
		
	}
	
	
	public static void test01(boolean b) {
		try {
			System.out.println(1);
			
			if(b) throw new ArithmeticException();
			System.out.println(2);
			
		}catch(RuntimeException r) {
			System.out.println(3);
			return;
			
		}catch(Exception e) {
			System.out.println(4);
			return;
		}finally {
			System.out.println(5);
		}
		System.out.println(6);
	}
	
	
	public static void numberOnly() {
			System.out.print("--�Է� : ");
			Scanner sc = new Scanner(new InputStreamReader(System.in));
			int ori = (int)(Math.random()*100)+1;
			System.out.println("["+ori+"]");
			
			while(true) {
				try {
					int num = sc.nextInt();
					
					if(num<1 || num>100) throw new IsHundException(num);
					
					if(num<ori) {
						System.out.println("��ū��");
					}else if(num>ori) {
						System.out.println("��������");
					}else {
						System.out.println("["+ori+"]="+num+"!����!");
						break;
					}
					
				}catch(InputMismatchException e) {
					System.out.println("���� ���ڸ� �ٽ� again");
					sc.nextLine();
				} catch (IsHundException e) {
					// TODO Auto-generated catch block
					sc.nextLine();
				}
				
			}
			
		
		
	}
	
}


