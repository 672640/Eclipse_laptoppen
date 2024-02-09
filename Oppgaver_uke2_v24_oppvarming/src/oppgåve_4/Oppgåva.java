package oppgåve_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Oppgåva {

	public static void main(String[] args) {
		Set<String> mengde1 = new HashSet<>();
		
		mengde1.add("Hei");
		mengde1.add("Halloen");
		mengde1.add("Hei");
		
		Set<String> mengde2 = new HashSet<>();
		mengde2.add("Hallaisen");
		mengde2.add("Hei");
		mengde2.add("Hallo");
		mengde2.add("Hei");
		mengde2.add("Hallo");
		for(String ut1: mengde1) {
			System.out.print(ut1 + " ");
		}
		for(String ut2: mengde2) {
			System.out.print(ut2 + " ");
		}
		
		Set<String> snitt = new HashSet<String>(mengde1);
		snitt.retainAll(mengde2);
		System.out.println("\n" + "Snittet av mengdene er:");
		System.out.println(snitt);
		
		Set<String> union = new HashSet<String>(mengde1);
		union.addAll(mengde2);
		System.out.println("Unionen av mengdene er:");
		System.out.println(union);
		
	}
}
