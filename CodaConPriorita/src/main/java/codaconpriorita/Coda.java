package codaconpriorita;

import java.util.ArrayList;

public class Coda{

      private ArrayList<Oggetto> coda; 
      
      public Coda(){
    	  
    	  this.coda = new ArrayList<Oggetto>();
      }
      
      public void inserisci(Oggetto o){
         
    	  if(coda.size() == 0) {
    		  coda.add(0, o); 
    	  }
    	  else{
    		   int i;
    	       for(i = 0; i < coda.size(); i++){
    		       if(o.chiave >= coda.get(i).chiave){ 
    		    	   coda.add(i, o);
    		    	   break;
    		       }
    	       }
    	       if(i == coda.size()) coda.add(i, o);
    	  }
      }
      
      public Oggetto trovaMin(){
    	  
    	  return coda.get(coda.size()-1);
      }
      
      public void eliminaMin(){
    	  
    	  coda.remove(coda.size()-1);
      }
      
      public Oggetto trovaMax(){
    	  
    	  return coda.get(0);
      }
      
      public void eliminaMax(){
    	  
    	  coda.remove(0);
      }
      
      public boolean trovaOggetto(Oggetto o){
    	  
    	  int i;
    	  for(i = 0; i < coda.size(); i++){
    		  if(coda.get(i).equals(o)) {
    			  break;
    		   }
    		  
    	   }
    	  if(i == coda.size()) return false;
    	  else return true;
    		  
      }
      
      public void stampaCoda(){
    	  
    	  for(int i = 0; i < coda.size(); i++){
    		  coda.get(i).stampaOggetto();
    	  }
      }
      
      
}
