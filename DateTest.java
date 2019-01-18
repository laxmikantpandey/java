import java.utill.Scanner;
public class DateTest{
   public static void main (String[] args){
   Date display = new Scanner (System.in);

   int month;
   int day;
   int year;
   System.out.println("Enter Month: ");
   month = input.nextInt();
   display.setMonth(month);

   system.out.println ();

   System.out.print("Enter Day: ");
   day = input.nextInt();
   display.setday(day);

   System.out.println ();

   System.out.print("Enter Year: ");
   year = input.nextInt();
   display.setYear(year);

   System.out.println ();

   display.displayDate();
   }
  }
  public int getMonth(){
  	return month;
  }

  public void setday (int day){

  	if(day >=1 && day <=31){
  		this.day = day;
  	}
  	else{
  		System.out.println("Invalid Day");
  	}
  }
  public int getDay(){
  	return day;
  }

  public void setYear (int year){

  	if(year>=1990 && year <=2100){
  	this.year = year;
  	}
  }
  public int getYear(){
  return year;
  }

  public void displayDate (){
  System.out printf("%d/%d/%d\n",getMonth(),getDay(,getYear());
  }
 } 		
























