package ms;

public class ch8_5 {

	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b) {
				throw new ArithmeticException();
			}
			System.out.println(2);
		} catch (ArithmeticException e) {
			System.out.println("222");
			return;
		}catch (RuntimeException e) {
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}
	
	public static void main(String[] args) {
		method(true);
		method(false);
	}
}
