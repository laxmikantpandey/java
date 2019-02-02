import java.util.*;
class ExceptionTest{
public static void main(String [] args){
String s=null;
//Scanner scan = new Scanner(System.in);
//s=scan.next();
try{
if(s==null){
throw new Exception("u enterred a null String");
}
else{
System.out.println("the entered String is "+s);
}
}
catch(Exception e){
System.out.println(e);
}
finally{
System.out.println("the program executed successfully");
}
}
}