//1 eager initialisation
//public class Abc {
//    private static Abc instance=new Abc();
//    private Abc(){
//        System.out.println("_____________Instance Created_____________");
//    }
//    public static Abc getinstance(){
//        if(instance== null){
//            instance= new Abc();
//        }
//        return instance;
//    }
//}


//2 lazy initialisation
//public class Abc {
//    private static Abc instance;
//    private Abc(){
//        System.out.println("_____________Instance Created_____________");
//    }
//    public static Abc getinstance(){
//        if(instance== null){
//            instance= new Abc();
//        }
//        return instance;
//    }
//}//problem it is not thread safe

//3 Synchronised keyword
//public class Abc {
//    private static Abc instance;
//    private Abc(){
//        System.out.println("_____________Instance Created_____________");
//    }
//    public static synchronized Abc getinstance(){
//        if(instance== null){
//            instance= new Abc();
//        }
//        return instance;
//    }
//}//Problem synchronised method increases the timecomplexity

//4 try catch block in the main function

//5 double checked locking
public class Abc {
    private static Abc instance;
    private Abc(){
        System.out.println("_____________Instance Created_____________");
    }
    public static Abc getinstance(){
        if(instance== null){
            synchronized (Abc.class){
                if(instance==null){
                    instance= new Abc();
                }
            }
        }
        return instance;
    }
}
