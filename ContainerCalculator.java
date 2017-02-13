import java.util.Scanner;

public class ContainerCalculator 
{
	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		int height = 0;
		int diameter = 0;
		double surfaceArea = 0.0;
		double volume = 0.0;
		double radius = 0.0; 
		
		System.out.println("Welcome to the Container Calculator!"); //Starting statement.
		System.out.println("====================================");
		
		 //User prompts to get the diameter and height of the cylinder.
		
		System.out.println("Enter the diameter of a cylinder (in centimeters): ");
		diameter = scnr.nextInt();
		System.out.println("");
		
		System.out.println("Enter the height of a cylinder (in centimeters): ");
		height = scnr.nextInt();
		System.out.println("");
		
	}


	private static int inputChecker(Scanner scnr) {
		int i = 0;
		int diameter = -1;
		int height = -1;
		while (i==0){
			while (!scnr.hasNextInt()) {
				System.out.println("Please enter an integer value (less than 2,147,483,648) as decimal: ");
				scnr.nextLine();
			}
		
			while (scnr.hasNextInt()){
				diameter = scnr.nextInt();
				// check to see if it is negative or past a 32-bit range (within range)
				if ((diameter >= 0) && (diameter < 2147483647)) {
					i++;
					return diameter;
				}
				else {
					System.out.println("Please enter an integer value (less than 2,147,483,648) as decimal digits: ");
					scnr.nextLine();
				}
			}
			
		}
		return -1;
	}

	
			
		

	/*VOLUME CALCULATIONS: Calculations: v = pi(r^2)h */
		radius = diameter / 2.0; 
		volume = Math.PI * Math.pow(radius,  2.0) * height;
		
		System.out.println("A can with a diameter of " + diameter + " and a height of " + height + " has ");
		System.out.print("\ta volume of ");
		System.out.printf("%.2f", volume);
		System.out.println(","); 
		/*SURFACE AREA CALCULATIONS: A = 2pirh + 2pir^2 */
		surfaceArea = (2.0 * Math.PI * radius * height) + (2.0 * Math.PI * Math.pow(radius, 2.0));
		
		System.out.print("\tand a surface area of ");
		System.out.printf("%.2f", surfaceArea);
		System.out.print(".");
		System.out.println("");
		
		
		System.out.println("=============================================");
		System.out.println("Thank you for using the Container Calculator."); 
}
		
