package codaconpriorita;

import java.util.ArrayList;

public class CodaConPriorita {

	public static void main(String[] args){
		
		Coda lista = new Coda();
		
		Oggetto lampada = new Oggetto(8, "lampada");
		Oggetto lavatrice = new Oggetto(8, "lavatrice");
		Oggetto stendino = new Oggetto(7, "stendino");
		Oggetto pentola = new Oggetto(9, "pentola");
		Oggetto tv = new Oggetto(4, "tv");
		Oggetto letto = new Oggetto(10, "letto");
		Oggetto divano = new Oggetto(8, "divano");
		Oggetto tappeto = new Oggetto(1, "tappeto");
		
		lista.inserisci(lampada);
		lista.inserisci(lavatrice);
		lista.inserisci(stendino);
		lista.inserisci(pentola);
		lista.inserisci(tv);
		lista.inserisci(divano);
		lista.inserisci(letto);
		lista.inserisci(tappeto);
		
		System.out.println("Oggetto meno importante nella lista: ");
		lista.trovaMin().stampaOggetto();
		
		System.out.println("Oggetto più importante nella lista: ");
		lista.trovaMax().stampaOggetto();
		
		lista.stampaCoda();
		
		Oggetto tavolo = new Oggetto(8, "tavolo");
		
		System.out.println("lampada presente? " +lista.trovaOggetto(lampada));
		System.out.println("tavolo presente? " +lista.trovaOggetto(tavolo));
		
		System.out.println("-------------");
		
		lista.eliminaMax();
		
		System.out.println("coda con oggetto più importante eliminato: ");
		System.out.println(" ");
		lista.stampaCoda();
	}
}
