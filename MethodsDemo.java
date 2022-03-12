package march12;

public class MethodsDemo {
    public static void main(String[] args) {
        //method - a set of rules written within a block{}
        //function - if a function is written inside the class it is called a method
        //method declaration
        //method body
        //method call

        System.out.println(add(4,6));
        System.out.println(add(9,34));
        System.out.println(add(11,8475));
    }

    private static int add(int a,int b) {
        System.out.println("entering add()");
        System.out.println("existing add()");
        return a+b;
    }
}
