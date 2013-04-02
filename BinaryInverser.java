/**
* @author Muhammad Azani hasibuan (muhammad.azani@gmail.com)
*/

import java.util.ArrayList;
import java.io.Console;

public class BinaryInverser {

	public static void main(String[] args) {
		
		//Get input from terminal and Casting input string to integer
		Console c = System.console();
		String quit ="q";
		if (c == null) {
		    System.err.println("No console.");
		    System.exit(1);
		 }
     
    		while(true){
      			String input = c.readLine("Enter your decimal number (1-1000) or q to quit: ");
    
      		if (!input.equals(quit)){
          
		          //check whether the input contain string or not
		          if(!input.matches(".*\\D.*")){
		            int decInput = Integer.parseInt(input);
				        System.out.println("input : "+input);
				        System.out.println("output : "+binToDec(revBin(decToBin(decInput))));
			  }else{
			    System.out.println("your input not valid, please enter number 1-1000");
			  }
	      	 }else{                                    
		          //quit from this program
		          System.out.println("Thank you");
		      	  System.exit(1);
		  }
		     
	  }
	
	}//End of Main
	
	
	/**
	*This is function to convert decimal number to binary 
	*@param dec a decimal number that will converted to binary
	*/
	public static ArrayList<Integer> decToBin(int dec){
		ArrayList<Integer> binary = new ArrayList<Integer>();
		
		while(dec!=0){
		    if(dec%2!=0){
		      //down ceiling
		      dec = dec/2;
		      binary.add(1);
		    }else{
		      dec = dec/2;
		      binary.add(0);
		    }
		}//end of while
		
		return binary;
		
	}
	
	
	/**
	*This is function to reverse the binary number
	*@param bin an Arraylist that contain binnary number
	*/
	public static ArrayList<Integer> revBin(ArrayList<Integer> bin){
		ArrayList<Integer> revBin = new ArrayList<Integer>();

		
		for(int i=0;i<bin.size();i++){
			if(bin.get(i)==0){
				revBin.add(1);
			}else{
				revBin.add(0);
			}
		}//End of for loop
		
		return revBin;

	}
	
	/**
	*This is function to convert the reversed binary number to decimal
	*@param bin an Arraylist that contain reversed binnary number
	*/
	public static int binToDec(ArrayList<Integer> binRev){
		int revDec =0;
		
		for(int i=0;i<binRev.size();i++){
			revDec = (int) (revDec + (binRev.get(i)*(Math.pow(2,i))));
		}
		return revDec;
		
	}

}

