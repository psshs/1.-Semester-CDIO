package matador;
public class BenytSpil {

	public static void main(String[] arg)
	{
		Spiller Asger = new Spiller("Asger",1000);
		Spiller Basti = new Spiller("Basti",10000);
		Asger.besked("test");
		Asger.transaktion(-500);
		Basti.transaktion(-500);
	}
	
	
	
	
	
	
	
	
//test komentar hilsen oivind
	/* vi laver en dice med en math  og new random
	 * fra 2 til 12
	 * denne random skal lagres i en int som senere benyttes
	 * denne int  adderes med en variabel som viser possisjonen til spilleren.
	 *  
	 * Det behøves også at skille mellem spiller1 og spiller2, 
	 */
}
