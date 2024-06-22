public class PhoneBuilder {
    String color,processor,os;
    int battery,core,yearoflaunch;

    public PhoneBuilder setcolor(String color){
        this.color=color;
        return this;
    }
    public PhoneBuilder setprocessor(String processor){
        this.processor=processor;
        return this;
    }
    public PhoneBuilder setos(String os){
        this.os=os;
        return this;
    }
    public PhoneBuilder setbattery(int battery){
        this.battery=battery;
        return this;
    }
    public PhoneBuilder setcore(int core){
        this.core=core;
        return this;
    }
    public PhoneBuilder setyearoflaunch(int yearoflaunch){
        this.yearoflaunch=yearoflaunch;
        return this;
    }

    public Phone build(){
        return new Phone(color,processor,os,battery,core,yearoflaunch);
    }
}
