package Java;

public class methods {
    static void argsNoReturn(int a, int b){ //no return + arguement
        System.out.println(a+b);
    }

    static int returnWithArgument(int a, int b){ // return + arguement
        return a+b;
    }
    static void noReturnNoArgument(){ // no return + no arguement
        System.out.println("noargs no return");
    }
    static int returnWithoutArgument(){ // return + no arguement
        return 34;
    }
}
