package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Myname= new ArrayList<>();
		
		Myname.add("Amr");
		Myname.add("Ahmed");
		Myname.add("Mohamed");
		Myname.add("Abdelhadi");
		Myname.add("Shehab");
		System.out.println("My Name is " + Myname);
		System.out.println("My name length is "+Myname.size());
		Myname.remove(2);
		System.out.println("My Name after remove is " + Myname);
		System.out.println("My name length after removal is "+Myname.size());
		Myname.sort(null);
		Collections.reverse(Myname);
		//		Collections.sort(Myname);
		System.out.println("My name length after removal is "+Myname);
		String targetname = "Abdelhadi";
		for(int index=0;index<Myname.size();index++) {
			if (Myname.get(index).equals(targetname)) {
				System.out.println("Abdelhadi Locatopn is "+ index);
				break;
			}
//			System.out.println(Myname.get(index));
		}
//		for(String name:Myname) {
//			System.out.println(name);
//		}
			}
		}