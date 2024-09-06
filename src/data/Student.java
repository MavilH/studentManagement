
package data;
//Student.java: iD, nameStudent, dob, age, class, weight, height
public class Student {
    private String id;
    private String nameStudent;
    private String dob;
    private int age;
    private String classroom;
    private double weight;
    private double height;
    private double gpa;
// phễu 1
    public Student(String ID, String nameStudent, String dob, int age, String classroom, double weight, double height, double gpa) {
        this.id = ID;
        this.nameStudent = nameStudent;
        this.dob = dob;
        this.age = age;
        this.classroom = classroom;
        this.weight = weight;
        this.height = height;
        this.gpa = gpa;
    }
// phễu 2
    public Student(String id, String nameStudent) {
        this.id = id;
        this.nameStudent = nameStudent;
    }
// getter và setter

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getID() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setID(String ID) {
        this.id = ID;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
    
//    2 method print values
    public String printValues(int age){
        String str = String.format("Tuoi la: %d", age);
        return str;
    };

    public String printValues(String name, int age){
        String str = String.format("Tên: %s, tuoi: %d",name, age);
        return str;
    };

    @Override
    public String toString() {
         String str = String.format("Student: %-5s|%-5s|%-5s|%5d|%-5s|%.2f|%.2f|%.2f|", 
                                                id, nameStudent, dob, age, classroom, weight, height, gpa);
        return str;
    }
    
    public void showInfor(){
        String str = String.format("Student: %-5s|%-5s|%-5s|%5d|%-5s|%.2f|%.2f|%.2f|", 
                                                id, nameStudent, dob, age, classroom, weight, height, gpa);
        System.out.println(str);
    }
    
}
