package oppgåve1a;
import java.util.Stack;
public class ParentesSjekker {

	public static void main(String[] args) {
		sjekkParenteser parenteser = new sjekkParenteser("{" + "(" + ")" + "}") {
			
		}
	}

	public boolean sjekkParenteser(String s) {
// For å sjekke om s har parentesar som alle
// matcher sluttparentesar og at rekkefølga er riktig
//if(s.contains("{" + "[" + "(" + "}" + "]" + ")"))
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(s.length()) == s.charAt(0)) {
				return true;
		}
	}
		return false;
		
	}
}
