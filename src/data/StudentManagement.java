
package data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import util.Inputter;

public class StudentManagement {
    ArrayList<Student> stuList = new ArrayList<>();
    
    public int searchStudenIndextByID(String id){
        for(int i = 0; i <= stuList.size() - 1; i++){
            if(stuList.get(i).getID().equals(id)) return i;
        }
        return -1;
    }
    public Student searchStudentByID(String id){
        int pos = searchStudenIndextByID(id);
        return pos == - 1? null : stuList.get(pos);
    }
//    các hàm chức năng đề yêu cầu
    
//    thêm 1 student
    public void addStudent(){
        boolean isDup = false;
        String id;
        do{
            isDup = false;
            //      nhập chuỗi theo regex
            id = Inputter.getString("Input student ID", "Student ID should matched [SXXX]", "[sS]\\d{3}").toUpperCase();
            Student stTmp = searchStudentByID(id);
            isDup = stTmp != null;
            System.out.println(stTmp != null ? "ID has exsist" : "");
        }while(isDup);
        
        String nName = Inputter.getString("Enter student name", "Name cannot be blank");
        String ndob = Inputter.getString("Enter student dob", "Name cannot be blank");
        int nage = Inputter.getAnInteger("Enter student age", "Age should be a number");
        String nClassroom = Inputter.getString("Enter student classroom", "Classroom cannot be blank");
        Double weight = Inputter.getADouble("Enter student weight", "weight should be a number");
        Double height = Inputter.getADouble("Enter student height", "height should be a number");
        Double gpa = Inputter.getADouble("Enter student gpa", "gpa should be a number and 0 <= gpa <= 10",0, 10);
        
        Student nst = new Student(id, nName, ndob, nage, nClassroom, weight, height, gpa);
        stuList.add(nst);
        System.out.println("ADDING SUCCESSFULLY");
    }
   
//  tìm kiếm student dựa trên id
    public void searchStudentById(){
        String id;
        id = Inputter.getString("Input student ID", "Student ID should matched [STXXX]", "[(st)(ST)(St)(sT)]\\d{3}").toUpperCase();
        Student stTmp = searchStudentByID(id);
        if(stTmp == null){
            System.out.println("Student is not exist");
        }else{
            System.out.println(stTmp.toString());
        }
    }
    
//  in danh sách các học sinh
    public void printStudentList(){
        if(stuList.isEmpty()){
            System.out.println("Nothing to print!!!");
            return;
        }
        System.out.println("-------STUDENT LIST-------");
        for (Student student : stuList) {
            student.showInfor();
        }
    }
    
//    xóa 1 học sinh
    public void removeStudent(){
        String id = Inputter.getString("Input student ID you want to delete", "Student ID should matched [STXXX]", "[(st)(ST)(St)(sT)]\\d{3}").toUpperCase();
        Student stTmp = searchStudentByID(id);
        if(stTmp == null){
            System.out.println("Student is not exist");
        }else{
            stuList.remove(stTmp);
            System.out.println("Remove successfully");
            stTmp.showInfor();
        }
    }
//    Edit sutdent
    public void editStudentByID(){
        String nId = Inputter.getString("Input student ID you want to update", "Student ID should matched [STXXX]", "[(st)(ST)(St)(sT)]\\d{3}").toUpperCase();
        Student stTmp = searchStudentByID(nId);
        if(stTmp == null){
            System.out.println("Student is not exist");
        }else{
            String nName = Inputter.getString("Enter student name", "Name cannot be blank");
            String ndob = Inputter.getString("Enter student dob", "Name cannot be blank");
            int nage = Inputter.getAnInteger("Enter student age", "Age should be a number");
            String nClassroom = Inputter.getString("Enter student classroom", "Classroom cannot be blank");
            Double weight = Inputter.getADouble("Enter student weight", "weight should be a number");
            Double height = Inputter.getADouble("Enter student height", "height should be a number");
            Double gpa = Inputter.getADouble("Enter student gpa", "gpa should be a number and 0 <= gpa <= 10",0, 10);
            stTmp.setID(nId);
            stTmp.setAge(nage);
            stTmp.setNameStudent(nName);
            stTmp.setClassroom(nClassroom);
            stTmp.setDob(ndob);
            stTmp.setHeight(height);
            stTmp.setWeight(weight);
            stTmp.setGpa(gpa);
            System.out.println("Updating is successfully!!");
        }
    }
//  sắp xếp student theo gpa
    public void sortStudentListByGpa(){
        Comparator orderByGpa = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getGpa() > o2.getGpa()) return 1;
                return -1;
            }
            
        };
        Collections.sort(stuList, orderByGpa);
        System.out.println("Sorting successfully");
    }
    

}
    





