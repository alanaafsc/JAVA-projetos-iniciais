package set.application;

import java.util.LinkedHashSet;
import java.util.Set;

public class ProgramDemo1 {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		//set.remove("Tablet");
		//remove toda String com tamanho maior ou igual a 3:
		//set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'T');


		for (String p : set) {
			System.out.println(p);
		}
	}

}
