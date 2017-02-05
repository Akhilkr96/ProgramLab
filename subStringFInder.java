import java.util.HashSet;
import java.util.Set;


public class StringUtils {
	//Program to find longest substring among a set of string
	public static Set<String> getSubstrings(String inputString,int subStringLen){
		Set<String> outputSet=new HashSet<>();
		int inputLen=inputString.length();
		int noOfSubStrings=inputLen-subStringLen+1;
		for(int i=0;i<noOfSubStrings;i++){
			String tempString=inputString.substring(i,i+subStringLen);
			outputSet.add(tempString);
		}
		return outputSet;
	}

	public static String lengthiestSubStringPresent(Set<String> inputData){
		//find biggest string in the input
		int maxLen=0;
		String maxString=null;
		for(String eachString:inputData){
			if(maxLen<eachString.length()){
				maxLen=eachString.length();
				maxString=eachString;
			}
		}
		
		
		//search longest substring contains among string
		boolean gotSubString=false;
		String longestSubString=null;
		for(int i=maxString.length();i>0&&!gotSubString;i--){
			Set<String> subStringsToFind=getSubstrings(maxString,i);
			for(String subString:subStringsToFind){
				boolean containsAcrossCollection=true;
				for(String eachString:inputData){
					if(!eachString.contains(subString)){
						containsAcrossCollection=false;
						break;
					}
				}
				if(containsAcrossCollection){
				gotSubString=true;
				longestSubString=subString;
				}
			}
			
		}
		
		return longestSubString;
	}
	public static void main(String args[])
	{
		Set<String> input=new HashSet<String>();
		input.add("defhij");
		input.add("abcdef");
		input.add("efg");
		input.add("def");
		System.out.print(lengthiestSubStringPresent(input));
	}
}
