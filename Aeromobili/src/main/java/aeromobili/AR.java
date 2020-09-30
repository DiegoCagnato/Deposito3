package aeromobili;

public class AR extends A{

	private double cv;
	
	public AR(String sigla, double cv){
		
		super(sigla);
		this.cv = cv;
	}
	
    public double getCv(){
		
		return cv;
	}
    
    public String getCode(){
    	
    	return sigla;
    }
    
    @Override public String toString(){
    	
    	return "Aereo motore. Sigla: " + sigla + ", cavalli: " + cv;
    }
    
    @Override public boolean equals(Object oggetto){
		
		if(!(oggetto instanceof AR)) return false;
		if(oggetto == this) return true;
		
		AR aliante = (AR) oggetto;
		boolean b = this.getCode().equals(aliante.getCode()) && this.getCv() == aliante.getCv();
		return b;
	}
	
    @Override public int hashCode(){
		
		return (int)this.getCv()*31;
	}
	public boolean superiore(Object aeromobile){
		
		if(aeromobile == null) return false;
		if(!(aeromobile instanceof AR)) return false;
		
		AR aereo = (AR) aeromobile;
		boolean b = this.getCv() > aereo.getCv();
		return b;
	}
}
