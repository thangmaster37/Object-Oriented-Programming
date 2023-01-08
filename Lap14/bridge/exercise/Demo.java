package bridge.exercise;

public class Demo
{
    public static void main(String[] args)
    {
        Computer myComputer = new PC(new WindowsOS());
        myComputer.startup();
        if(myComputer.canMoveComputer())
            System.out.println("Moving computer to a new location");

        myComputer.browseinternet("https://google.com");
    }
}
