package com.revature.eval.java.core;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class EvaluationService {

	public EvaluationService(Map<Integer, Integer> integer, Map<String, String> hashmap) {
		// TODO Auto-generated constructor stub
	
	}
	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	public String reverse(String string) {
		char[] reversed = new char[string.length()];
		for (int i = reversed.length - 1, j = 0; i >= 0; i--, j++) {
			reversed[j] = string.charAt(i);
		}
		return new String(reversed);
	}

	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public String acronym(String phrase) {
		// TODO Write an implementation for this method declaration

		String a = phrase.substring(0, 1);
		// zero means the first spot of the string
		// one is like telling the program "to the end of the first string"(zero being
		// the first)

		char b;
		for (int i = 0; i < phrase.length(); i++) {

			b = phrase.charAt(i);

			if (b == ' ' || b == '-') {

				// if there is a space ore if there is a dash then....
				a = a + Character.toString(phrase.charAt(i + 1));

			}

		}

		return a;
	}

	/**
	 * 3. Determine if a triangle is equilateral, isosceles, or scalene. An
	 * equilateral triangle has all three sides the same length. An isosceles
	 * triangle has at least two sides the same length. (It is sometimes specified
	 * as having exactly two sides the same length, but for the purposes of this
	 * exercise we'll say at least two.) A scalene triangle has all sides of
	 * different lengths.
	 *
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			// TODO Write an implementation for this method declaration

			if (sideOne == sideTwo & sideOne == sideThree) {

			}
			return true;

		}

		public boolean isIsosceles() {
			// TODO Write an implementation for this method declaration

			if (sideOne == sideTwo & sideOne != sideThree) {

			}

			return false;

		}

		public boolean isScalene() {
			// TODO Write an implementation for this method declaration

			if (sideOne != sideTwo & sideOne != sideThree & sideTwo != sideThree) {

			}

			return false;
		}

	}

	/**
	 * 4. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examplesu
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public int getScrabbleScore(String string) {
		// TODO Write an implementation for this method declaration

		String abcs = "abcdefghijklmnopqrstuvwxyz";

		char[] alphabet = abcs.toCharArray();

		int getScrabbleScore = 0;
		// int must be initialized

		char letter = 0;

		// letter must be initialized

		for (int i = 0; i < string.length(); i++) {

			letter = string.charAt(i);

			if (letter == alphabet[0] || letter == alphabet[4] || letter == alphabet[8] || letter == alphabet[14]
					|| letter == alphabet[20] || letter == alphabet[11] || letter == alphabet[14]
					|| letter == alphabet[17] || letter == alphabet[18] || letter == alphabet[19]) {

				getScrabbleScore += 1;

			}

			if (letter == alphabet[3] || letter == alphabet[6]) {

				getScrabbleScore += 2;

			}

			if (letter == alphabet[1] || letter == alphabet[2] || letter == alphabet[12] || letter == alphabet[15]) {

				getScrabbleScore += 3;

			}

			if (letter == alphabet[5] || letter == alphabet[7] || letter == alphabet[21] || letter == alphabet[22]
					|| letter == alphabet[24]) {

				getScrabbleScore += 4;

			}

			if (letter == alphabet[10]) {

				getScrabbleScore += 5;

			}

			if (letter == alphabet[9] || letter == alphabet[23]) {

				getScrabbleScore += 8;

			}

			if (letter == alphabet[16] || letter == alphabet[25]) {

				getScrabbleScore += 10;

			}

		}

		return getScrabbleScore;
	}

	/**
	 * 5. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) {
		// TODO Write an implementation for this method declaration

		string = string.replaceAll("[^\\d.]", "");
// replace all non-numerical characters
		char[] end = new char[10];

		end = string.toCharArray();

		for (int i = 0; i < string.length(); i++) {

			char goal = string.charAt(i);

			if (goal == ' ' || goal == '.') {

				string = goal + Character.toString(string.charAt(i + 1));

				if (goal > end.length) {

					goal = string.charAt(1);

				}

			}

		}

		return string;
	}

	/**
	 * 6. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	public Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration

		Map<String, Integer> map = new HashMap<>();

		String[] words = string.split("\\s*(=>|,|\\s)\\s*");
		// splits at spaces and commas

		for (int i = 0; i < words.length; i++) {
			String phrase = words[i];

			int wordCount = map.getOrDefault(phrase, 0);
			// returns the value to which the specified key is mapped

			map.put(phrase, ++wordCount);

		}

		return map;

	}

	/**
	 * 7. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> {
		private List<T> sortedList;

		public int indexOf(T t) {
			// TODO Write an implementation for this method declaration
			
				
			//last is the entire list and first is the beginning of the list
			
			
			int toend = (sortedList.size()-1);
			//to get the entire size starting from the index of 0
			int first = 0;
			//initialize the beginning of the list
			
			int result = Integer.parseInt(t.toString());
			
			
			//taking the argument input into an integer
			while (first <= toend) {
						
			
			int mid = toend/2;
			//halving the list
			int cut = Integer.parseInt(sortedList.get(mid).toString());
			
			if(cut > result) {
			toend = mid -1;
			//want to look for where mid was at the moment and go left
				}
				else if (cut < result) {
					first = mid + 1;
					//read from the other end of the middle
				}
					else
						return mid;
						
			}
			return -1;
			//number doesn't exist in the array list
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

	}

	/**
	 * 8. Implement a program that translates from English to Pig Latin.
	 * 
	 * Pig Latin is a made-up children's language that's intended to be confusing.
	 * It obeys a few simple rules (below), but when it's spoken quickly it's really
	 * difficult for non-children (and non-native speakers) to understand.
	 * 
	 * Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
	 * the word. Rule 2: If a word begins with a consonant sound, move it to the end
	 * of the word, and then add an "ay" sound to the end of the word. There are a
	 * few more rules for edge cases, and there are regional variants too.
	 * 
	 * See http://en.wikipedia.org/wiki/Pig_latin for more details.
	 * 
	 * @param string
	 * @return
	 */
	public Object toPigLatin(String string) {
		// TODO Write an implementation for this method declaration

		String phrase = string;
		String[] possiblity = string.split(" "); 
		String v = "aeiou"; 
		char[] vowel = v.toCharArray();
		CharSequence th ="th";
		CharSequence ch = "ch";
		CharSequence qu = "qu";
		CharSequence sch = "sch";

		
		for (int i=0; i< possiblity.length; i++) {

			for ( int j=0; j<vowel.length; j++) {
			
			String first = possiblity[i];
			char[] prettyBad = first.toCharArray();
			string = possiblity[i].substring(1)
					+ possiblity[i].subSequence(0,1)+ "ay";

			
			if  (prettyBad[0]== vowel[j]) {
				string = possiblity[i] + "ay";
				break;
				}
			      
			
			if (possiblity[i].contains(th) || possiblity[i].contains(qu)  ) {

							string = possiblity[i].substring(2)
						+ possiblity[i].subSequence(0, 2)+ "ay";
							break;					
						}
				
			if (possiblity[i].contains(sch)) {
					string = possiblity[i].substring(3)
							+ possiblity[i].subSequence(0, 3)+ "ay";		
								System.out.println(string);
								break;
				}

			}	
			
			
			}
		return string;
}

	/**
	 * 9. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
	public boolean isArmstrongNumber(int input) {
		// TODO Write an implementation for this method declaration

		 int num = input;
		   int number, temp, total = 0;
		   number = num;
		   boolean armstrong = false;
//		   System.out.println("is this thing working?");

		   String ummm = Integer.toString(num);

	        
	        char[] goal = ummm.toCharArray();
	        int nope = goal.length;        	
//	        System.out.println(nope);
	        
	        while (number != 0)
	        {
	        	
//	        	 int firstDigit = Integer.parseInt(Integer.toString(number).substring(0,1));
	        	 
	        	 temp = number % 10;
	            
	            total = (int) (total + Math.pow(temp, nope));
	            //Math.p
	            
	            number /= 10;
	        }

	        if(total == num) {
	        armstrong= true;
//	        System.out.println(armstrong);
	        }
	        else {
	        armstrong = false;
//	        System.out.println(armstrong);
	        }
	        return armstrong;
	}



	/**
	 * 10. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	public List<Long> calculatePrimeFactorsOf(long l) {
		// TODO Write an implementation for this method declaration
		int m = 0;
		int flag = 0;
		boolean solution;

		m = (int) (l / 2);
// find if numbers are prime
		if (l == 0 || l == 1) {

			solution = false;
			
		} else {

			for (int i = 2; i <= m; i++) {

				if (l % i == 0) {

					solution = false;

					flag = 1;
					break;
				}
			}
			if (flag == 0) {
			}
			solution = true;

//		return null;
	}
		return null;

	}

	/**
	 * 11. Create an implementation of the rotational cipher, also sometimes called
	 * the Caesar cipher.
	 * 
	 * The Caesar cipher is a simple shift cipher that relies on transposing all the
	 * letters in the alphabet using an integer key between 0 and 26. Using a key of
	 * 0 or 26 will always yield the same output due to modular arithmetic. The
	 * letter is shifted for as many values as the value of the key.
	 * 
	 * The general notation for rotational ciphers is ROT + <key>. The most commonly
	 * used rotational cipher is ROT13.
	 * 
	 * A ROT13 on the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: nopqrstuvwxyzabcdefghijklm It is
	 * stronger than the Atbash cipher because it has 27 possible keys, and 25
	 * usable keys.
	 * 
	 * Ciphertext is written out in the same formatting as the input including
	 * spaces and punctuation.
	 * 
	 * Examples: ROT5 omg gives trl ROT0 c gives c ROT26 Cool gives Cool ROT13 The
	 * quick brown fox jumps over the lazy dog. gives Gur dhvpx oebja sbk whzcf bire
	 * gur ynml qbt. ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. gives The
	 * quick brown fox jumps over the lazy dog.
	 */
		 static class RotationalCipher {
		   	 private int key;

		   	 
		public RotationalCipher(int i) {
				// TODO Auto-generated constructor stub
			}


		public String rotate(String string) {
			// TODO Write an implementation for this method declaration

			
			String abc = "abcdefghijklmnopqrstuvwxyz";
			char[] bots = abc.toCharArray();
			
			char[] camp = string.toCharArray();
			
			if ( key != 0 || key != 2 || key != 4 | key != 6|| key != 8|| key != 10|| key != 12
					|| key != 14 || key!= 16 || key!= 18 || key!=20 || key!=22||key!=24||key!=26) {
				System.out.println(string);
			}
			else {
//				for (int i=0; i<camp.length; i++ ) {
//					for (int j=0; j<bots.length; j++) {
//					if(bots[i]==camp[i]) {
//						char[] facts = camp ;
//					}
//					
//					}
//					
//				}
			}
//			
////			
//			
			return string;

		
		}
		 }
//	
	

		/**
		 * 12. Given a number n, determine what the nth prime is.
		 * 
		 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
		 * that the 6th prime is 13.
		 * 
		 * If your language provides methods in the standard library to deal with prime
		 * numbers, pretend they don't exist and implement them yourself.
		 * 
		 * @param i
		 * @return
		 */
		public int calculateNthPrime(int i) {
			// TODO Write an implementation for this method declaration
			
		    int number = 1; 
		    int count = 0;
		    
while(count<i) {
		    	number = number+1; 
		    	for(int j=2; j<=number; j++) {
		    		if(number % j==0) {
		    		

		if (j==number ) {
			count = count+1;
			break;
		}
		}
		}
		    }
			  return number;

}

		/**
		 * 13 & 14. Create an implementation of the atbash cipher, an ancient encryption
		 * system created in the Middle East.
		 * 
		 * The Atbash cipher is a simple substitution cipher that relies on transposing
		 * all the letters in the alphabet such that the resulting alphabet is
		 * backwards. The first letter is replaced with the last letter, the second with
		 * the second-last, and so on.
		 * 
		 * An Atbash cipher for the Latin alphabet would be as follows:
		 * 
		 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
		 * very weak cipher because it only has one possible key, and it is a simple
		 * monoalphabetic substitution cipher. However, this may not have been an issue
		 * in the cipher's time.
		 * 
		 * Ciphertext is written out in groups of fixed length, the traditional group
		 * size being 5 letters, and punctuation is excluded. This is to make it harder
		 * to guess things based on word boundaries.
		 * 
		 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
		 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
		 *
		 */
		 static class AtbashCipher {


			/**
			 * Question 13
		
			 public static String encode(String string) {

			 public  String encode(String string) {
			 
					// TODO Write an implementation for this method declaration
					 * 
					 */
			 public static  String encode(String string) {

				 char[] parseString = string.toLowerCase().toCharArray();
		   		 StringBuilder pants = new StringBuilder();
		   		 
		   		 String abc = "abcdefghijklmnopqrstuvwxyz";
		   		 String zyx = "zyxwvutsrqponmlkjihgfedcba";
		   		 
		   		 for (char i : parseString) {
		   			 if (Character.isLetter(i)) {
		   				 int shifted = abc.indexOf(Character.toString(i));
		   				 pants.append(zyx.charAt(shifted));
		   			 } else if (Character.isDigit(i)) {
		   				 pants.append(i);
		   				 //
		   				  
		   			 }
		   		 }
		   		 
		   		 for(int i = 5; i < string.length(); i+=6) {
		   			 pants.insert(i, " ");
		   		 }
		   		
		   		 
		   		 int lastIndex = pants.length()-1;
		   		 
		   		 if(pants.charAt(lastIndex) == ' ') {
		   			 pants.deleteCharAt(lastIndex);
		   		 }
		   		 

		   		 return pants.toString();

				
		}

		/**
		 * Question 14
		 * 
		 * @param string
		 * @return
		 */
			 public static String decode(String string) {
		   		 // TODO Write an implementation for this method declaration
		   		 char[] parseString = string.toLowerCase().toCharArray();
		   		 // parseString is an array of characters existing in order of
		   		 // the input string
		   		 StringBuilder pants = new StringBuilder();
		   		 // String that returns encrypted string
		   		 
		   		 String abc = "abcdefghijklmnopqrstuvwxyz"; // regular alphabet
		   		 String zyx = "zyxwvutsrqponmlkjihgfedcba"; 
		   		 //substitution
		   		 
		   		 for (char car : parseString) { 
		   			 // for each character that exists in the char array...
		   			 if (Character.isLetter(car)) {
		   				 int index = zyx.indexOf(Character.toString(car));
		   				 pants.append(abc.charAt(index));
		   			 } else if (Character.isDigit(car)) {
		   				 pants.append(car);
		   			 }
		   		 }
		   		String happy = pants.toString();

		   		 return happy;
		   	 }
		    
		 }
		 
		
	/**
	 * 15. The ISBN-10 verification process is used to validate book identification
	 * numbers. These normally contain dashes and look like: 3-598-21508-8
	 * 
	 * ISBN The ISBN-10 format is 9 digits (0 to 9) plus one check character (either
	 * a digit or an X only). In the case the check character is an X, this
	 * represents the value '10'. These may be communicated with or without hyphens,
	 * and can be checked for their validity by the following formula:
	 * 
	 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
	 * * 2 + x10 * 1) mod 11 == 0 If the result is 0, then it is a valid ISBN-10,
	 * otherwise it is invalid.
	 * 
	 * Example Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula,
	 * and get:
	 * 
	 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 *
	 * 1) mod 11 == 0 Since the result is 0, this proves that our ISBN is valid.
	 * 
	 * @param string
	 * @return
	 */
		 
	public boolean isValidIsbn(String string) {
		// TODO Write an implementation for this method declaration
		
char[] pants = string.toUpperCase().toCharArray();
//turning string into a char array
		
		StringBuilder man = new StringBuilder();
		//mutable string needed
		int putting = 0;
		for(int i = 0; i < pants.length;i++) {
			 putting = string.indexOf(Character.toString(pants[i]));
			 //
			man.append(string.charAt(putting));
			//takes chunk of string and puts it to the end of the string
		}
		for(int j=0; j<string.length();j++) {
			if(man.charAt(j) == ('-')){	
				//read the entire string and remove dashes
				 man.deleteCharAt(j);
				 man.trimToSize();
			 }
		}
		System.out.println(man.toString());
		int counter = 10;
		int num = 0;
		for(int k = 0; k < man.length(); k++) {
			
			
			
			if((man.charAt(k) == ('X'))){
				num = num + (10 * counter);
				counter--;
			
			}if(!Character.isDigit(man.charAt(k))){
				return false;
				//if the character is not a digit, return false
			
			}
			else {
			num = num + (Integer.parseInt((String.valueOf(man.charAt(k)))) * counter);
			counter--;
			}
		}
		if(num % 11 == 0) {
		return true;
		}else
			return false;
	}
		
		 
	/**
	 * 16. Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isPangram(String string) {
		// TODO Write an implementation for this method declaration
		if(string == "") {
			return false;
		}
		
		
		String abc = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
		String[] alpha = abc.split(",");
		
		
		for(int i = 0; i < alpha.length; i++) {
for(int j=0; j<string.length(); j++) {			
			if(!string.contains(alpha[i])) {
				return false;
			}

		}
	}
		return true;

	}

	/**
	 * 17. Calculate the moment when someone has lived for 10^9 seconds.
	 * 
	 * A gigasecond is 109 (1,000,000,000) seconds.
	 * 
	 * @param given
	 * @return
	 */
	public Temporal getGigasecondDate(Temporal given) {
		// TODO Write an implementation for this method declaration
	
	
			if(given instanceof LocalDateTime) {
				given = given.plus(1000000000, ChronoUnit.SECONDS);
				// chronounit:  provide unit-based access to manipulate a date, time or date-time
				System.out.println(given);
				return given;
			}
			else{
				LocalDateTime today = ((LocalDate) given).atStartOfDay();
				today = today.plus(1000000000, ChronoUnit.SECONDS);
				System.out.println(today);
				return today;
			}
		}
	

	/**
	 * 18. Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 * 
	 * @param i
	 * @param set
	 * @return
	 */
	public int getSumOfMultiples(int i, int[] set) {
		// TODO Write an implementation for this method declaration

			int sum = 0;
			
			HashSet<Integer> spam = new HashSet<Integer>();
			
			//must be less than integer

			for(int j = 1; j < i; j++ ) {
				
				for(int k = 0; k < set.length; k++) {
					//going through the length of the set
					
					if(j % set[k]== 0) {
						
						
						spam.add(j);
						//to be stored into the iterator to save the multiples
						
					}
				}
			}
				Iterator itr = spam.iterator();
				//found someone from another batch to help with this iterator 
				while(itr.hasNext()) {
					sum += Integer.parseInt(itr.next().toString());
				}
			
			return sum;
		}
	

	/**
	 * 19. Given a number determine whether or not it is valid per the Luhn formula.
	 * 
	 * The Luhn algorithm is a simple checksum formula used to validate a variety of
	 * identification numbers, such as credit card numbers and Canadian Social
	 * Insurance Numbers.
	 * 
	 * The task is to check if a given string is valid.
	 * 
	 * Validating a Number Strings of length 1 or less are not valid. Spaces are
	 * allowed in the input, but they should be stripped before checking. All other
	 * non-digit characters are disallowed.
	 * 
	 * Example 1: valid credit card number 1 4539 1488 0343 6467 The first step of
	 * the Luhn algorithm is to double every second digit, starting from the right.
	 * We will be doubling
	 * 
	 * 4_3_ 1_8_ 0_4_ 6_6_ If doubling the number results in a number greater than 9
	 * then subtract 9 from the product. The results of our doubling:
	 * 
	 * 8569 2478 0383 3437 Then sum all of the digits:
	 * 
	 * 8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80 If the sum is evenly divisible by 10,
	 * then the number is valid. This number is valid!
	 * 
	 * Example 2: invalid credit card number 1 8273 1232 7352 0569 Double the second
	 * digits, starting from the right
	 * 
	 * 7253 2262 5312 0539 Sum the digits
	 * 
	 * 7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57 57 is not evenly divisible by 10, so
	 * this number is not valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isLuhnValid(String string) {
		// TODO Write an implementation for this method declaration
		int everything = 0;
		if(string.length() <= 1) {
			//Validating a Number Strings of length 1 or less are not valid.
			//find if the number is divisable by 10
			return false;
		}
		string = string.replace(" ", "");
		//replace the string spaces to no spaces
		//get string to return integer

		for(int i = 0; i <string.length(); i++) {
			//read the entire string
		if(!Character.isDigit(string.charAt(i))) {
			//ignore all characters that aren't digits
			 return false;
			}
		}
		int count = 0;

//		if(everything % 10 == 0) {
//			//numbers are divisible by 10
//			return true;
		
		for(int j = string.length()-1; j >= 0 ; j--) {
			//doubled starting from the right
			
			char apples = string.charAt(j);

			
			if(count % 2 == 0) {
				
						
				everything += Integer.parseInt(Character.toString(apples));
				//returns int
				
			}else {
			
				int bytwo = Integer.parseInt(Character.toString(apples));
				bytwo = bytwo * 2;
				if(bytwo > 9) {
					bytwo = bytwo - 9;
				}
				everything += bytwo;
			}
			count++;
		}
		if(everything % 10 == 0) {
			//numbers are divisible by 10
			return true;
			
		}
		return false;
	}

	/**
	 * 20. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	public int solveWordProblem( String string) {
		// TODO Write an implementation for this method declaration
		String[] words = string.split("[ ?]");
		//break off the string at the question mark.
		int request = 0;
		for(int i = 0; i < words.length; i++) {
			if(words[i].equals("plus")) {
				request = Integer.parseInt(words[i-1]) + Integer.parseInt(words[i+1]);
				//parse the string so the strings before plus would be the first numbers and the integers after plus
				//would be added to the first
				//make sure it's Integer.parseInt.
		}
			if(words[i].equals("minus")) {
				request = Integer.parseInt(words[i-1]) - Integer.parseInt(words[i+1]);
			}
			
			if(words[i].equals("divided")) {
				request = Integer.parseInt(words[i-1]) / Integer.parseInt(words[i+2]);
			}
			
			if(words[i].equals("multiplied")) {
				request = Integer.parseInt(words[i-1]) * Integer.parseInt(words[i+2]);
			}
			
		}
		return request;


}
	
	
		 
}
		 


