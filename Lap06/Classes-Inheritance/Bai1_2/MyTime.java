package homework7.src.Bai1_2;

public class MyTime
{
    private int hour;
    private int minute;
    private int second;

    public MyTime(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String format(int elem){
        if (elem < 10){
            return "0" + elem;
        }
        return String.valueOf(elem);

    }

    public String toString(){
        return format(hour) + ":" + format(minute) + ":" + format(second);
    }
    public MyTime nextSecond(){
        if (hour == 23 && minute == 59 && second == 59){
            return new MyTime(00,00,00);
        }
        else if (second == 59) {
            return new MyTime(hour, minute + 1, 00);
        }
        else if (minute == 59 && second == 59) {
            return new MyTime(hour + 1, 00, 00);
        }

        return new MyTime(hour, minute, second + 1);

    }

    public MyTime nextMinute(){
        if (hour == 23 && minute == 59){
            return new MyTime(00, 00, second);
        }
        else if (minute == 59) {
            return new MyTime(hour + 1, 00, second);
        }
        return new MyTime(hour, minute + 1, second);
    }

    public MyTime nextHour(){
        if (hour == 23){
            return new MyTime(00, minute, second);
        }
        return new MyTime(hour + 1, minute , second);
    }

    public MyTime previousSecond(){
        if (hour == 00 && minute == 00 && second == 00){
            return new MyTime(23,59,59);
        }
        else if (second == 00) {
            return new MyTime(hour, minute - 1, 59);
        }
        else if (minute == 00 && second == 00) {
            return new MyTime(hour - 1, 59, 59);
        }

        return new MyTime(hour, minute, second - 1);

    }

    public MyTime previousMinute(){
        if (hour == 00 && minute == 00){
            return new MyTime(23, 59, second);
        }
        else if (minute == 00) {
            return new MyTime(hour - 1, 59, second);
        }
        return new MyTime(hour, minute - 1, second);
    }

    public MyTime previousHour(){
        if (hour == 00){
            return new MyTime(23, minute, second);
        }
        return new MyTime(hour - 1, minute , second);
    }
}
