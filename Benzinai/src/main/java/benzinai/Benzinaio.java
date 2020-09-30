package benzinai;

public class Benzinaio implements Comparable<Benzinaio>{

	private String città;
	private String proprietario;
	private double capacità;
	private double benzina;
	private double incasso;
	
	public final double prezzolitro = 1.5; 
	
	public Benzinaio(String città, String proprietario, double capacità, double benzina){
		this.città = città;
		this.proprietario = proprietario;
		this.capacità = capacità;
		this.benzina = benzina;
		
	}
	
	public void erogazione(double benzina){
		if(this.benzina - benzina > 0){
			this.benzina = this.benzina - benzina;
		    incasso = incasso + benzina * prezzolitro;
		  }
		else{
			System.out.println("non c'è abbastanza benzina");
		}
	}
	
	public void incasso(){
		System.out.println("Incasso: " + incasso);
		System.out.println("-----------");
	}
	
	public void dispbenzina(){
		System.out.println("disponibilità benzina: " + benzina);
		System.out.println("------------");
	}
	
	public void caratteristiche(){
		System.out.println("caratteristiche benzinaio: ");
		System.out.println("proprietario: " + proprietario);
		System.out.println("città: " + città);
		System.out.println("------------");
			
	}
	
	public int compareTo(Benzinaio benzinaio){
		if(capacità > benzinaio.capacità) return 1;
		if(capacità < benzinaio.capacità) return -1;
		return 0;
		}
			
	
}
