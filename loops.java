package march12;

public class loops {
    public static void main(String[] args) {
        //for - sequence
        //while - condition
        for (int i = 0; i < 10; i++) {
            i = i * 7;
            System.out.println(i);
        }
        System.out.println("------------------------------------------------------------------");
        int j = 0;
        while (j < 10) {
            j = j*7;
            j = j + 1;
            System.out.println(j);
        }
    }
}
