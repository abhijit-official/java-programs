
class Person {
    public int id;
    public String name;

    void display(){
        System.out.println(name +" "+id);
    }
}

class Employee1 extends Person {
    public int salary;

    void display(){
        System.out.println(name +" "+id+" "+salary);
    }
    
}
class Student1 extends Person{
    public int fees;

    void display(){
        System.out.println(name +" "+id+" "+fees);
    }
    public static void main(String args[]) {
        Student1 s1 = new Student1();
        Employee1 e1 = new Employee1();

        s1.name = "asdasd";
        s1.id= 10;
        s1.fees = 1000;
        e1.salary =1000;
        e1.id=1;
        e1.name="test";


        e1.display();
    }
    
}