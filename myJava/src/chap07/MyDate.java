package chap07;

class MyDate {
	private int year;
	private int month;
	private int day;
	
	MyDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
		
	}
	
	boolean isLeapYear() { 
		return this.isLeapYear(this.year);
	}
	
	boolean isLeapYear(int year) {
		boolean result = false;
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
			result = true;
		}
		return result;
	}
	
	int getMonthLastDays(int month) {
		int[] monthLastDays = {-1, 31, 28, 31, 30, 31, 30, 31,31,30,31,30,31};
		
		if(this.isLeapYear()) {
			monthLastDays[2] = 29;
		}
		
		return monthLastDays[month];
	}
	
	int getTotalDays() {
		int totalDays = 0;
		
		for(int i = 1; i < this.year; i++) {
			if(this.isLeapYear(i)) {
				totalDays += 366;
			}
			else {
				totalDays += 365;
			}
		} 
		
		for(int i = 1; i < month; i++) {
			totalDays += this.getMonthLastDays(i);
		}
		
		
		return totalDays + this.day;
	}
	
	String getWeekDays() {
		String [] weekdays = {"일","월","화","수","목","금","토"};
		
		return weekdays[this.getTotalDays() % 7 ];
	}
}

