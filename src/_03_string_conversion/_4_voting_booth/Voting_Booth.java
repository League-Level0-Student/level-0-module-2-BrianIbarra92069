package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Voting_Booth {

public static void main(String[] args) {

	
	
	String ageToVote = JOptionPane.showInputDialog("How Old are you?");
	
	
	int voteAsInt = Integer.parseInt(ageToVote);
	
	if (voteAsInt > 16) {
		JOptionPane.showMessageDialog(null, "You may be able to vote");
	}
	if (voteAsInt <= 16) {
		JOptionPane.showMessageDialog(null, "Come back when your older");
	}
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
