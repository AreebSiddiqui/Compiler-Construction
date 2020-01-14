package hello;

public class task {

	private enum States {
		Q0(false),
		Q1(false),
		Q2(true),
		Q3(true),
		Q4(false),
		Q5(true),
		Q6(false);
	
	States LessThan; 
	States GreaterThan;
	States EqualTo;

	static {
		Q0.LessThan =Q1; 		Q0.GreaterThan =Q5; 		Q0.EqualTo =Q4;
		Q1.LessThan =Q2; 		Q1.GreaterThan =Q3; 		Q1.EqualTo =Q5;

}


	final boolean accept;
	States(boolean accept) {
		this.accept = accept;
	}
	States transition (char ch) {
		switch (ch) {
			case '<': 
				return this.LessThan==null?Q5:this.LessThan;
			case '>': 
				return this.GreaterThan==null?Q5:this.GreaterThan;
			case '=': 
				return this.EqualTo==null?Q5:this.EqualTo;
			default:
			return Q5;
		}
	} 


}
public boolean check (String string) {
	States state =  States.Q0;
	for (int i = 0; i < string.length();i++) {
    state = state.transition(string.charAt(i));
		
	}
	return state.accept;
}

	public static void main(String[] args) {
		
		boolean result;
		task ob = new task();
		result = ob.check("<=");
		System.out.println(result);
		
		// TODO Auto-generated method stub
		
		/*for(int i =0 ;i <= 5; ++i) {
			for(int j=1;j<=i;++j) {
				System.out.print(j);
				
			}
			System.out.print("\n");
		}*/
		
		// for(int i =5 ;i >= 0; --i) {
		// 	for(int j=1;j<=i;++j) {
		// 		System.out.print(j);
				
		// 	}
		// 	System.out.print("\n");
		// }
		
		
		
		
		/*float maths =90;
		float science =100;
		float chemistry =87;
		float total = maths +chemistry+science;
		float percentage = (total/300) *100;
		System.out.println(percentage); */
		
		
		/*int number = (int)(Math.random() * 3);
		System.out.print(number);
		Scanner inp = new Scanner(System.in);
		int input = inp.nextInt();
		if (input == 0 && number == 1) {
			System.out.println("Sissor(0), rock(1), paper(2)");
			System.out.println("The computer is scissor, you are rock you won");
		}
		else if (input == 1 && number == 0) {
			System.out.println("Sissor(0), rock(1), paper(2)");
			System.out.println("The computer is rock, you are scissor you lose");
		}*/
		
		
		
		/*Scanner inp = new Scanner(System.in);
		int input = inp.nextInt();
		
		if (input == 0) {
		Scanner i = new Scanner(System.in);
		int c = i.nextInt();
		
		int farienhiet  = c * (9/5) + 32;
			System.out.println(farienhiet);

		}
		
		else if (input == 1) {
			Scanner i = new Scanner(System.in);
			int f = i.nextInt();
			
			int celcius  = f * (5/9) - 32;
				System.out.println(celcius);
				

			
		}*/
		
		
		
}
}