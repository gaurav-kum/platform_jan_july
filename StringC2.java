public class StringC2 {
    public static void main(String[] args) {
//        we can change strings
        StringBuffer sb = new StringBuffer("Naveen");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" Reddy");
        System.out.println(sb);
//        to convert to string
//        String str = sb.toString();
        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.insert(0, "Java ");
        System.out.println(sb);
    }
}
