public class Hello {
    public int number;
    public String name;

    Hello(int no,String n){
        number = no;
        name = n;
    }
    public void display() {
        System.out.println("roll no is "+ number);
        System.out.println("name is "+ name);
    }
    public static void main(String args[]) {
        Hello h1= new Hello(1,"asbhijit");
        h1.display();
    }
}
