class Point{
      private float x1;
      private float x2;

      Point(){
      this.x1=0;
      this.x2=0
      }
      Point (float x1,float x2){
      this.x1 = x1;
      this.x2 = x2;
      }
    void setValue1(float x1){
    this.x1 = x1;
    }
    void setValue2(float x2){
    this.x2 = x2;
    }
    float getValue1(){
    return x1;
    }
    float getValue2(){
    return x2;
    }
    float calculateDistance(Point p2){
    float dist = (float) Math.sqrt(Math.pow((getValue1()-p2.getValue1()),2) +
    Math.pow((getValue2()-p2.getValue2()),2));
    return dist;
    }
 }
 class PointTest{
 public static void main(String) [] args)
 float x1,x2;
 float y1,y2;
 String dist;
 float distance;
 Scanner scan = new Scanner(System.in);
 System.out.print("Enter value for x1 :");
 x1=scan.nextFloat();
 System.out.print("Enter value for x2 :");
 x2=scan.nextFloat();
 System.out.print("Enter value for y1 :");
 y1=scan.nextFloat();
 System.out.print("Enter value for y2 :");
 y2=scan.nextFloat();


    Point pt1 = new Point(x1,x2);
    Point pt2 = new Point(y1,y2);
    distance=pt1.calculateDistance(pt2);
    System.out print("The distance between Point 1: ("+pt1.getValue1()+","+pt1.getValue2()+")");
    System.out.print("Point 2: ("+pt2.getValue1()+","pt2.getValue2()+") is");
    System.out.println(String.format("%7.2f",distance));



























