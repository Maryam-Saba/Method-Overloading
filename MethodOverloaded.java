class Slow
{
int x;
int y;
int z;
String g;
Slow(String a)
{
g=a;
}
Slow()
{
x=9;
y=65;
}
Slow(int a, int b, int c)
{
x=a;
y=b;
z=c;
}
}

public class MethodOverloaded
{
public static void main(String args[])
{
Slow P= new Slow("Sleep");
Slow P2= new Slow();
Slow P3= new Slow(25,27,83);
System.out.println(P.g);
System.out.println(P2.x + "\t" + P2.y);
System.out.println(P3.x + "\t" + P3.y + "\t" + P3.z);
}
}