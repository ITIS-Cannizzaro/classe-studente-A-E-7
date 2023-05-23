import java.util.Scanner;
public class main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				System.out.println("|--STUDENTE1--|");
				Studente studente1=new Studente();
				System.out.println(studente1.toString());
				System.out.println("|-------------|");
				
				// TODO Auto-generated method stub
				Scanner scanner1=new Scanner(System.in);
				System.out.println("inserici il nome dello studente");
				String Domanda1=scanner1.nextLine();
				
				System.out.println("inserire anno di nascita dello studente");
				int Domanda2=scanner1.nextInt();
				System.out.println("|--STUDENTE2--|");
				Studente studente2=new Studente(Domanda1,Domanda2);
				System.out.println(studente2.toString());
				System.out.println("|-------------|");
			
				
				
				if(studente1.getannoDinascita()==studente2.getannoDinascita()) {
					System.out.println("I DUE STUDENTI SONO COETANEI");
					
				}else if(studente1.getannoDinascita()<studente2.getannoDinascita()&& studente2.getannoDinascita()<studente1.getannoDinascita()) {
				System.out.println(" E' NATO PRIMA: " + studente1.getnome());}
				else {
					System.out.println(" E' NATO PRIMA: " + studente2.getnome());
				}
			
				
				
			
		





	}

}
