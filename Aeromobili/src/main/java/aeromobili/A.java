package aeromobili;

public abstract class A {

	protected String sigla;
	
	public A(String sigla){
		
		this.sigla = sigla;
	}
	
	public String get(){
		
		return sigla;
	}
	
	@Override public String toString(){
		
		return "Aeromobile: " + sigla;
	}
	
	@Override public boolean equals(Object oggetto){
		
		if(!(oggetto instanceof A)) return false;
		if(oggetto == this) return true;
		
		A aliante = (A) oggetto;
		boolean b = this.get().equals(aliante.get());
		return b; 
	}
	
	@Override public int hashCode(){
		
		return 31;
	}
	
	public interface CMP{
		
		public boolean superiore(CMP x);
	}
}
