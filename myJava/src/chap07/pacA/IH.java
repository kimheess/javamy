package chap07.pacA;

public class IH {
	
	
	private int score;
	
	public IH(int score){
		if(score >= 0 & score <= 100) {
			this.score = score;
		}
		else {
			this .score = 0;
		}
	}
	
	public void setScore(int score) {
		if(score >= 0 & score <= 100) {
			this.score = score;
		}
		else {
			this .score = 0;
		}
	}
	
	public int getScore() {
		return this.score;
	}
}
