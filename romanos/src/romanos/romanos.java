package romanos;

import java.util.Scanner;

public class romanos {
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		int x, i;
		 int decimales[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10,9, 5, 4, 1};
		 String Romanos []= {"M", "CM", "D", "CD", "C", "XC","L","XL","X","IX", "V" ,"IV", "I" };
		 System.out.println("Ingresa un numero decimal para convertirlo a Romano");
		 x= entrada.nextInt();
		 while (true) {
			 
			 if(x==0) {
				 break;
			 }
			 
			 i = 0;
			 while (x> 0) {
				 if(x >= decimales[i]) {
					 System.out.print(Romanos[i]);
					 x = x - decimales[i];
				 }else {
					 i = i+1;
				 }
			 }
				 
				 
			 
				 
		 }

	}

}
