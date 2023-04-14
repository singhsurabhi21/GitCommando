package sg4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class com {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=new ArrayList<>();
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		System.out.println(li);
		System.out.println(li.get(1));
		li.get(1);
		for(int i:li) {
		System.out.println(i);
		}
		
		LinkedList<Integer> lt =new LinkedList<>();
		//It.add(3);
		lt.add(2);
		lt.add(3);
		lt.add(4);
		lt.add(5);
		System.out.println(lt);
		}

}
