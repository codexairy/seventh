package seventh;
import java.util.*;
public class perfectsolve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of objects: ");
		int number = input.nextInt();
		System.out.print("Enter the weights of the objects: ");
		
		ArrayList<Integer> s = new ArrayList<>();
		int j = 0;
		int t = 0;
		for(int i = 0;i < number; i++) {
			 s.add(input.nextInt());
		}
		s.sort(Comparator.naturalOrder());
		number --;
		while(number >= j)
			if(s.get(j) + s.get(number) <= 10) {
				t++;
				System.out.println("Container " + t + " contains objects with weight " + s.get(j) +" "+ s.get(number));
				number--;
				j++;
			}
			else {
				j++;
		}
	}
}
