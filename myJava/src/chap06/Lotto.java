package chap06;

public class Lotto {
	int lotto[];
	
	Lotto(){ //�ζ� �迭 �ʱ�ȭ 
		this.lotto = new int[6];
		this.setLotto();
	}
	
	void setTempLotto() { //�ζ� ��ȣ ���� 
		for(int i=0; i<this.lotto.length; i++) {
			this.lotto[i] = (int)(Math.random() *45)+1;
		}
	}
	
	boolean duplicateCheck() { //�ߺ��� ���� 
		boolean isDuplicate = false;
		
		for(int i=0; i<this.lotto.length -1; i++) {
			for(int j = i+1; j<this.lotto.length;j++) {
				if(this.lotto[i] ==this.lotto[j]) {
					isDuplicate = true;
					break;
				}
			}
			if(isDuplicate) {
				break;
			}
		}
		return isDuplicate;
	}
	
	void sortLotto() { //���� ���� ���� 
		int temp;
		for(int i = 0; i<this.lotto.length -1; i++) {
			for(int j= i+1; j<lotto.length;j++) {
				if(lotto[i]>lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		return;
	}
	
	void setLotto() {
		while(true) {
			this.setTempLotto();
			
			if(!this.duplicateCheck()) {
				this.lotto=this.lotto;
				break;
			}
			
		}
	}
	
	int[] getLotto() {
		return this.lotto;
	}
	
	}
