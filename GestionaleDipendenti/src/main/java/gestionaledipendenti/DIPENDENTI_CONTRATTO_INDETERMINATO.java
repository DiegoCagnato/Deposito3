package gestionaledipendenti;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public enum DIPENDENTI_CONTRATTO_INDETERMINATO {

	DIPENDENTE_1("Piero", "Chiambretti", 1800),
	DIPENDENTE_2("Paolo", "Bonolis", 2000),
	DIPENDENTE_3("Paola", "Perego", 2100),
	DIPENDENTE_4("Jerry", "Scotti", 1500),
	DIPENDENTE_5("Simona", "Ventura", 1900);
	
	private String nome;
	private String cognome;
	private double stipendioBase;
	
	private DIPENDENTI_CONTRATTO_INDETERMINATO(String nome, String cognome, double stipendioBase){
		
		this.nome = nome;
		this.cognome = cognome;
		this.stipendioBase = stipendioBase;
	}
	
	
	public String getName(){
		
		return nome;
	}
	
	public String getSurname(){
		
		return cognome;
	}
	
	public double getSalary(){
		
		return stipendioBase;
	}
	
	public void setName(String nome){
		
	     this.nome = nome;
	}
	
	public void setSurname(String cognome){
		
		this.cognome = cognome;
	}
	
	public void setSalary(double stipendioBase){
		
		this.stipendioBase = stipendioBase;
	}
	
	public void modifySalary(double s){
		
		this.stipendioBase = this.stipendioBase + s;
	}
	
	public Map <EMesi, Double> mappaBonusMalus = new HashMap<>();
	
	public void fillMap(){
		
		Scanner reader = new Scanner(System.in);
		
		for(EMesi m : EMesi.values()){
			double s;
			System.out.println("inserisci il BonusMalus del mese " + m + " di " + this.getSurname());
			s = reader.nextDouble();
			mappaBonusMalus.put(m, s);
			this.modifySalary(s);
		}
		
	}

}
