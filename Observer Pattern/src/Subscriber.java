public class Subscriber {
    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(Subscriber sb){
        System.out.println("Video Updated for "+sb.name);
    }
    public void subscribeChannel(Channel ch){
        channel=ch;
    }

}
