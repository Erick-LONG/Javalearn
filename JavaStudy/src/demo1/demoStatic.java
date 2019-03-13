package demo1;

public class demoStatic {
    public static void main(String[] args) {
        Student stu1 = new Student("郭靖",19);
        Student.room = "101";
        System.out.println(stu1.getAge() + stu1.getName() + Student.room +stu1.getId());
        Student stu2 = new Student("黄蓉",16);
        System.out.println(stu2.getAge() + stu2.getName() + Student.room +stu2.getId());
    }
}
