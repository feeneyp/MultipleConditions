package iMultipleConditions;

public class Main {

	public static void main(String[] args) {
		int age = 17;
		String gender = "male";
		boolean young = age < 18;
		if (young && gender.equalsIgnoreCase("male"))  {
			System.out.println("boy");
		}
		else {
			if (young) {  //must then be female
				System.out.println("girl");
			}
			else { //not young so must be man or woman
				if (gender.equalsIgnoreCase("male")) {
				System.out.println("man");
				}
				else {
				System.out.println("woman");  // female 
				}
			}
		}
	}
}
