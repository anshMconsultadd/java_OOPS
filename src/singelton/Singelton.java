package singelton;

public class Singelton {
    private  Singelton(){}
    static Singelton instance ;
    public static Singelton getinstance(){
        if (instance==null) instance=new Singelton();
        return instance;
    }
}
