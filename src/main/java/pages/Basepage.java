package pages;

import java.util.Random;

public class Basepage {
	

	
		int randomNumber;
		
		public int generateRandomNumber(int boundary) {
			
			Random randomItem = new Random();
			randomNumber= randomItem.nextInt(boundary);
			return randomNumber;
		}
	}
	
	

