package LabExample;

import java.util.Scanner;

public class CountWordsCharacters {
	public static void countWords(String string)
	{
		int count = 0;    
        
        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;  
        }
	    System.out.println(count);
	    
	    String[] words = string.split("\\s+");
	    int count1=words.length;
        System.out.println(count1);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count2=0;
		String string= "hello world"
				+ "what is my life"
				+ "what are you";
		countWords(string);	
		
		Scanner sc=new Scanner(string);
	      // read each line and
	      // count number of lines
	      while(sc.hasNextLine()) {
	        sc.nextLine();
	        count2++;
	      }
	      System.out.println(count2);
	}

}
