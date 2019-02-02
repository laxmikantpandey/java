import java.util.*;
class ArrayListdemo1{
public static void main(String args[])
{
ArrayList<String> al=new ArrayList<String>();
System.out.println("initial size of al:"+al.size());
al.add("C");
al.add("A");
al.add("E");
al.add("D");
al.add("F");
al.add(1,"A2");
System.out.println("initial size additional al:"+al.size());
System.out.println("initial size additional al:"+al);
Iterator<String> itr=al.iterator();
while(itr.hasNext())
{
	String element=itr.next();
	System.out.print(element+" ");
	System.out.println("modified content");
	ListIterator<String> litr=al.listIterator();
	while(itr.hasNext())
String element=itr.next();
	System.out.print(element+" ");
}
System.out.println("previous element");
while(itr.hasNext())
{
	String element=itr.next();
	System.out.print(element+" ");
}
}
}