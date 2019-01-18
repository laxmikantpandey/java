class box
{
double width,w;
double height,h;
double depth,d;
void setDim()
{
w=width;
h=height;
d=depth;
}
double volume()
{
return w*h*d;
}
class boxdemo
{
public static void main(Strings args[])
{
box b1= new box();
box b2= new box();
b1.width=2;
b1.height=5;
b1.depth=10;
b1.setdim();
vol=b1.volume;
System.out.println("volume is:"+vol);
}
}
}