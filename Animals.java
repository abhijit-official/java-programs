class Animals {
     public String name;
     public int height;
     void display(){
     System.out.println(name+" "+height);
    }
}
class Dog extends Animals {
    public String bark;
   void display(){
     System.out.println(name+" "+height+" "+bark);
    }
}
class Cat extends Animals{
    public String meow;
void display(){
     System.out.println(name+" "+height+" "+meow);
    }

public static void main(String args[]) {
    Cat c1 = new Cat();
    c1.name = "Cat";
    c1.height = 22;
    c1.meow = "meow";

    c1.display();

    Dog D1 = new Dog();
    D1.name ="Dog";
    D1.height = 32;
    D1.bark = "bark";

    D1.display();

}


}

