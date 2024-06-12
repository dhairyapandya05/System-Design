//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Channel ch = new Channel();
        Subscriber s1 = new Subscriber("Amit");
        Subscriber s2 = new Subscriber("Jignesh");
        Subscriber s3 = new Subscriber("Rajan");
        Subscriber s4 = new Subscriber("Mohan");
        Subscriber s5 = new Subscriber("Tridev");
        Subscriber s6 = new Subscriber("Aloknath");
        ch.subscribe(s1);
        ch.subscribe(s2);
        ch.subscribe(s3);
        ch.subscribe(s4);
        ch.subscribe(s5);
        ch.subscribe(s6);
        s1.subscribeChannel(ch);
        s2.subscribeChannel(ch);
        s3.subscribeChannel(ch);
        s4.subscribeChannel(ch);
        s5.subscribeChannel(ch);
        s6.subscribeChannel(ch);
        ch.upload("How to start Programming");
    }
}