package Java;

public class conditionalStatements {
    public static void main(String[] args) {
        //if else
        int a = 9;
        int b = 80;
        System.out.println(a > b);
        //switch case
        int age = 9;
        switch (age) {
            case 18:
                System.out.println("mature");
                break;
            case 25:
                System.out.println("extra mature");
                break;
            case 10:
                System.out.println("kid");
                break;
            default:
                System.out.println("ps go home");
        }
    }
}
