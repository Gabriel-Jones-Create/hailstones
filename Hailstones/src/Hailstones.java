import java.util.Scanner;

public class Hailstones {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);// creates a scanner for user input
		System.out.println("Enter a positive hailstone starting value");// creates a prompt for scanner
		int input = Integer.parseInt(scan.nextLine()); // sets the user input to a variable
		int greatest = 0; // initiates variable that tracks greatest number
		int initial = input; // sets a variable that stores the original number because input is changed in
								// the loops
		int iterations = 0; // counts the number of iterations
		while (input != 1) {
			if (input % 2 == 0) { // if the value is even, then it divides it by 2 then saves it

				System.out.println(input);
				input = input / 2;
				if (input > greatest) {// if the number from that part is greater than a previous number, it sets it to
										// the greatest number
					greatest = input;
				}
				iterations++; // adds to the iterations variable for every iteration

			} else { // if number is not even then multiplies it by 3 and adds 1
				System.out.println(input);
				input = (input * 3) + 1;
				if (input > greatest) {// if the number from that part is greater than a previous number, it sets it to
										// the greatest number
					greatest = input;
				}
				iterations++;// adds to the iterations variable for every iteration

			}

		}
		if (initial > greatest) { // if the initial number is greater than any number made by the hailstones
									// program then it sets that to the greatest number
			greatest = initial;
		}
		System.out.println(1); // prints the final one in the sequence
		System.out.println("start: " + initial); // prints the initially input number
		System.out.println("term count: " + iterations); // prints the term count as the number of iterations the
															// program went through
		System.out.println("biggest: " + greatest); // prints biggest number as the greatest variable

	}
}
