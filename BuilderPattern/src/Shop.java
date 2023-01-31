public class Shop {
    public static void main(String[] args) {
//        sequence doesn't matter
        Phone p = new PhoneBuilder().setOs("Android").setRam(2).getPhone();

        System.out.println(p);
    }
}