package conversionebinario;

import java.util.*;
import java.lang.Math;


public class ConversioneBinario {

	public static void main(String[] args){
		
		int bit;
		int n;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("inserisci il numero di bit a disposizione");
		bit = reader.nextInt();
		System.out.println("inserisci il numero da convertire (non deve superare " 
		+ (Math.pow(2, bit-1) - 1) + " e non deve essere inferiore a " + (-Math.pow(2, bit-1)) + ")");
		n = reader.nextInt();
		
		Numero num = new Numero(n);
		
		ArrayList<Integer> binario = new ArrayList<Integer>();
		
		binario = num.Complemento1(bit, n);
		
		System.out.println("Ecco il numero in forma binaria in complemento a 1: ");
		num.Stampa(binario);
		
		binario = num.Complemento2(bit, n);
		
		System.out.println("Ecco il numero in forma binaria in complemento a 2: ");
		num.Stampa(binario);
		
		
		
	}
	
	 
}
