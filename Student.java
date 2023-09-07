public class Student {

    private int age;
    private String name;


    public Student(){

    }
    public Student(String name) {
        this.name = name;
    }


    public static void main(String[] args) {

        Student student = new Student("Ajit");
        student.display();
        student.sayHello("Anshuman");
    }

    private void display() {

        System.out.println("My name is Ajit. I am 40 years old");
    }

    private void sayHello(String name) {

        System.out.println(this.name + " says hello to " + name);
    }

}
