package exercise2;

public class Duration {
    private int seconds;
    private int minutes;
    private int hours;

    public Duration(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }
    public Duration(int minutes, int seconds) {
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public String getSeconds() {
        if(seconds<=9) {
            return 0 + Integer.toString(seconds);
        }else {
            return Integer.toString(seconds);
        }
    }

    public void setSeconds(int seconds) {
        if (seconds>=0 && seconds<60){
            this.seconds = seconds;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public String getMinutes() {
        if(minutes<=9) {
            return 0 + Integer.toString(minutes);
        }else {
            return Integer.toString(minutes);
        }    }

    public void setMinutes(int minutes) {
        if (minutes>=0 && minutes<60){
            this.minutes = minutes;
        }else {
            throw new IllegalArgumentException();
        }    }

    public String getHours() {
        if(hours<=9) {
            return 0 + Integer.toString(hours);
        }else {
            return Integer.toString(hours);
        }
    }

    public void setHours(int hours) {
        if (hours>=0 && hours<60){
            this.hours = hours;
        }else {
            throw new IllegalArgumentException();
        }    }
}
