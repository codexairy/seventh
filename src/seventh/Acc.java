package seventh;

public class Acc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account object=new Account("George", 1122, 1000);  
		object.setRate(0.015);
		
		object.deposit(30);
		object.deposit(40);
		object.deposit(50);
		
		object.withDraw(5);
		object.withDraw(4);
		object.withDraw(2);
		
		System.out.println("�˻����������֣� "+object.getName()
					+ "\n����: "+object.getRate()
					+ "\n��֧� "+object.getBalance()
					+ "\n���еĽ���:"+object.toString());

	}

}
