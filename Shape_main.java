package getShapes;

import java.util.Scanner;
import java.io.*;

public class Shape_main {

    static String fileName;
    static String [] shapename ; 
    static String shapes ; 
    static String s ; 
    static shape[] arr ; 
    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("x                                    IT IS MY FIRST CODING PROJECT                                                     x");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println();

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter source file name : ");
        fileName = inp.nextLine();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        readFromFile() ; 
        
         String file_content=readFromFileAndReurnt();
        
       
       String lines [] = file_content.split("\n") ; 
       arr = new shape[lines.length] ; 
       for(int i = 0 ; i<lines.length ; i++){
           String line = lines[i] ; 
     
           String[] e = line.split(":") ;
           if(e.length<=0){
           continue;
           }
             
           shape shape = new shape() ; 
           shape.file = e [0] ; 
           shape.name = e [1] ; 
          arr [i] = shape ; 
       }
        

        for(int i = 0 ; i<arr.length ; i++){
            
            System.out.println(  arr );
        }
        
    
           
Shape();
    }//main
 

    static String readFromFileAndReurnt() throws FileNotFoundException {
        File f = new File(fileName);
       String s="";
        if (f.exists()) {
            Scanner cin = new Scanner(f);
            while (cin.hasNext()) {
                 s += cin.nextLine()+"\n";
                
        }
            return s;
        }
       
        return "";
    }
      
    static void readFromFile() throws FileNotFoundException {
        File f = new File(fileName);

        if (f.exists()) {
            Scanner cin = new Scanner(f);
            while (cin.hasNext()) {
                String stLine = cin.nextLine();
                System.out.println(stLine);
        }
        }
       
    }

    static void Shape() throws FileNotFoundException, IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like the size to be multiplied? ");
        System.out.print("Enter number: ");
        int m = in.nextInt();
        File f = new File(fileName);
        Scanner input = new Scanner(f);

        while (input.hasNext()) {
           s = input.nextLine();  //Put what the scanner reads from the file in the s variable from string type
            String str = "";
            
            for (int i = 0; i < s.length(); ++i) {  //Until the contents of the s are exhausted
                for (int j = 1; j <= m; ++j) {
                    str += s.charAt(i);  //charAt-->input:int,output:char  +  Access to array cells
                }
            }
            for (int x = 0; x < m; ++x) {
                System.out.println(str);
            }
        }

        System.out.println("-------------------------------------------------------------------------------------------------------------------");

    }//square
     
     
}
