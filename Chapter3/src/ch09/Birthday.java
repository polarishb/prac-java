package ch09;

public class Birthday {

	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	
	public Birthday() {
		isValid = true;
	}
	
	public void setDay(int day) {
		switch (this.month) {
			case 1,3,5,7,8,10,12->{
				if(day < 0 || day > 31) {
					isValid = false;
					return;
				}
				this.day = day;
				break;
			}
			case 2->{
				if(day < 0 || day > 28) {
					isValid = false;
					return;
				}
				this.day = day;
				break;
			}
			case 4,6,9,11->{
				if(day < 0 || day > 30) {
					isValid = false;
					return;
				}
				this.day = day;
				break;
			}
		}

	}
	public void setMonth(int month) {
		if(month < 0 || month > 12) {
			isValid = false;
			return;
		}
		this.month = month;
	}
	public void setYear(int year) {
		if(year < 1900 || year > 3000) {
			isValid = false;
			return;
		}
		this.year = year;
	}
	
	public void showBirthday() {
		System.out.println(this.year + "³â" + this.month + "¿ù" + this.day + "ÀÏ");
	}
}
