public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("asdasd");
        System.out.println(s1.getName());
    }
}
