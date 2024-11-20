package task5_classes;

public class Time implements Comparable<Time>{	
	public int hour;
	public int minute;
	public int second;
	
	public Time(int hour,int minute,int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}	
	
	 public void setTime(int hour, int minute, int second) {
	        if (hour < 0 || hour > 23) {
	            throw new IllegalArgumentException("Invalid hour: " + hour);
	        }
	        if (minute < 0 || minute > 59) {
	            throw new IllegalArgumentException("Invalid minute: " + minute);
	        }
	        if (second < 0 || second > 59) {
	            throw new IllegalArgumentException("Invalid second: " + second);
	        }
	        this.hour = hour;
	        this.minute = minute;
	        this.second = second;
	    }
	
	
	public String toUniversal() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public String toStandard() {
		int standardHour = hour % 12 == 0 ? 12 : hour % 12;
        String amPm = hour < 12 ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", standardHour, minute, second, amPm);
	}
	
	
	 public void add(Time other) {
	        this.second += other.second;
	        this.minute += this.second / 60;
	        this.second %= 60;

	        this.minute += other.minute;
	        this.hour += this.minute / 60;
	        this.minute %= 60;

	        this.hour += other.hour;
	        this.hour %= 24;
	 }
	 
	 @Override
	 public int compareTo(Time anotherTime) {
		 if (this.toUniversal().equals(anotherTime.toUniversal()) && this.toStandard().equals(anotherTime.toStandard())) {
		        return 0; 
		 }
		 
		 int thisTotalSeconds = this.hour * 3600 + this.minute * 60 + this.second;
		 int otherTotalSeconds = anotherTime.hour * 3600 + anotherTime.minute * 60 + anotherTime.second;
		 return Integer.compare(thisTotalSeconds, otherTotalSeconds);
	 }
	
}
