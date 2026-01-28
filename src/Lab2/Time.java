package Lab2;

public class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
    	if (hour >= 0 && hour < 24 
    	 && minute >= 0 && minute < 60 
    	 && second >= 0 && second < 60) {
    	            this.hour = hour;
    	            this.minute = minute;
    	            this.second = second;
    	        } else {
    	        	System.out.println("Invalid time input");
    	        }
    }

    public String toUniversal() {
        return (hour < 10 ? "0" : "") + hour + ":" +
               (minute < 10 ? "0" : "") + minute + ":" +
               (second < 10 ? "0" : "") + second;
    }

    public String toStandard() {
        int standardHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        String period = (hour < 12) ? "AM" : "PM";

        return (standardHour < 10 ? "0" : "") + standardHour + ":" +
               (minute < 10 ? "0" : "") + minute + ":" +
               (second < 10 ? "0" : "") + second + " " + period;
    }

    public void add(Time other) {
        int totalSeconds = (this.second + other.second);
        int extraMinutes = totalSeconds / 60;
        this.second = totalSeconds % 60;

        int totalMinutes = (this.minute + other.minute + extraMinutes);
        int extraHours = totalMinutes / 60;
        this.minute = totalMinutes % 60;

        this.hour = (this.hour + other.hour + extraHours) % 24;
    }
    
    public static void main(String[] args) {
        Time t1 = new Time(23, 5, 6);
        Time t2 = new Time(12, 10, 10);

        System.out.println("Time 1 (Universal): " + t1.toUniversal());
        System.out.println("Time 1 (Standard):  " + t1.toStandard());
        
        System.out.println("\n");
        
        System.out.println("Adding Time 2 (" + t2.toUniversal() + ")...");
        
        t1.add(t2);

        System.out.println("Result (Universal): " + t1.toUniversal());
        System.out.println("Result (Standard):  " + t1.toStandard());
    }
}