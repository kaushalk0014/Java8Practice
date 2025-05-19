package com.learning.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListBinarySearch {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(99);
		list.add(88);
		list.add(77);
		list.add(66);
		list.add(55);
		
		int point=Collections.binarySearch(list, 66, Collections.reverseOrder());
		
		System.out.println("Result : "+point);
	}
}
