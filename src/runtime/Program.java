
package runtime;

import data.StudentManagement;
import ui.Menu;



public class Program {

    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
//        dựng menu
        Menu menu = new Menu("STUDENT MANAGEMENT <3");
        menu.addNewOption("Add student");
        menu.addNewOption("Edit student");
        menu.addNewOption("Delete student");
        menu.addNewOption("Search student by id");
        menu.addNewOption("Sort student by gpa");
        menu.addNewOption("Print student list");
        menu.addNewOption("Exit");
        int choice;
        do{
            menu.print();
            choice = menu.getChoice();
            switch(choice){
                case 1:{
                    sm.addStudent();
                    break;
                }
                case 2:{
                    sm.editStudentByID();
                    break;
                }
                case 3:{
                    sm.removeStudent();
                    break;
                }
                case 4:{
                    sm.searchStudentById();
                    break;
                }
                case 5:{
                    sm.sortStudentListByGpa();
                    break;
                }
                case 6:{
                    sm.printStudentList();
                    break;
                }
                case 7:{
                    System.out.println("See you again");
                    break;
                }
            }
        }while(choice != 7);
    }  
}
/////////////////////////////////////////////////////
/*
 * StudentManagerment System
 * 1. Add student
 * 2. 
 * 3. Delete student
 * 4. Search student by id
 * 5. Sort student by gpa
 * 6. Print list hoc sinh
 * 7. Exit
 * */