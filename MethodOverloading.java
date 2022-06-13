class Addition
{
int x;
int y;
int z;
void Addition(int a, int b)
{
x=a;
y=b;
System.out.println("x+y=" +(x+y));
}
void Addition(int a, int b, int c)
{
x=a;
y=b;
z=c;
System.out.println("x+y+z=" +(x+y+z));
}
}
public class MethodOverloading
{
public static void main(String args[])
{
Addition P= new Addition();
P.Addition(700,300);
P.Addition(1000,400);
}
}