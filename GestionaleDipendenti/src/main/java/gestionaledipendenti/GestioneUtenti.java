package gestionaledipendenti;

import java.util.*;

public class GestioneUtenti {
	
			
	public GestioneUtenti(ArrayList<DIPENDENTI_CONTRATTO_INDETERMINATO> lista){
		
		lista.add(0, DIPENDENTI_CONTRATTO_INDETERMINATO.DIPENDENTE_1);
		lista.add(1, DIPENDENTI_CONTRATTO_INDETERMINATO.DIPENDENTE_2);
		lista.add(2, DIPENDENTI_CONTRATTO_INDETERMINATO.DIPENDENTE_3);
		lista.add(3, DIPENDENTI_CONTRATTO_INDETERMINATO.DIPENDENTE_4);
		lista.add(4, DIPENDENTI_CONTRATTO_INDETERMINATO.DIPENDENTE_5);
	}
	
	
	public void RemoveAndAdd(ArrayList<DIPENDENTI_CONTRATTO_INDETERMINATO> lista){
		String s;
		Scanner reader = new Scanner(System.in);
		DIPENDENTI_CONTRATTO_INDETERMINATO dipendente = null;
		
		System.out.println("Chi vuoi rimuovere (cognome)? ");
		s = reader.nextLine();
		
		for(int i = 0 ; i < 5; i++){
			
			if(lista.get(i).getSurname().equals(s)) dipendente = lista.get(i);
		}
		
		if(dipendente == null){
			System.out.println("dipendente da rimuovere non trovato!");
		}
		else{
			double x;
			System.out.println("nome del dipendente da inserire: ");
			s = reader.nextLine();
			dipendente.setName(s);
			System.out.println("cognome del dipendente da inserire: ");
			s = reader.nextLine();
			dipendente.setSurname(s);
			System.out.println("salario del dipendente da inserire");
			x = reader.nextDouble();
			dipendente.setSalary(x);	
		}
	}
	
	
	
	public String getWorst(ArrayList<DIPENDENTI_CONTRATTO_INDETERMINATO> lista){
		
		DIPENDENTI_CONTRATTO_INDETERMINATO dipendente = lista.get(0);
		double malus = 0;
		double grtMalus = 0;
		for(int i = 0; i<5 ; i++){
			
			for(EMesi m : EMesi.values()){
				
					malus = malus - lista.get(i).mappaBonusMalus.get(m);	
			}
			
			if (malus > grtMalus){ 
				grtMalus = malus;
				dipendente = lista.get(i);
			}
			malus = 0;
		}
		System.out.println("greatest malus: " + grtMalus);
		return dipendente.getName() + " " + dipendente.getSurname();
	}
	
	
public String getBetter(ArrayList<DIPENDENTI_CONTRATTO_INDETERMINATO> lista){
		
		DIPENDENTI_CONTRATTO_INDETERMINATO dipendente = lista.get(0);
		double bonus = 0;
		double grtBonus = 0;
		for(int i = 0; i<5 ; i++){
			
			for(EMesi m : EMesi.values()){
				
					bonus = bonus + lista.get(i).mappaBonusMalus.get(m);	
			}
			
			if (bonus > grtBonus){ 
				grtBonus = bonus;
				dipendente = lista.get(i);
			}
			bonus = 0;
		}
		System.out.println("greatest bonus: " + grtBonus);
		return dipendente.getName() + " " + dipendente.getSurname();
	}
	


	public String getLowest(ArrayList<DIPENDENTI_CONTRATTO_INDETERMINATO> lista){
		
		DIPENDENTI_CONTRATTO_INDETERMINATO dipendente = lista.get(0);
		double wrstSalary = dipendente.getSalary();
		
		for(int i = 1; i<5; i++){
			
			if(lista.get(i).getSalary() < wrstSalary){
				dipendente = lista.get(i);
				wrstSalary = dipendente.getSalary();
			}
		}
		System.out.println("stipendio più basso: " + wrstSalary);
		return dipendente.getName() + " " + dipendente.getSurname();
	}	
	
	
public String getHigher(ArrayList<DIPENDENTI_CONTRATTO_INDETERMINATO> lista){
		
		DIPENDENTI_CONTRATTO_INDETERMINATO dipendente = lista.get(0);
		double bstSalary = dipendente.getSalary();
		
		for(int i = 1; i<5; i++){
			
			if(lista.get(i).getSalary() > bstSalary){
				dipendente = lista.get(i);
			    bstSalary = dipendente.getSalary();
			}
		}
		System.out.println("stipendio più alto: " + bstSalary);
		return dipendente.getName() + " " + dipendente.getSurname();
	}	


	
	public boolean checkLowestWorst(String s1, String s2){
		
		if(s1.equals(s2)) return true;
		else return false;
	}
			
}
