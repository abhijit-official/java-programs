public class Employee{
    public int number;
    public String name;
    public Double salary;

    Employee(int number,String name, Double salary){
        this.number=number;
        this.name=name;
        this.salary=salary;

    }
    public void display (){
        System.out.println("roll number is "+ number);
        System.out.println("name is "+ name);
        System.out.println("salary  is "+ salary);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(123, "abhijit", 223.8);
        e1.display();
    }
        
}


