package gitTesting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example tempExample = new Example();
		
		double test = tempExample.add();		
		System.out.println(
				"The add method of tempExample returned the following value: "
				+ test);
		
		test = tempExample.subtract();		
		System.out.println(
				"The subtract method of tempExample returned the following value: "
				+ test);
		
		test = tempExample.multiply();
		System.out.println(
				"The multiply method of tempExample returned the following value: "
				+ test);
		
		test = tempExample.divide();
		System.out.println(
				"The divide method of tempExample returned the following value: "
				+ test);
	}

}
