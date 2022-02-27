public class UpinIpin {
public static void main(String[] args) {
Item name = new Item("upin");
}
}
public class Item {
private String name;
private Item() {
name = "Ipin";
}
public Item(String name) {
System.out.println(this.name);
}
}

class KelasSatu
{
{
System.out.println(11);
}
static
{
System.out.println(2);
}
public KelasSatu(int i)
{
System.out.println(3);
}
public KelasSatu()
{
System.out.println(4);
}
}

class KelasDua
{
{
System.out.println(5);
}
public static void main(String[] args)
{
System.out.println(6);
KelasSatu satu = new KelasSatu();
KelasSatu dua = new KelasSatu(10);
}
}