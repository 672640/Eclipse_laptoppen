package oppgåve_3;

import java.util.ArrayList;
import java.util.List;

public class Oppgåva {
	public static void main(String[] args) {
	List<Integer> liste = new ArrayList<>();
	liste.add(2);
	liste.add(2);
	liste.add(3);
	liste.add(4);
	liste.add(2);
	liste.add(1, 10);
	
	liste.clear();
	System.out.println("Det er " + liste.size() + " element i denne lista.");
	System.out.println(liste);
	System.out.println(liste.contains(9));
//	boolean Likt = false;
//	for(int i = 0; i < liste.size() - 1; i++) {
//		for(int j = i + 1; j < liste.size(); j++) {
//			if(liste.get(i).equals(liste.get(j))) {
//				System.out.println(liste.get(j) + j);
//				Likt = true;
//				break;
//			}
//		}
//		if(Likt) {
//			break;
//		}
//		}
//	
	
	
	if(liste.isEmpty()) {
		System.out.println("Lista er tom!");
	}
	else {
		System.out.println("Lista er ikkje tom!");
	}
	
	}
}
