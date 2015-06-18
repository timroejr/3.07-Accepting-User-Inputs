/**
 * Assignment 3.07 Test Message Coder Input
 * @author timothyroejr
 * @version 6/17/15
 * 
 */
import java.util.Scanner;
public class TextMessage_V2 {

	public static void main(String[] args) {
		//String originalMessage = "i am on the way home right now. do you need me to stop a the grocery store and pickup anything? by the way what you said today at lunch was funny. I was rolling on the floor laughing out loud.";
		Scanner in;
		System.out.print("Message: ");
		in = new Scanner(System.in);
		String originalMessage = in.nextLine();
		System.out.println("Original Message: " + originalMessage);
		System.out.println("Message Length: " + originalMessage.length() +" Characters");
		System.out.println();
		String abbreviations = originalMessage.replace("you", "u");
		abbreviations = abbreviations.replace("on the way", "otw");
		abbreviations = abbreviations.replace("by the way", "btw");
		abbreviations = abbreviations.replace("rolling on the floor laughing out loud", "ROFLOL");
		abbreviations = abbreviations.replace("today", "2day");
		String revisedMessage = abbreviations;
		System.out.println("Revised Message: " + revisedMessage);
		System.out.println("Message Length: " + revisedMessage.length() + " Characters");
		System.out.println();
		String firstN = revisedMessage.substring(0);
		if (firstN.indexOf("n") == -1) {
			System.out.println("indexOf \"N\": Does Not Exist");
		} else {
			System.out.println("indexOf \"N\":                         " + firstN.indexOf("n"));
		}
		int third = originalMessage.length()/3;
		int last = third + third + 1;
		String firstThird = revisedMessage.substring(0, third);
		System.out.println("First Third of Revised Message:      " + firstThird);
		String lastThird = revisedMessage.substring(last);
		System.out.println("Last Third of Revised Message:      " + lastThird);
		String replacement = revisedMessage.replaceAll("[acegi]", "");
		System.out.println("Replacement of the letters \"ACEGI\": " + replacement);
		
	}

}
