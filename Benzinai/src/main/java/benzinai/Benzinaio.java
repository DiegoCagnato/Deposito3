package benzinai;

public class Benzinaio implements Comparable<Benzinaio>{

	private String citt�;
	private String proprietario;
	private double capacit�;
	private double benzina;
	private double incasso;
	
	public final double prezzolitro = 1.5; 
	
	public Benzinaio(String citt�, String proprietario, double capacit�, double benzina){
		this.citt� = citt�;
		this.proprietario = proprietario;
		this.capacit� = capacit�;
		this.benzina = benzina;
		
	}
	
	public void erogazione(double benzina){
		if(this.benzina - benzina > 0){
			this.benzina = this.benzina - benzina;
		    incasso = incasso + benzina * prezzolitro;
		  }
		else{
			System.out.println("non c'� abbastanza benzina");
		}
	}
	
	public void incasso(){
		System.out.println("Incasso: " + incasso);
		System.out.println("-----------");
	}
	
	public void dispbenzina(){
		System.out.println("disponibilit� benzina: " + benzina);
		System.out.println("------------");
	}
	
	public void caratteristiche(){
		System.out.println("caratteristiche benzinaio: ");
		System.out.println("proprietario: " + proprietario);
		System.out.println("citt�: " + citt�);
		System.out.println("------------");
			
	}
	
	public int compareTo(Benzinaio benzinaio){
		if(capacit� > benzinaio.capacit�) return 1;
		if(capacit� < benzinaio.capacit�) return -1;
		return 0;
		}
			
	
}
