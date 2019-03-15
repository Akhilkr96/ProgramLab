package com.batch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class TestClass1 {

    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

      

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
    /*	Integer s1=null;
    	String s2=s1+"0";
    	System.out.println("hi"+s1+"sdd");
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	  Map<String,List<Integer>> stock=new HashMap<String,List<Integer>>();
    	  Scanner s = new Scanner(System.in);
          Integer caseNO =  s.nextInt();  
          for(int i=0;i<caseNO;i++){
        	  Integer noOfStock =  s.nextInt(); 
        	  
        	  for(int j=0;j<noOfStock;j++){
        		  String caseNOstr = br.readLine(); 
        		  String[] splited = caseNOstr.split(" ");
        		  String mobName=splited[0]+splited[1]+splited[2];
        		  List<Integer> list=new ArrayList<Integer>();
        		  list.add(Integer.parseInt(splited[3]));
        		  list.add(Integer.parseInt(splited[4]));
        		  stock.put(mobName, list);
        	  }
        	  
        	  Integer noOfQueries =  s.nextInt(); 
        	  for(int j=0;j<noOfQueries;j++){
        		  String caseNOstr = br.readLine(); 
        		  String[] splited = caseNOstr.split(" ");
        		  String mobName=splited[0]+splited[1]+splited[2];
        		  List<Integer> list=stock.get(mobName);
        		  if(list==null||list.size()==0){
        			  System.out.println("no stock");
        		  }else{
        			  System.out.println(list);
        		  }
        	  
        	  }
          }
          */
    	
    	
    	

    }
     
    static class Node{
    	Integer value;
    	Node left;
    	Node right;
    }
}