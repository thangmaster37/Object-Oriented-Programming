package homework7.src.Bai1_3;

public class TestMyDate
{
    public static void main(String[] args)
    {
        MyDate myDate0 = new MyDate(2012, 2, 28);
        System.out.println(myDate0);
        MyDate myDate2 = myDate0.nextDay();
        System.out.println(myDate2);
        MyDate myDate3 = myDate2.nextDay();
        System.out.println(myDate3);
        MyDate myDate4 = myDate3.nextMonth();
        System.out.println(myDate4);
        MyDate myDate5 = myDate4.nextYear();
        System.out.println(myDate5);
        System.out.println();

        MyDate myDate1 = new MyDate(2012, 1, 2);
        System.out.println(myDate1);
        MyDate myDate6 = myDate1.previousDay();
        System.out.println(myDate6);
        MyDate myDate7 = myDate6.previousDay();
        System.out.println(myDate7);
        MyDate myDate8 = myDate7.previousMonth();
        System.out.println(myDate8);
        MyDate myDate9 = myDate8.previousYear();
        System.out.println(myDate9);
        System.out.println();

        MyDate myDate = new MyDate(2012, 2, 29);
        System.out.println(myDate.previousYear());
        System.out.println();

        MyDate m1 = new MyDate(2099, 11, 31);
        System.out.println(m1);
        MyDate m2 = new MyDate(2011, 2, 29);
        System.out.println(m2);

    }
}
