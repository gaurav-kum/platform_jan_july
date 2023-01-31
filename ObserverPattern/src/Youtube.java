public class Youtube {
    public static void main(String[] args) {
        Channel telusko = new Channel();

        Subscriber s1 = new Subscriber("Akshay");
        Subscriber s2 = new Subscriber("Sonam");
        Subscriber s3 = new Subscriber("Poonam");

        telusko.subscribe(s1);
        telusko.subscribe(s2);
        telusko.subscribe(s3);

        s1.subscribeChannel(telusko);

        telusko.upload("java intro");
    }
}