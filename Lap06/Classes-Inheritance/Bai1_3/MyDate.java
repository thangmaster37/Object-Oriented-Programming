package homework7.src.Bai1_3;

import javax.print.DocFlavor;

public class MyDate
{
    private int day;
    private int month;
    private int year;
    private String[] MONTHS = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    private String[] DAYS = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    private int[] DAYS_IN_MONTHS = {31,28,31,30,31,30,31,31,30,31,30,31};
    private int[] x = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
    public boolean isLeapYear(int year){
        if ((year >= 1 && year <= 9999) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))){
            return true;
        }
        return false;
    }

    public boolean isValidDate(int year, int month, int day)
    {
        if (month >= 1 && month <= 12)
        {
            changeDay(year);
            if (day >= 1 && day <= DAYS_IN_MONTHS[month - 1])
            {
                return true;
            }
        }
        DAYS_IN_MONTHS[1] -= 1;
        return false;
    }

    public int getDayOfWeek(int year, int month, int day)
    {
        if (isValidDate(year, month, day)){
            if (month < 3)
            {
                year -= 1;
            }
            int number = (year + (year / 4) - (year / 100) + (year / 400) + x[month - 1] + day) % 7;
            return number;
        }
        return -1;
    }

    public MyDate(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDate(int year, int month, int day){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        if (isValidDate(year, month, day)){
            return DAYS[getDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[month - 1] + " " + year;
        }
        return "Invalid year, month, or day!";
    }

    public void changeDay(int year){
        if (isLeapYear(year)){
            DAYS_IN_MONTHS[1] = 29;
        }
        else {
            DAYS_IN_MONTHS[1] = 28;
        }
    }

    public MyDate nextDay(){
        if (isValidDate(year, month, day)){
            changeDay(year);
            if (month == 12 && day == 31){
                return new MyDate(year + 1, 1, 1);
            }
            else if (day == DAYS_IN_MONTHS[month - 1]) {
                return new MyDate(year, month + 1, 1);
            }
            return new MyDate(year, month, day + 1);
        }
        return null;
    }

    public MyDate nextMonth(){
        if (isValidDate(year, month, day)){
            changeDay(year);
            if (month == 12){
                return new MyDate(year + 1, 1, day);
            }
            else if (day == DAYS_IN_MONTHS[month - 1]) {
                return new MyDate(year, month + 1, DAYS_IN_MONTHS[month]);
            }
            return new MyDate(year, month + 1, day);
        }
        return null;
    }

    public MyDate nextYear(){
        changeDay(year);
        if (isValidDate(year, month, day)){
            if (isLeapYear(year) && month == 2 && day == 29){
                return new MyDate(year + 1, month, 28);
            }
            else if (!(isLeapYear(year)) && month == 2 && day == 28) {
                if (isLeapYear(year + 1)){
                    return new MyDate(year + 1, month, 29);
                }
                else {
                    return new MyDate(year + 1, month, 28);
                }
            }
            return new MyDate(year + 1, month, day);
        }
        return null;
    }

    public MyDate previousDay(){
        changeDay(year);
        if (isValidDate(year, month, day)){
            if (month == 1 && day == 1){
                return new MyDate(year - 1, 12, DAYS_IN_MONTHS[11]);
            }
            else if (day == 1) {
                return new MyDate(year, month - 1, DAYS_IN_MONTHS[month - 2]);
            }
            return new MyDate(year, month, day - 1);
        }
        return null;
    }

    public MyDate previousMonth(){
        changeDay(year);
        if (isValidDate(year, month, day)){
            if (month == 1){
                return new MyDate(year - 1, 12, day);
            }
            else if (day == DAYS_IN_MONTHS[month - 1]) {
                return new MyDate(year, month - 1, DAYS_IN_MONTHS[month - 2]);
            }
            return new MyDate(year, month - 1, day);
        }
        return  null;
    }

    public MyDate previousYear(){
        changeDay(year);
        if (isValidDate(year, month, day)){
            if (isLeapYear(year) && month == 2 && day == 29){
                return new MyDate(year - 1, month, 28);
            }
            else if (!(isLeapYear(year)) && month == 2 && day == 28) {
                if (isLeapYear(year - 1)){
                    return new MyDate(year - 1, month, 29);
                }
                else {
                    return new MyDate(year - 1, month, 28);
                }
            }
            return new MyDate(year - 1, month, day);
        }
        return null;
    }



}
