package iMultipleConditions;

public class Main {

	public static void main(String[] args) {
		int age = 17;
		String gender = "female";
		boolean young = age < 18;
		if (young && gender.equalsIgnoreCase("male"))  {
			System.out.println("boy");
		}
		else if (young) { //must then be female
			System.out.println("girl");
		}
		else if (gender.equalsIgnoreCase("male")) { //not young so must be man
			System.out.println("man");
		}
		else {  // not young, not male so must be woman
			System.out.println("woman");   
				}
		}
}
