public class Main {

    public static void main(String[] args) {


        methodRankPoints(255.7);
        MinNumber mini = new MinNumber();
        mini.maxFunction(2,3);
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
}
