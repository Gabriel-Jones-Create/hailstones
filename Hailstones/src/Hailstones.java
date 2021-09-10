import java.util.Scanner;
public class Hailstones {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive hailstone starting value");
		int input = Integer.parseInt(scan.nextLine());
		int greatest = 0; 
		int initial = input; 
		int iterations = 0;
		while(input != 1) {
			if(input % 2 == 0) {
				
				System.out.println(input);
				input = input/2;
				if(input > greatest) {
					greatest = input;
				}
				iterations++;
				
			}
			else {
				System.out.println(input);
				input = (input * 3) + 1;
				if(input > greatest) {
					greatest = input;
				}
				iterations++;
				
			}
			
			
		}
		if( initial > greatest) {
			greatest = initial;
		}
		System.out.println(1);
		System.out.println("start: "+initial);
		System.out.println("term count: "+iterations);
		System.out.println("biggest: "+ greatest);


	}
}
