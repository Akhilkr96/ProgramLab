package greedy;

import java.util.Scanner;

public class DiceTower {

	public static void main(String[] args)  throws Exception{
	
		  Scanner s = new Scanner(System.in);
          Integer caseNO =  s.nextInt();  
          for (int ii = 0; ii < caseNO; ii++) {
        	
              int n =   s.nextInt();    
             
              
              int minCount=findMinDice(n);
              System.out.println(minCount);
          }
	}

	private static int findMinDice(int n) {
		// TODO Auto-generated method stub
		if(n==21)
			return 1;
		else if(n>=30 && n<=40)
			return 2;
		else if(n>=44) 
		{
			int afterSubtraction=n-30;
			
			if(n>=14) {
				
				int reminder=afterSubtraction%14;
				int quotient=afterSubtraction/14;
				
				if(reminder<10) {
					return quotient+2;
				}else {
					return -1;
				}
			}else {
				return -1;
			}
			
			
		}
		else
			return -1;
	}
		
		
	

}
