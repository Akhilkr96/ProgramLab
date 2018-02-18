package com.batch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class game {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

      

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
    	
    	
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String caseNOstr = br.readLine();                // Reading input from STDIN
          Integer caseNO = Integer.parseInt(caseNOstr);
          for (int ii = 0; ii < caseNO; ii++) {
			String inputString = br.readLine();
			Set<String> uniqueElements = new HashSet<String>();
			int lenStr = inputString.length();
			char charArray[] = inputString.toCharArray();
			for (int i = 0; i < lenStr; i++) {
				char cPointed = charArray[i];
				String s = String.valueOf(cPointed);
				uniqueElements.add(s);
			}
			if (uniqueElements.size() % 2 == 0) {
				System.out.println("Player2");
			} else {
				System.out.println("Player1");
			} 
		}
          

    }
}