package com.introduction.oops;

 class Outerclass{

}

public class staticClass {


    static public class Test{
        static int a =10;
        static int b=20;
        static String name="ansh";
        void print (){
            System.out.println(Test.a+" "+Test.b);
        }
        public String toString(){
            return name;
        }
    }

    static int a=9;
    static int b;

    static {
        System.out.println("i am in main ");
        b=a*5;
    }

    public static void main(String[] args) {

        staticClass obj= new staticClass();


        System.out.println(staticClass.a+"  "+staticClass.b);
        Test t1=new Test();
        System.out.println(t1);
        staticClass.Test t2 = new staticClass.Test();
        System.out.println(t2);
    }
}


//com.introduction.oops.staticClass$Test@52cc8049
//com.introduction.oops.staticClass$Test@5b6f7412