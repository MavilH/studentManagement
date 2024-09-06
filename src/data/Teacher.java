
package data;
//Teacher.java: iD, nameTeacher, major, age
public class Teacher {
   private String id;
   private String teacherName;
   private String major;
   private int age;
//phễu
    public Teacher(String id, String teacherName, String major, int age) {
        this.id = id;
        this.teacherName = teacherName;
        this.major = major;
        this.age = age;
    }
//getter setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   
}
