package com.batch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class theifProblem {

    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

      

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
    	
    	  Scanner s = new Scanner(System.in);
          Integer caseNO =  s.nextInt();  
          for (int ii = 0; ii < caseNO; ii++) {
        	
              int arrLen =   s.nextInt();    
              int[] arr=new int[arrLen];
              arrLen--;
              Set<Integer> benchMarkSet=new HashSet<Integer>();
              for(int i=0;i<=arrLen;i++){
            	 int elem= s.nextInt();
            	 arr[i]=elem;
            	 if(elem!=0){
            		 benchMarkSet.add(elem);
            	 }
              }
              
              
              
              long max=0;
              
              for(Integer benchFromSet:benchMarkSet){
            	  long benchMark=benchFromSet;
            	 
	              for(int j=0;j<=arrLen;j++){
	            	  long benchsum=0;
	            	  for(int k=j;k<=arrLen;k++){
	            		  if(arr[k]>=benchMark){
	            			  benchsum+=benchMark;
	            		  }else{
	            			  break;
	            		  }
	            	  }
	            	  if(max<=benchsum){
	            		  max=benchsum;
	            	  }
	              }
              }
              
             
              
        	  System.out.println(max);
		}
          

    }

}