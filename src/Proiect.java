import java.util.Scanner;

public class Proiect {

	public static void main(String[] args)
	
	{ System.out.println("Meniu: ");
	System.out.println("1) Mic dejun ");
	System.out.println("2) Pranz");
	System.out.println("3) Cina");
	
		Scanner obj = new Scanner(System.in);
	
		System.out.println("Alegeti de la 1 la 3:  ");
		String alegere = obj.nextLine(); 
		
		int choice = Integer.valueOf(alegere).intValue();
		System.out.println("Ati ales: ");
		switch(choice)
		{ 
		case 1: System.out.println("Mic dejun -> Pret: 10 lei");
		break;
		
		case 2: System.out.println("Pranz -> Pret: 20 lei");
		break;
		
		case 3: System.out.println("Cina -> Pret: 25 lei");
		break;
		}
		
	}
}
