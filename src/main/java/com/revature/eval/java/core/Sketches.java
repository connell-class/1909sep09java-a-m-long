package com.revature.eval.java.core;



public class Sketches {
	
	 public static void main(String[] args) {
			
		 
		 String string= "009 4456 789";
		 
		 
		 int everything = 0;
			if(string.length() <= 1) {
				//Validating a Number Strings of length 1 or less are not valid.
			}
			string = string.replace(" ", "");
			//replace the string spaces to no spaces
			//be sure to parse the string to return an integer
			for(int i = 0; i <string.length(); i++) {
				//read the entire string
			if(!Character.isDigit(string.charAt(i))) {
				//ignore all characters that aren't digits
				}
			}
			int count = 0;
			for(int j = string.length()-1; j >= 0 ; j--) {
				//doubled starting from the right
				
				char apples = string.charAt(j);

				
				if(count % 2 == 0) {
					
					
					
					everything += Integer.parseInt(Character.toString(apples));
					//returns integer from the string
					System.out.println(everything);
					
				}else {
				
					int bytwo = Integer.parseInt(Character.toString(apples));
					bytwo = bytwo * 2;
					if(bytwo > 9) {
						bytwo = bytwo - 9;
					}
					everything += bytwo;
					System.out.println(everything);
				}
				count++;
			}
			if(everything % 10 == 0) {
				System.out.println("false");
			}
	 }
}
	 
    	
    	

    
