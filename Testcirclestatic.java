class circleStatic{
private double radius;

private static int numberofobjects = 0;


public void setradius(double a)
{
radius=a;
numberofobjects++;
}

public double getradius(){
     return radius;
     }
    public static int getnumberofobjects()
    {
    return numberofobjects;
    }
    public void findarea()
    {
    double area;
    area=3.14*radius*radius;
    System.out.print("the area is :" + area);
    }
    }
    public class TestcircleStatic{

    public static void main(String[] args){
    circleStatic circle1 = new circleStatic();
    System.out.print("circle information");
    circle1.setradius(5);
    System.out.print("circle1 radius:" +circle1.getradius());
    System.out.print("The number of circle objects:" + 
    circleStatic.getnumberofobjects());
    circleStatic circle2 = new circleStatic();
    circle1.findarea();
    circle2.setradius(5);
    System.out.print("circle1 radius:" + circle2.getradius());
    System.out.print("The number of circle objects:" + 
    	circleStatic.getnumberofobjects());
    cicle2.findarea();
    }
  }    