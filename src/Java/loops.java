package Java;

public class loops {
    public static void main(String[] args) {

        //for loop
        for (int i = 0; i < 10; i++)
            System.out.println("for loop iteration num=" + i);

        //while loop
        int j = 0;
        while (j < 10) {
            System.out.println("while loop iteration=" + j);
            j++;
        }

        //do while loop
        int d = 0;
        do {
            System.out.println(" do while loop iteration=" + d);
            d++;
        } while (d < 10);
    }
}