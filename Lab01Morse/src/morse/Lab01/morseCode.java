package morse.Lab01;

import java.util.Scanner;

public class morseCode {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner (System.in);
		
		String [] Morse = {"  " ,"--..--",".-.-.-","..--..","-----",".----","..---","...--","....-",
				".....","-....","--...","---..","----.",".-" , "-..." , "-.-." , "-.." , "." , "..-." , 
				"--." , "...." , ".." , ".---" , "-.-" , ".-.." , "--" , "-." , "---" , ".--." ,
				"--.-" ,  ".-." , "..." , "-" , "..-" , "...-" , ".--" , "-..-" , "-.--" , 
				"--.." };
		
		char [] characters = {' ', ',', '.','?','0','1','2','3','4','5','6','7','8','9','a', 'b', 'c', 
				'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
				'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
				'y', 'z', };
		
		String userInput;

		System.out.println("Enter a word or phrase to be converted into morse code: ");
		userInput=keyboard.nextLine();
		
		System.out.println();
		
		//use the toLowercase
		userInput=userInput.toLowerCase();
		
		for (int i=0; i<userInput.length(); i++)
		{
			for (int counter=0; counter<characters.length; counter++)
			{

				if ( characters [ counter ] == userInput.charAt ( i ) )

	                System.out.print ( Morse [counter]);
			}
		}
		
		
		
	}

}
