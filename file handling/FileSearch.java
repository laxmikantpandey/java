import java.io.*;
 class FileSearch {
   
   public static void main(String[] args) {
      File f = null;
            try {
         
              File f = new File("file1.txt");
              FileReader fin = new FileReader(f);
        BufferedReader bin= new BufferedReader(fin);
        String search;
        System.out.println("enter the word to search: ");
        Scanner sc = new Scanner(System.in);
        search=sc.next();
        String sr;
        boolean flag=false;
        System.out.println("the contents of the file are:");

     while((sr=bin.readLine())!=null){
                         System.out.println(sr);
      String[] strs = sr.split(" ");
      for(int i=0;i<strs.length;i++){
      if (strs[i].equals(search)){
      flag=true;
      break;
      }
      }
    }
    if((sr=bin.readLine())==null && flag==false){
    System.out.print("\nNot Present");
    }
    else{
    System.out.print("\nPresent");
    }
    }
    catch (Exception e) {
        //if any I/O  error occurs
        e.printStackTrace();
        }
        }
        }