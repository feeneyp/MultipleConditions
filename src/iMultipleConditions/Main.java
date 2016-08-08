package iMultipleConditions;

public class Main {

	public static void main(String[] args) {
		int age = 17;
		String gender = "male";
		if (age<18 && gender.equalsIgnoreCase("male"))  {
			System.out.println("boy");
		}
		else {
			if (age<18) {  //clearly <18 and female
				System.out.println("girl");
			}
			else { // >=18  
				if (gender.equalsIgnoreCase("male")) {  // >18 and male
				System.out.println("man");
				}
				else {
				System.out.println("woman");  // female 
				}
			}
		}
	}
}
