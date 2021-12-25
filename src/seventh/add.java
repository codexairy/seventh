package seventh;
import java.util.*;
public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random()*10);
		
		ArrayList<Integer> s = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		System.out.print("What is " + number1 +" + " +number2 + "?");
		int answer = input.nextInt();
		
		while(number1 + number2 != answer) {
			if(s.contains(answer)) {
				System.out.println("You already entered " + answer);
			}
			else {
				s.add(answer);
			}
			System.out.print("Wrong answer. Try again. What is " + number1 +" + " +number2 + "?");
			answer = input.nextInt();
		}
		System.out.println("You got it!");
	}

}
