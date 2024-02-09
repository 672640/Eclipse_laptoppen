package oppgåve_2;

public class Trekant implements Figur {
	private double sideLengde;
	
	public Trekant(double sideLengde) {
		this.sideLengde = sideLengde;
	}
	@Override
	public double areal() {
		return (sideLengde * sideLengde)/2;
	}

	@Override
	public void tegn() {
		for(int i = 0; i < sideLengde; i++) {
			for(int j = 0; j <= i; j++)
			System.out.print("*");
			System.out.println();
		}
	}

}
