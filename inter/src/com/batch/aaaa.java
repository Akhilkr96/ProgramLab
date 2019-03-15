package com.batch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class aaaa {

	public static void main(String args[]){
		List<String> list=new ArrayList<String>(Arrays.asList("ha","hi","poi"));
		int i=0;
		for(int j=0;j<list.size();j++){
			String l=list.get(j);
			System.out.println(l);
			if("hi".equals(l)){
				list.remove(i);
				list.add("fo");
				list.add("fo1");
			}
			i++;
		}
		System.out.println(list);
	}
}
