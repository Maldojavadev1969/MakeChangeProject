package MakeChange2;

import java.util.Scanner;

public class MakeChangeClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int change = 0;
		double tendered = 0;
		double price = 0;
		
		//coins
		int qrtr = 0;
		int dime = 0;
		int nickel = 0;
		int pennie = 0;
		
		//bills
		int twentyD = 0;
		int tenD = 0;
		int fiveD = 0;
		int oneD = 0;
		
		//PrintChangeString
		String printChangeString = "";
		// create a print string flag: if value of coin or bill is used then set print to true for each coin or bill!!
		boolean twentyDFlag = false; 
		boolean tenDFlag = false;
		boolean fiveDFlag = false;
		boolean oneDFlag = false;
		boolean qrtrFlag = false;
		boolean dimeFlag = false;
		boolean nickelFlag = false;
		boolean pennieFlag = false;
		
		
		System.out.println("Please enter price of item: ");
		price = 100 * input.nextDouble(); //convert to  hundreds ... pennies
		
		System.out.println("Please enter how much money was tendered: ");
		tendered  = 100 * input.nextDouble(); //convert to hundreds ... pennies
		
		//hard code values for now.. for testing
			//tendered = 100;
			//price = 59;     
		
		change = (int)(tendered - price);//change is 33 here!
		
		if(change < 0)
		{
			System.out.println("Thats not enough money to pay for the item!");
		}
		
		if(change == 0)
		{
			System.out.println("You paid the exact amount!");
		}
		
		//this while loop will add bills and coins until !
		while (change >= 1)
		{
			
			//call a method to change out bills first!
			if(change >= 2000)
			{
				//add a 20 dollar bill
				twentyD = twentyD + 1;
				change = change - 2000;
				twentyDFlag = true;
			}
			 if(change >= 1000 && change < 2000 )
			 {
				 //add a 10 dollar bill
				 tenD = tenD + 1;
				 change = change - 1000;
				 tenDFlag = true;
				 
			 }
			 
			 if(change >= 500 && change < 1000)
			 {
				 //add a five dollar bill
				 fiveD = fiveD + 1;
				 change = change - 500;
				 fiveDFlag = true;
				
			 }
			 
			 if(change >= 100 && change < 500)
			 {
				 //add a one dollar bill
				 oneD = oneD + 1;
				 change = change - 100;
				 oneDFlag = true;
				
				
			 }
			 //call a method to change out coins
		
			 if(change >= 25 && change < 100)
		     {   
					
				//add a quarter(s) 
				 qrtr = qrtr + 1;
				 //remove 25 from change
				 change = change - 25;
				 qrtrFlag = true;
				
			 }
				 
			 if (change >= 10 && change < 25)
			 {
				 //add a dime(s)
				  dime = dime + 1;
				  //reduce change by 10
				  change = change - 10;
				  dimeFlag = true;
				 
			 }
			 if(change >= 5 && change < 10)
			 {
				 //accumulate nickel(s)
				 nickel = nickel + 1;
				 change = change - 5;
				 nickelFlag = true;
				 
			 }
			 if(change >= 1 && change < 5)
			 {
				 //add a pennie(s)
				 pennie = pennie + 1;
				 change = change - 1;
				 pennieFlag = true;
				 
			 }
		
		}// end of while loop
		
		 //concatenate to printString if string flag is set to true
				if(twentyDFlag)
				{
					printChangeString +=  twentyD + " twenty dollar bill" + "\t";
				}
				if(tenDFlag)
				{
					printChangeString += tenD + " ten dollar bill" + "\t";
				}
				if(fiveDFlag)
				{
					printChangeString += fiveD + " five dollar bill" + "\t";
				}
				if(oneDFlag)
				{
					printChangeString += oneD + " one dollar bill" + "\t";
				}
				if(qrtrFlag)
				{
					printChangeString += qrtr + " quarter(s) " + "\t";
				}
				if(dimeFlag)
				{
					printChangeString += dime + " dime(s) " + "\t";
				}
				if(nickelFlag)
				{
					printChangeString += nickel + " nickel(s) " + "\t";
				}
				if(pennieFlag)
				{
					printChangeString += pennie + " pennie(s) " + "\t";
				}
				
		
		System.out.println(printChangeString);
		 
		 input.close();
		 
	}//end of main
}