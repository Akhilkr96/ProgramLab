package greedy;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.lang.Math;

public class BobsEmpire {

	public static void main(String[] args)  throws Exception{
	
		  Scanner s = new Scanner(System.in);
          Integer caseNO =  s.nextInt();  
          for (int ii = 0; ii < caseNO; ii++) {
        	
              int n =   s.nextInt();    
              int[] arr=new int[4];
              List<Integer> seats=new ArrayList<Integer>();
              for(int i=0;i<4;i++){
            	 int elem= s.nextInt();
            	 arr[i]=elem;
            	 if(elem!=0){
            		 seats.add(elem);
            	 }
              
              }
              
              int minTime=findMinTime(n,seats);
              System.out.println(minTime);
          }
	}

	private static int findMinTime(double n, List<Integer> seats) {
		// TODO Auto-generated method stub
		int sumTaravelTime=0;
		//List<Integer> travelTime=seats.stream().map(s->n%s==0?n/s:(n/s)+1).collect(Collectors.toList());
		// sumTaravelTime=travelTime.stream().reduce(0, Integer::sum);
		
		double min=seats.stream().min(Integer::compare).get();
		double result=n/min;
		int  ceil=(int) Math.ceil(result);
		sumTaravelTime=ceil+3;
		return sumTaravelTime;
	}
		
		
	

}
