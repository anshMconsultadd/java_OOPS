package inheritence;

 class Animal {
     int legs;
     int hands;
     Animal(int legs,int hands) {
         System.out.println("parent constructor called");
         this.legs = legs;
         this.hands = hands;
     }
    public void eat() {
        System.out.println("dog food");
    }
}
     class Dog extends  Animal{
     String breed;
       Dog(int legs,int hands,String breed){
           super(legs,hands);
           System.out.println("child constructor called");

           this.breed=breed;

       }
        public void bark(){

            System.out.println("dog barks ");
        }
    }

       class Testinheritence {
       public static void main(String[] args) {
//           Animal a =new Animal(2,2);
           Dog d=new Dog(2,2,"germanShephard");
           System.out.println("after cinstrcutpr is csalled");
           d.eat();
           d.bark();

       }
}

