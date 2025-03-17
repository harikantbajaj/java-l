import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //System.out.print("hii");
        //System.out.print("hello");

        //boolean isStudent = false;
        //String name = harikant;
        //int age = 21;
        //System.out.println("the age is "+age);

        //if(isStudent){
            //System.out.println("you are student");
        
        //}else {
            //System.out.println("you are not student");
        //}
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("enter ur name");
        String name= scanner.nextLine();
        
        System.out.println("enter ur age");
        String age= scanner.nextLine();

        scanner.close();
        System.out.println("hii  "+name+age);


        




    }
}