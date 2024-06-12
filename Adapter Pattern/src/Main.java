//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pen pen = new PenAdapter();
        Assignment asg= new Assignment();
        asg.setP(pen);
        asg.writeAssignment("This is the content of the assignment");
    }
}
// Kaam Pen class kae object sae kavaya jaa raha hai
//lakin andar hi andar kaam Pilotpen ka object kar raha hai