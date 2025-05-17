package com.learning.string;

import java.util.Arrays;
import java.util.List;

public class ShortestDistanceIndex {

	public static void main(String[] args) {
		
		String str="the quick brown fox quick fox";
		List<String> arr= Arrays.asList(str.split(" "));
		String word1="the";
		String word2="fox";
		int result = shortestDistance(arr, word1, word2);
		
		System.out.println("Result : "+ result);
	}
	
	public static int shortestDistance(List<String> s, String word1, String word2) {
        int minDis= Integer.MAX_VALUE;
        int indexFirst=-1;
        int indexLast= -1;
        
       for(int i=0; i< s.size(); i++){
           
           if(s.get(i).equals(word1)){
               indexFirst =i;           
           }else if(s.get(i).equals(word2)){
               indexLast=i;
           }
           
           if(indexFirst!=-1 && indexLast!=-1){
               minDis = Math.min(minDis, Math.abs(indexFirst - indexLast));
           }
       }
        return minDis;
       
   }
}
