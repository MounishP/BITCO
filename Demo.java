package march16;

public class Demo {
    public static void main(String[] args) {
        ObjectDemo demo = new ObjectDemo();
        demo.setName("Mounish");
        demo.setPlace("Hyderabad");
        demo.country = "India";
        System.out.println(demo);


        ObjectDemo demo1 = new ObjectDemo();
        demo1.setPlace("Bangalore");
        demo1.setName("Raj");
        demo1.setCountry("India");
        System.out.println(demo1);

        ObjectDemo demo2 = new ObjectDemo();
        demo2.setPlace("Bangalore");
        demo2.setName("Raj");
        demo2.setCountry("India");
        System.out.println(demo2);
    }
}
