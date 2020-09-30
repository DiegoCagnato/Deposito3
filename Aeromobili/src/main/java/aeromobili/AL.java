package aeromobili;


public class AL extends A{

	private double eff;
	
	public AL(String sigla, double eff){
		
		super(sigla);
		this.eff = eff;
	}
	
	public double getEff(){
		
		return eff;
	}
	
	public String getCode(){
		
		return sigla;
	}
	
	@Override public String toString(){
		
		return "Aliante. Sigla: " + sigla + ", efficienza: " + eff;
	}
	
	@Override public boolean equals(Object oggetto){
		
		if(!(oggetto instanceof AL)) return false;
		if(oggetto == this) return true;
		
		AL aliante = (AL) oggetto;
		boolean b = this.getCode().equals(aliante.getCode()) && this.getEff() == aliante.getEff();
		return b;
	}
	
	@Override public int hashCode(){
		
		return (int)this.getEff()*31;
	}
	
	
    public boolean superiore(Object aeromobile){
		
	
    	if(aeromobile == null) return false;
		if(!(aeromobile instanceof AL)) return false;
		AL aliante = (AL) aeromobile;
		
		boolean b = this.getEff() > aliante.getEff();
		
		return b;
	}
}
