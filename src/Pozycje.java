
public class Pozycje {

	String nazwaTowaru;
	int ileSztuk;
	double cena;
	
	public Pozycje (String nazwa, int ilosc, double cena) {
		nazwaTowaru = nazwa;
		ileSztuk = ilosc;
		this.cena = cena;	
	}
	
	public double obliczWartosc() {
		return ileSztuk*cena;
		
	}
	
	public String toString() {
		String nazwa = nazwaTowaru;
		int sztuki = ileSztuk;
		this.cena = cena;
		
		return String.format("%s"+""+"%20.2f"+" z³ "+"%4d"+" szt. "+"%10.2f"+" z³", nazwa, cena, sztuki, obliczWartosc());
		
	}
	
	
}
