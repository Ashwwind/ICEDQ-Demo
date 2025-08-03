package automationTask;

public class CheckEvenOddInMethod {

	boolean flag = true;

	public int isEven(int n) {
		if (n % 2 == 0) {
			System.out.println(flag);
			return n;

		} else {
			flag = false;
			System.out.println(flag);
		}
		return n;

	}

	public static void main(String[] args) {

		CheckEvenOddInMethod Obj = new CheckEvenOddInMethod();
		Obj.isEven(2);

	}

}
