class Tee{
	public void display()
	{System.out.println("test is displayed");}
}
class TeeDemo
{public static void main(String args[])
{Tee t=null;
	try{

	t.display();
}
catch(Exception e)
{
System.out.println(e);
}
}
}