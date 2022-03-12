package march10;
//1. simple if
//2. if .... else
//3. nested if/if within a if
//4.else if

public class Conditional {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        if (a > b){
            System.out.println("a is greater than b");
        }else if (a == b){
            System.out.println("a is equal to b");
        } else {
            System.out.println("a is lesser than b");
        }
    }
}

//1. Take 3 numbers find the largest number
//2. Take 4 numbers find the smallest number
//3. take 4 numbers check if the first number and thrid number are equal
//    if they are equal add them
//    else add the second and fourth numbers