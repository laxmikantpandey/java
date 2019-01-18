class circle
{
double radius;
double area;
void findarea()
{
area=3.14*radius*radius;
}
void displayarea()
{
System.out.println("The area is :"+ area);
}
}
classs circledemo
{
public static void main(String args[])
{
circle c=newcircle();
c.radius=2
c.findarea();
c.displayarea();
}
}