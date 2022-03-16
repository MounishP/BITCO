package march16;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int roll = 4567;
        Scanner scanner = new Scanner(System.in);
        InputReq req = new InputReq();
        System.out.print("Enter roll number: ");
        req.setRollNumber(scanner.nextInt());
        if (roll == req.getRollNumber()){
            OutputResponse response = new OutputResponse();
            response.getEnglish();
            System.out.println(response);
        }else {
            System.out.println("Roll number not found in DB");
        }
    }
}
