package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        this(name, age, 0);
    }

    MemberConstruct(String name, int age, int grade) {
//        this.name = name;
//        this.age = age;
//        this.grade = grade;

//        this(name, age); // ?? whyrano
        System.out.println("생성자" + this.name + " " + this.age + " " + this.grade + " " + this.grade);
    }
}
