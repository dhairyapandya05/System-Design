public class PenAdapter implements Pen{
    Pilotpen pp = new Pilotpen();

    @Override
    public void write(String str) {
        System.out.println("We are at Pen Adapter class write function implemented from Pen interface");
        pp.mark(str);
    }
}
