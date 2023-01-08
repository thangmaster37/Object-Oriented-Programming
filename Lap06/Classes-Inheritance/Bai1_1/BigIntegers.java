package homework7.src.Bai1_1;
import java.math.BigInteger;
public class BigIntegers
{
    public static void main(String[] args)
    {
        BigInteger i1 = new BigInteger("11111111111111111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("22222222222222222222222222222222222222222222222222");
        BigInteger add = i1.add(i2);
        System.out.println(add);
        BigInteger multiply = i1.multiply(i2);
        System.out.println(multiply);
    }
}
