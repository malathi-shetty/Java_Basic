package interface_test;

public class B implements Testing {

	@Override
	public void m1() {

		System.out.println("yes");
	}

	public void m2() {

		System.out.println("yo");
	}

	public static void main(String[] args) {
		Testing.m3();

	}

}
