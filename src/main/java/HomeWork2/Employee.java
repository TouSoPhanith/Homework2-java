package HomeWork2;

public class Employee {
    private int eid;
    private String name;
    private String surname;
    private int age;

    public Employee(int eid, String name, String surname, int age) {
        this.eid = eid;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Getters and Setters
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
