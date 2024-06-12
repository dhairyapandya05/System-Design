public class Assignment {
    private Pen p;

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }
    public void writeAssignment(String s){
        p.write(s);
    }
}
