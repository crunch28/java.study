package sl;

public class IsHundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public IsHundException() {
		
	}
	public IsHundException(int s) {
		System.out.println(s+"는 범위벗어남...다시 입력하세요.");
	}

}
