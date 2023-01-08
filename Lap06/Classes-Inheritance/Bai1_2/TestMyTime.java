package homework7.src.Bai1_2;

public class TestMyTime
{
    public static void main(String[] args)
    {
        MyTime myTime1 = new MyTime();
        System.out.println(myTime1);

        MyTime myTime2 = myTime1.nextSecond();
        System.out.println(myTime2);
        MyTime myTime3 = myTime1.nextMinute();
        System.out.println(myTime3);
        MyTime myTime4 = myTime1.nextHour();
        System.out.println(myTime4);

        MyTime myTime5 = myTime1.previousSecond();
        System.out.println(myTime5);
        MyTime myTime6 = myTime1.previousMinute();
        System.out.println(myTime6);
        MyTime myTime7 = myTime1.previousHour();
        System.out.println(myTime7);
    }
}
