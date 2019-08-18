import java.util.ArrayList;

public class VoteProcessor {
	
	
	public String calculateElectionWinner(ArrayList<String> votes) {
		int popeFrancis = 0;
		int edwardSnowden = 0;
		
		for(int i = 0; i < votes.size(); i++) {
			if(votes.get(i).equalsIgnoreCase("pope francis")) {
				popeFrancis ++;
			} else if(votes.get(i).equalsIgnoreCase("edward snowden")) {
				edwardSnowden ++;
			}
		}
		
		if(popeFrancis > edwardSnowden) {
			return "pope francis";
		} else if(popeFrancis < edwardSnowden) {
			return "edward snowden";
		} else if(popeFrancis == edwardSnowden) {
			return "TIE";
		}
		
		return "";
	}
}
