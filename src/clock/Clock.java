package clock;
/**
 *
 * @author Muhammad Huzaifa Alam Khan
 */
public class Clock {
    private int hour;
    private int min;
    private int sec;

    public Clock() {
        this.hour = 0;
        this.min = 0;
        this.sec = 0;
    }
    
    public Clock(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }
    
    public Clock(Clock clock) {
        this.hour = clock.hour;
        this.min = clock.min;
        this.sec = clock.sec;
    }
    
    /**
     * To increase hour by one
     */
    public void increaseHour() {
//        hour = (hour + 1) % 24;
    hour++;
    if (hour == 24)
        hour = 0;
    }
    
    /**
     * To increase minute by one
     */
    public void increaseMin() {
        min++;
        if (min == 60) {
            min = 0;
            increaseHour();
        }    
    }
    
    /**
     * To increase second by one
     */
    public void increaseSec() {
        sec++;
        if (sec == 60) {
            sec = 0;
            increaseMin();
        }
    }
    
    public boolean eqauls(Clock clock) {
        return this.hour == clock.hour &&
                this.min == clock.min &&
                this.sec == clock.sec;
    }

    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%02d:%02d:%02d", hour, min, sec);//00:00:00
        
        return str;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }
}