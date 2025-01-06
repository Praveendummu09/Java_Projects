package com.prav.fun;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.*;


public class DemoBiFunction {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> hm=new LinkedHashMap<String, Integer>();
		hm.put(new String("Mouse"), 12);
		 hm.put(new String("KBBB"), 10);
		 hm.put(new String("CDRRR"), 8);
		 hm.put(new String("FDDD"), 7);
		 hm.put(new String("Rat"), 6);
		 System.out.println(hm.toString());
		 Set<Entry<String, Integer>> e= hm.entrySet();
		 for(Entry<String, Integer> ent:e)
		 {
			 System.out.println(ent.getKey()+"==="+ent.getValue());
		 }
		 hm.forEach((x,y)->System.out.println(x+"  "+y));
		 System.out.println("==Map after the function====");
		 BiFunction<String, Integer,Integer> fn=(p,q)->q*2;
		 hm.forEach((p,q)->{
			 System.out.println(fn.apply(p, q));
		 });
		 System.out.println("===Map after perdicate====");
		 BiPredicate<String,Integer> pr=(p,q)->q>=10;
		 hm.forEach((x,y)->{
			 if(pr.test(x, y))
			 {
				 System.out.println(x+"\t"+y);
			 }
		 });
	}

}
