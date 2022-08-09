package calculatorFunctionalInterface;

public class Calculator {
	public static void main(String[] args) {
		String choice = "div";
		CalcInterface c;
		
		switch(choice) {
			case "add":
				c = (int a, int b) -> {
					System.out.println(a+b);
				};
				break;
			case "sub":
				c = (int a, int b) -> {
					System.out.println(a-b);
				};
				break;
			case "mul":
				c = (int a, int b) -> {
					System.out.println(a*b);
				};
				break;
			case "div":
				c = (int a, int b) -> {
					System.out.println(a/b);
				};
				break;
			default: 
				c = (int a, int b) -> {
					System.out.println("Select a choice!!!!");
				};
		}
		
		c.calculator(50, 10);
	}
}
