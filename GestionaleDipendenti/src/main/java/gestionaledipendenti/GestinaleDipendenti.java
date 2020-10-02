package gestionaledipendenti;

import java.util.*;

public class GestinaleDipendenti {
	
	
	public static void main(String[] args){
		
		String s1, s2, s3;
		
		ArrayList<DIPENDENTI_CONTRATTO_INDETERMINATO> lista = 
				   new ArrayList<DIPENDENTI_CONTRATTO_INDETERMINATO>(5);
				   
		GestioneUtenti dipendenti = new GestioneUtenti(lista);
		
		dipendenti.RemoveAndAdd(lista);
		
		for(int i = 0; i < lista.size(); i++){
			 
			lista.get(i).fillMap();
		}
		
		
		s1 = dipendenti.getLowest(lista);
		
		System.out.println("dipendente con stipendio più basso (bonusmalus considerati): " + s1);
		
		s2 = dipendenti.getWorst(lista);
		
		System.out.println("dipendente con malus più alti: " + s2);
		
		System.out.println("sono lo stesso dipendente? " + dipendenti.checkLowestWorst(s1, s2));
		
		s3 = dipendenti.getBetter(lista);
		
		System.out.println("dipendente con bonus più alti: " + s3);
		
		s3 = dipendenti.getHigher(lista);
		
		System.out.println("dipendente con stipendio più alto (bonusmalus considerati): " + s3);
		
		
	}
}
