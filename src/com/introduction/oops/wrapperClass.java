package com.introduction.oops;


class DemoFinal{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("destrcuotr called");
    }
}

public class wrapperClass {
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }


    public static void main(String[] args) {
        Integer a= new Integer(10);
        Integer b= new Integer(20);


        for (int i=0;i<1;i++){
            DemoFinal obj=new DemoFinal();
        }
        swap(a,b);
        System.out.println(a+" "+b);

    }
}


