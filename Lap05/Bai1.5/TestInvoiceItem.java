package homework5;
public class TestInvoiceItem
{
    public static void main(String[] args)
    {
        InvoiceItem invl = new InvoiceItem("A101", "Pen Ped", 888, 0.08);
        System.out.println(invl);

        invl.setQty(999);
        invl.setUnitPrice(0.99);
        System.out.println(invl);
        System.out.println("id is: " + invl.getId());
        System.out.println("desc is: " + invl.getDesc());
        System.out.println("qty is: " + invl.getQty());
        System.out.println("unitPrice is: " + invl.getUnitPrice());

        System.out.println("The total is: " + invl.getTotal());
    }
}
