public class operatingsystemfactory {
    public os getInstance(String str){
        if(str.equals("Open")){
            return new android();
        }
        else if(str.equals("Closed")){
            return new ios();
        }
        return new android();
    }
}
