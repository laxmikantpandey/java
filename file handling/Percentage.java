import java.io.*;
import java.util.*;
class Percentage {
   public static void main(String[] args) {
      File f = null;
      try {
            f = new File("data.txt");
            FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
	     Scanner sc = new Scanner(System.in);
       boolean flag=true;
       while(flag){
           System.out.print("Enter S.No:"); 	    
               bout.write(Integer.toString(sc.nextLine()));
               bout.write('');
               System.out.print("enter name:");
               bout.write(sc.next());              
               bout.write('');
               System.out.print("enter CGPA:")
               bout.write(Float.toString(sc.nextFloat()));
               System.out.print("enter grade: (A / B / C / D):");
               bout.write(sc.next().charAt(0));
               bout.newline();
               System.out.print("\ndo you want to continue entering data Y / N:");
               char c = sc.next().charAt(0));
               if(c=='n' || c=='N'){
               flag=false;
        }
        }
            bout.close();
}         
  