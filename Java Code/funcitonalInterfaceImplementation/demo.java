package funcitonalInterfaceImplementation;

public class demo {

	public static void main(String[] args) {

		Message msg = () -> {
			System.out.println("This is example of Functional Interface!!!!");
		};
		
		msg.quotation();
	}

}
