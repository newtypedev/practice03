package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=0;
		int b=0;
		Operation op ;
		while( true ) {
		
			String value = scanner.nextLine();
			
			String[] str = value.split(" ");
			
		
			if(str.equals("quie")){
				break;
			}
			
			
			a = Integer.valueOf(str[0]);
			
			b = Integer.valueOf(str[2]);
			
			if(str[1].equals("+")){
				op = new Add();
				op.setValue(a, b);
				int result = op.calculate();
				System.out.println(result);
			}
			else if (str[1].equals("-")){
				op = new Sub();
				op.setValue(a, b);
				int result = op.calculate();
				System.out.println(result);
			}
			else if(str[1].equals("*")){
				op = new Mul();
				op.setValue(a, b);
				int result = op.calculate();
				System.out.println(result);
			}
			else if (str[1].equals("/")){
				op = new Div();
				op.setValue(a, b);
				int result = op.calculate();
				System.out.println(result);
				
			}
			
		
	
		}
		
		

	}

}
