public class Student {
    private String name;
    private int roll_no;

    public int getRoll_no() {
        return roll_no;
    }
    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("asdasd");
        s1.setRoll_no(10);
        System.out.println(s1.getName());
        System.out.println(s1.getRoll_no());
    }
}
