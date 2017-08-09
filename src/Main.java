import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {

        methodRankPoints(255.7);
        Temparature(99.00);
        Addition(5,5);

        Testing t1= new Testing();
        t1.Subtraction(10,5);
        Login.Logging("Manohar",1234);
        System.out.println("hi");
        System.out.println("hiiiiii pavan");

         MyClass.print();

        System.out.println("hello guys");

    }
    /*
        Created by Harsha
     */
    public static void methodRankPoints(double points) {
        if (points >= 202.5) {
            System.out.println("Rank:A1");
        }else if (points >= 122.4) {
            System.out.println("Rank:A2");
        }else {
            System.out.println("Rank:A3");
        }
    }
    /*
    created by Manohar
    * */

    public static void Temparature(double temp){
        System.out.println("Please Enter your Temparature");

        if(temp<98.00)
            System.out.println("person infected by Low Fever Please consult Doctor");
        else if(temp==98.00)
            System.out.println("Normal body Temparature ");
                else{
            System.out.println("High Fever please go forward with Tests for determine infection");
        }

    }

    /*
    Author: Pavan
    Date: 08-09-2017
     */

    public static void Addition(int x, int y){

        int result = x+y;
        System.out.println("Result Value:"+result);
    }

    public static void Test(){

        System.out.println("Test");
        System.out.println("Test1");

    }
}

