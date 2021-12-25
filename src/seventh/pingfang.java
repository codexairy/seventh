package seventh;
import java.util.*;;
public class pingfang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer m: ");
		int number = input.nextInt();
		
		int m = number;
		int n = 1;
		int []count = new int[10000];
		ArrayList<Integer> s1 = new ArrayList<>();
		ArrayList<Integer> s2 = new ArrayList<>();
		int i = 2;
		
		while(number != 1) {
			if(number % i == 0) {
				s1.add(i);
				number /= i;
			}
			else {
				i++;
			}
		}
		
		for(int j = 0;j < s1.size(); j++) {
			if(!s2.contains(s1.get(j))) {
				s2.add(s1.get(j));
				count[s1.get(j)]++;
			}
			else {
				count[s1.get(j)]++;
			}
		}
		
		for(int j = 0;j < s2.size(); j++) {
			if(count[s2.get(j)] % 2 != 0) {
				n *= s2.get(j);
			}
		}
		
		System.out.println("The smallest number n for m * n to be a perfect square is " + n);
		System.out.println("m * n is " + m * n);
	}

}
