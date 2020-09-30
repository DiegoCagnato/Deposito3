package benzinai;

public class Benzinai {
	
	public static void main(String[] args){
		
		int i;
		
		Benzinaio erg = new Benzinaio("Milano", "Paolo", 10000, 10000);
		Benzinaio agip = new Benzinaio("Lucca", "Luigi", 15000, 15000);
		
		agip.erogazione(40);
		erg.erogazione(60);
		agip.erogazione(60);
		erg.erogazione(30);
		agip.erogazione(20);
		erg.erogazione(60);
		
		agip.caratteristiche();
		agip.incasso();
		agip.dispbenzina();
		erg.caratteristiche();
		erg.incasso();
		erg.dispbenzina();
		
		i = agip.compareTo(erg);
		
		switch(i){
		case 1:
			System.out.println("il benzinaio di Luigi ha più benzina di quello di Paolo");
			break;
		case -1:
			System.out.println("il benzinaio di Paolo ha più benzina di quello di Luigi");
			break;
		default:
			System.out.println("i benzinai di Paolo e Luigi hanno la stessa quantità di benzina a disposizione");
		}
	}

}
