public class Person {
    String fname;
    String lname;
    Integer age;

    public Person() {
        this.fname = "Jhon";
        this.lname = "Doe";
        this.age = 35;
    }

    public Person(String fname, String lname, Integer age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(
            "Name: " + fname + " " + lname +
            "\nAge: " + age
        );
    }
}
