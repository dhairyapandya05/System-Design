//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Abc abc1=Abc.getinstance();

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Abc abc2=Abc.getinstance();

            }
        });

        t1.start();
//    try{Thread.sleep(10);} catch (Exception e){}
        t2.start();
    }
}