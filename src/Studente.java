
public class Studente {
	String nome;
	int annoDinascita;
	
	public Studente(String nome ,int annoDinascita ) {
		this.nome=nome;
		this.annoDinascita=annoDinascita;
		
	}
	public String getnome() {
		return nome;
	}
	public int getannoDinascita() {
		return annoDinascita;
	}
	public Studente() {
		nome="Marco";
		annoDinascita =120316;
	
}
	public String toString() {
		return nome +  " "+ " "+ annoDinascita;
	}
	
	
		

		



}
