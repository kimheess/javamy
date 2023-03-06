package chap11;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("222");
		list.add("444");
		System.out.println(list);
		
		list.add(0, "000");
		System.out.println(list);

		
		System.out.println("index =" + list.indexOf("333"));
		
		list.remove("333");
		System.out.println(list);
		
		System.out.println(list.remove("333"));
		System.out.println(list);
		System.out.println("index =" + list.indexOf("333"));
		
		for(int i = 0; i < list.size(); i++) {
			list.set(i, i +"");
		}
		System.out.println(list);

		System.out.print("{");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println("}");
		System.out.println("==========");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list);
			list.remove(i);
		}
		System.out.println(list);
			
		
	}

}
