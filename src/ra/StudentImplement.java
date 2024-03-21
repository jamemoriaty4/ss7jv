package ra;

import Config.InputMethods;

public class StudentImplement implements IDesignStudent {

    private static Student[] students = new Student[0];

    private static int indexOf(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void addNewStudent() {
        System.out.println("nhap vào so luong sinh vien can them moi!");
        byte count = InputMethods.getByte();

        Student[] newStudents = new Student[students.length+count];
        System.arraycopy(students,0,newStudents,0,students.length); // copy mảng
        for (int i = 0; i <count ; i++) {
            Student student = new Student();
            student.inputData(true);
            newStudents[students.length+i] = student;
        }
        students = newStudents;


    }

    @Override
    public void displayAllStudent() {
        if (students.length == 0) {
            System.err.println("Danh sách trống");
        } else {
            for (Student s : students) {
                s.displayData();
            }
        }
    }

    @Override
    public void updateInfoStudent() {
        System.out.println("nhâp mã sinh viên cần cập nhật !");
        int id = InputMethods.getInteger();
        int index = indexOf(id);
        if (index == -1) {
            System.err.println("không tìm thấy id phù hợp!");

        } else {
            System.out.println("Thông tin cũ sinh viên có id = " + id + " là");
            students[index].displayData();
            System.out.println("Nhập thông tin mới cho sinh viên");
            students[index].inputData(false);
            System.out.println("cập nhat thanh cong");
        }
    }

    @Override
    public void deleteStudent() {
        System.out.println("nhâp mã sinh viên cần xoá !");
        int id = InputMethods.getInteger();
        int index = indexOf(id);
        Student[] newStudent = new Student[students.length - 1];
        if (index == -1) {
            System.err.println("không tìm thấy id phù hợp!");
        } else {
            for (int i = 0; i < students.length; i++) {
                if (i != index) {
                    newStudent[index++] = students[i];
                }
            }
        }
        students = newStudent;
    }

    @Override
    public void findStudentById() {
        System.out.println("nhâp mã sinh viên cần xoá !");
        int id = InputMethods.getInteger();
        int index = indexOf(id);
        if (index == -1) {
            System.err.println("không tìm thấy id phù hợp!");
        }
        else{
            System.out.println("Thông tin sinh vien có id = " + id + " là");
         students[index].displayData();
        }


    }
}
