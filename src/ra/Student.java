package ra;

import Config.InputMethods;

public class Student {
    private int id;
    private String name;
    private int age;
    private boolean gender;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public Student() {
    }

    public Student(int id, String name, int age, boolean gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void inputData(boolean idUpdate){
        if(idUpdate){
            System.out.println("nhap Id: ");
            this.id= InputMethods.getInteger();
        }
        System.out.println("nhập tên: ");
        this.name= InputMethods.getString();
        System.out.println("nập tuổi");
        this.age =InputMethods.getInteger();
        System.out.println("nhập giới tính");
        this.gender = InputMethods.getBoolean();
    }

    public void displayData(){
        System.out.printf("| ID : %-3s | Name: %-15s | Age: %-4s | Gender : %-4s |\n",id,name,age,(gender?"Nam":"Nữ"));
    }
}
