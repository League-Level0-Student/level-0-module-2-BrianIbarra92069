package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lotterynumbers {

public static void main(String[] args) {
	
	Random randomNumber = new Random ();
	
	
	int randomSystem = randomNumber.nextInt(7);
	int randomMessage = randomNumber.nextInt(7);
	int randomMail = randomNumber.nextInt(7);
	int randomSound = randomNumber.nextInt(7);
	int randomClass = randomNumber.nextInt(7);
	int randomPictures = randomNumber.nextInt(7);
	String Message = randomSystem+""+randomMessage+""+randomMail+""+randomSound+""+randomClass+""+randomPictures;
	JOptionPane.showMessageDialog(null, Message);
	
	
	
	
	
	
	
} 
}
