
package ui;

import java.util.ArrayList;
import util.Inputter;

/*
Menu: là 1 cái khuông chuyên đúc ra 1 ah quản lý danh sách các option trong menu
những lựa chọn(option): mình sẽ lưu vào 1 cái mảng optionList

*/
public class Menu {
    public ArrayList<String> optionList = new ArrayList<>();
    public String title;
    //constructor

    public Menu(String title) {
        this.title = title;
    }
    //addNewOption: thêm mới 1 option cho menu
    public void addNewOption(String newOption){
        optionList.add(newOption);
    }
    //print: in ra danh sách menu(các option)
    public void print(){
        int count = 1;
        System.out.println("__________"+title+"__________");
        for (String item : optionList) {
            System.out.println(count+"."+item);
            count++;
        }
    }
    //method getChoice: lấy lựa chọn người dùng có bound
    public int getChoice(){
        int choice = Inputter.getAnInteger("Input your choice: ", 
                                            "Your choice must between 1 and" + optionList.size(),
                                            1, optionList.size());
        return choice;
    }
}
