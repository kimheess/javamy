package chap06;

class Tv {
	String color;
	boolean power;
	int channel;
	
	
	void setPower() {
		power = !power;
	}
	
	void channelUp(){
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	public String toString() {
		String retStr = "�� TV�� ������"+ color + 
				"�̰� ���� ���� ���´�" + power + 
				"�̸�, ä���� " + channel + "�Դϴ�." ;
		
		return retStr;
	}
}
