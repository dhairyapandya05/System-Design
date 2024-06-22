public class Phone {
        String color,processor,os;
        int battery,core,yearoflaunch;

        public Phone(String color, String processor, String os, int battery, int core, int yearoflaunch) {
            this.color = color;
            this.processor = processor;
            this.os = os;
            this.battery = battery;
            this.core = core;
            this.yearoflaunch = yearoflaunch;
        }
        public void displayspecs(){
            System.out.println("Below are the specifications of the phone");
            System.out.println("Color: "+this.color);
            System.out.println("Processor: "+this.processor);
            System.out.println("OS: "+this.os);
            System.out.println("Battery: "+this.battery);
            System.out.println("Core: "+this.core);
            System.out.println("Year of Launch: "+this.yearoflaunch);
        }
}
