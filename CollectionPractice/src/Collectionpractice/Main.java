package Collectionpractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

class Test<T> {
    // An object of type T is declared
    T obj;
    Test(T obj) { this.obj = obj; } // constructor
    public T getObject() { return this.obj; }
}
 
public class Main {

	public static void main(String[] args) {
		
		Test<String> t1 = new Test<String>("tejal");
		System.out.println(t1.getObject());
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("hina", 234566);
		hm.put("isha", 100000);
		hm.put("jiya", 987000);
		hm.put("yukta", 725428);
		
		System.out.println("Using for enhanced loop Iteration");
        for (Map.Entry<String, Integer> e : hm.entrySet()) {
        	System.out.println("Keys:" + e.getKey() + "Values: "+ e.getValue());
        }

        System.out.println("Printing only the keys:");
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

//		ArrayList<String> L1 = new ArrayList<String>();
//		
//		L1.add("Divyani");
//		L1.add("Sakshi");
//		L1.add("Tejal");
//		L1.add("sam");
//		L1.add("Ramu");
//		
//		System.out.println("Iterating Arraylist using for loop");
//		for(int i=0; i<L1.size(); i++) {
//			System.out.println(L1.get(i));
//		}
//		
////		System.out.println(L1);
//		
//		ArrayList<Double> l2 = new ArrayList<Double>();
//		l2.add(98.45);
//		l2.add(354.45);
//		l2.add(655.4);
//		l2.add(83754.0);
//		
//		System.out.println("Iterating Arraylist using for loop");
//		for(Double Num:l2) {
//			System.out.println(Num);
//		}
//		
//		System.out.println("Iterating Arraylist using Iterator");
//		Iterator Num = l2.iterator();
//		
//		while(Num.hasNext()){
//			System.out.println(Num.next());
//		}
//		
//		System.out.println("Iterating Arraylist using Lambda Function");
//
////		System.out.println(l2);
////		
////		l2.remove(2);
////		
////		System.out.println(l2);
////
////		L1.set(2,"Vinit");
////		
////		System.out.println(L1);
////		
////		System.out.println(L1.get(2));
////		
//		LinkedList<Integer> L3 = new LinkedList<Integer>();
//		
//		L3.add(789);
//		L3.add(54);
//		L3.add(637);
//		L3.add(44);
//		
//		
//		L3.forEach(L8 ->System.out.print(L3));
//		
////		System.out.println(L3);
////		
////		L1.clear();
////		System.out.println(L1);
////
////		Vector v1 = new Vector();
////		v1.add(623763);
////		v1.add(37355);
////		v1.add(3652.4);
////		v1.add("dgeuu");
////		
////		v1.clear();
////		System.out.println("for each loop");
//		
	}

} 