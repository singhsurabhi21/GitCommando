package sg4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class set {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> SI=new TreeSet<>();
		SI.add(3);
		SI.add(4);
		System.out.println(SI);
		Iterator<Integer> it = SI.iterator();
		while(it.hasNext()) {
			  System.out.println(it.next());
			}



	}

}
