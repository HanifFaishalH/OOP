package jobsheet3.Tugas.Encap;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        EncapDemo encap1 = new EncapDemo();

        encap.setName("James");
        encap.setAge(35);

        System.out.println("Name : "+ encap.getName());
        System.out.println("Age : "+encap.getAge());
        
        encap1.setName("Walter");
        encap1.setAge(15);

        System.out.println("Name : "+ encap1.getName());
        System.out.println("Age : "+encap1.getAge());
    }
}