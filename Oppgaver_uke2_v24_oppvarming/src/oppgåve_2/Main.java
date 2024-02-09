package oppgåve_2;

public class Main {

	public static void main(String[] args) {
		Rektangel rektangel = new Rektangel(2, 3);
		Trekant trekant = new Trekant(2);
		
		System.out.println("Areal: " + rektangel.areal());
		System.out.println("Areal: " + trekant.areal());
		System.out.println("Det totale arealet: " + (double)(rektangel.areal() + (trekant.areal())));
		System.out.println(rektangel.areal() + trekant.areal());
		
		rektangel.tegn();
		System.out.println();
		trekant.tegn();
	}

}
