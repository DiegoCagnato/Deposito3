package aeromobili;

public class Aeromobili {

	public static void main(String[] args){
		
		AL aliante1 = new AL("123456", 30.5);
		AL aliante2 = new AL("654321", 31.1);
		
		AR aereo1 = new AR("356713", 20000);
		AR aereo2 = new AR("235167", 20050);
		
		System.out.println("aliante2 è superiore ad aliante1? " + aliante2.superiore(aliante1));
		System.out.println("aereo2 è superiore ad aereo1? "+ aereo2.superiore(aereo1));
		
		System.out.println("aliante1 è superiore ad aereo2? " + aliante1.superiore(aereo2));
		
		System.out.println(aliante1.toString());
		
		System.out.println("aereo1 e aereo2 sono uguali? " + aereo1.equals(aereo2));
		
	}
}
