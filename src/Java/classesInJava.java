package Java;

public class classesInJava {
    int value = 90;

    public static void main(String[] args) {
        classesInJava obj = new classesInJava();
        System.out.println(obj.value);
        nestedClass nestedObj= obj.new nestedClass();
        nestedObj.printNestedvar();
    }

    class nestedClass {
        int nestedvar = 23;

        void printNestedvar() {
            System.out.println("nested var is " + nestedvar);
        }
    }
}
