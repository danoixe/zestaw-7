public class Main{

public static void main(String [] args) {
	
Pozycje p1 = new Pozycje("Chleb", 1, 3.5);
System.out.println(p1);

Pozycje p2 = new Pozycje("Cukier", 3, 4);
System.out.println(p2);

Zamowienie z = new Zamowienie(20);
z.dodajPozycje(p1);
z.dodajPozycje(p2);
System.out.println(z);
}
}