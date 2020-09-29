package conversionebinario;

import java.util.ArrayList;
import java.lang.Math;

public class Numero {

	private int n;
	
	public Numero(int n){
		this.n = n;
	}
	
    public ArrayList<Integer> Conversione(int n, int bit, ArrayList<Integer> binario){
        
		  ArrayList<Integer> binario2 = new ArrayList<Integer>();
		
		  for(int i = 0; i < bit; i++){
			 binario.add(i, n % 2);
			 n = Math.floorDiv(n, 2);
		  }
		  for(int i = 0; i < bit ; i++){
			binario2.add(i, binario.get(bit - (i+1)));
		  }
		  return binario2;
	}
    
    public ArrayList<Integer> Complementare(int bit, ArrayList<Integer> binario){
		
		  ArrayList<Integer> binario2 = new ArrayList<Integer>();
		
		  for(int i = 0 ; i < bit; i++){
			  if(binario.get(i) == 0){
				  binario2.add(i, 1);
			  }
			  else{
				 binario2.add(i, 0);
			  }
		  }
		  return binario2;
	}
    
   
    	
    
    public ArrayList<Integer> Complemento1(int bit, int n){
    	
    	ArrayList<Integer> binario = new ArrayList<Integer>();
    
    	if (n >= 0) {
    		    binario = Conversione(n, bit, binario);
    	       }
    	else {  n = -n;
    	        binario = Conversione(n, bit, binario);
    	    	binario = Complementare(bit, binario);
    	   }
    	return binario;
    		 			 
    		 
    }
    	
    public ArrayList<Integer> Complemento2(int bit, int n){
    	
    	ArrayList<Integer> binario = new ArrayList<Integer>();
    	
    	if (n >= 0){
    		binario = Complemento1(bit, n);
    	}
    	else{
    		n = n+1;
    		binario = Complemento1(bit, n);
    	}
    	return binario;
    }
    
    public void Stampa(ArrayList<Integer> binario){
    	
    	for(int i = 0; i < binario.size(); i++){
			System.out.print(binario.get(i));
            }
    	System.out.println(" ");
    }
    
    
}
