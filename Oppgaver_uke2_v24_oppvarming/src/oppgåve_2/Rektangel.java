package oppgåve_2;

public class Rektangel implements Figur {
	private double høgde;
	private double breidde;
	
	public Rektangel(double høgde, double breidde) {
		this.høgde = høgde;
		this.breidde = breidde;
	}

	@Override
	public double areal() {
		return høgde * breidde;
	}

	@Override
	public void tegn() {
		for(int i = 0; i < høgde; i++) {
			for(int j = 0; j < breidde; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
