/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current
 * exchange rate.
 *
 *
 * �CSA/FLVS 2011
 * @author Timothy Roe, Jr.
 * @version 6/17/15
 */
import java.util.Scanner;
public class CurrencyConverter_V2
{
    public static void main(String [ ] args)
    {
    	Scanner in;
    	in = new Scanner(System.in);
    	System.out.print("Enter your starting US Dollar Amount in decimal form: $");
        double startingUsDollars = in.nextDouble();		// local variable for US Dollars
        System.out.print("Enter the amount of Pesos you spent in decimal form: ₱");
        double pesosSpent = in.nextDouble();        // local variable for Mexican pesos spent
        double pesoExchangeRate = 0.065;        // local variable for exchange rate of US Dollars to Pesos
        //double dollarsSpentInMexico = 0.0;      // local variable for dollars spent in Mexico
        double remainingUsDollars = 0.0;        // local variable for US Dollars remaining
        //remaining variables below here

        // purpose of program
        /*System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();*/

        // convertion for Mexican pesos
        // code goes below here
        double pesosSpentInDollars = pesosSpent * pesoExchangeRate;
        remainingUsDollars = startingUsDollars - pesosSpentInDollars;
        // convertion for Japanese yen
        // code goes below here
        System.out.print("Enter the amount of Yen you spent in decimal form: ¥");
        double yenSpent = in.nextDouble();
        double yenConversionRate = 0.0081;
        double yenSpentInDollars = yenSpent * yenConversionRate;
        remainingUsDollars = remainingUsDollars - yenSpentInDollars;
        // convertion for Euros
        // code goes below here
        System.out.print("Enter the amount of Euros you spent in decimal form: €");
        double eurosSpent = in.nextDouble();
        double euroConversionRate = 1.12;
        double euroSpentInDollars = eurosSpent * euroConversionRate;
        remainingUsDollars = remainingUsDollars - euroSpentInDollars;
        //print output to the screen
        // code goes below here
        System.out.println("Starting US Dollars:          $" + startingUsDollars);
        System.out.println("US dollars spent in Mexico:   $" + pesosSpentInDollars);
        System.out.println("US dollars spent in Japan:    $" + yenSpentInDollars);
        System.out.println("US dollars spent in France:   $" + euroSpentInDollars);
        System.out.println("============================================================");
        System.out.println("Remaining US Dollars:         $" + remainingUsDollars);
        // Complete the code below. Replace th 0's for totalItem and fundsRemaining
        // with the proper calculations. Casting, integer division and the modulus
        // operator needed. Do not worry about extra decimal places for the dollar amounts.
        System.out.println("");
        System.out.println("");
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		System.out.println("The Cost of an item is $4");
		int costItem1 = 4;  //cost per item of first souvenir
		System.out.print("Set your budget in the form of a int: $");
		int budget1 = in.nextInt();   						//budget for first item
		int totalItem1 = 50/4; 		//how many items can be purchased
		double fundsRemaining1 = 50%4;  //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItem1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);

		//Calculations for Souvenir #2
		System.out.println("The Cost of an item is $32.55");
		double costItem2 = 32.55;  						//cost per item of second souvenir
		System.out.print("Set your budget in the form of a int: $");
		int budget2 = in.nextInt();   							//budget for second item
		int totalItem2 = (int)(713/32.55); 	//how many items can be purchased
		double fundsRemaining2 = 713%32.55;  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItem2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

