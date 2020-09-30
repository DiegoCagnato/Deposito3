package codaconpriorita;

public class Oggetto {

	public int chiave;
	public String contenuto;
	
	public Oggetto(int chiave, String contenuto){
		this.chiave = chiave;
		this.contenuto = contenuto;
	}
	
	public void stampaOggetto(){
		
		System.out.println("contenuto: " + this.contenuto);
		System.out.println("importanza: " + this.chiave);
		System.out.println("--------------------");
	}
	
	@Override public boolean equals(Object o){
		
		if(!(o instanceof Oggetto)) return false;
		if(o == this) return true;
		
		Oggetto oggetto = (Oggetto) o;
		boolean b = (oggetto.chiave == this.chiave) && (oggetto.contenuto == this.contenuto);
		return b;
		
	}
	
	@Override public int hashCode(){
		
		return this.chiave * 31;
	}
}
