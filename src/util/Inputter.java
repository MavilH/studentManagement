
package util;

import java.util.Scanner;

/*
Inputter: là 1 cái khuon
Nhưng không dùng để đúc objeact
mà dùng để chứa các hàmm hỗ trợ nhập
nhưng mà trong java thì k có function => mình phai dùng static method
*/
public class Inputter {
    //props
    public static Scanner sc = new Scanner(System.in);
    
    //method nhập số nguyên
    public static int getAnInteger(String inpMsg, String errMsg){
        System.out.println(inpMsg);//hiển thị dòng vừa nhập
        while(true){
            try{
                
                int number = Integer.parseInt(sc.nextLine());
                return number;// ném số vừa nhập ra ngoài sử dụng
            }catch(Exception e){
                System.out.println(errMsg);//hiển thị nếu nhập sai
            }
        }
    }
    
    //method nhập số nguyên trong khoảng
    public static int getAnInteger(String inpMsg, String errMsg,
                                   int lowerBound, int upperBound){
        if(lowerBound > upperBound){
            int tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        System.out.println(inpMsg);//hiển thị dòng vừa nhập
        while(true){
            try{
                
                int number = Integer.parseInt(sc.nextLine());
                if(number < lowerBound || number > upperBound){
                    throw new Exception();
                }
                return number;// ném số vừa nhập ra ngoài sử dụng
            }catch(Exception e){
                System.out.println(errMsg);//hiển thị nếu nhập sai
            }
        }
    }
    //method nhập số thực
    public static double getADouble(String inpMsg, String errMsg){
        System.out.println(inpMsg);//hiển thị dòng vừa nhập
        while(true){
            try{
                
                double number = Double.parseDouble(sc.nextLine());
                return number;// ném số vừa nhập ra ngoài sử dụng
            }catch(Exception e){
                System.out.println(errMsg);//hiển thị nếu nhập sai
            }
        }
    }
    
    //method nhập số thực trong khoảng
    public static double getADouble(String inpMsg, String errMsg,
                                   double lowerBound, double upperBound){
        if(lowerBound > upperBound){
            double tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        System.out.println(inpMsg);//hiển thị dòng vừa nhập
        while(true){
            try{
                double number = Double.parseDouble(sc.nextLine());
                if(number < lowerBound || number > upperBound){
                    throw new Exception();
                }
                return number;// ném số vừa nhập ra ngoài sử dụng
            }catch(Exception e){
                System.out.println(errMsg);//hiển thị nếu nhập sai
            }
        }
    }
    //hàm nhập chuổi cấm rỗng
    public static String getString(String inpMsg, String errMsg){
        System.out.println(inpMsg);//mời nhập
        while(true){
            try{
                String str = sc.nextLine();
                if(str.isEmpty()){
                    throw new Exception();
                }
                return str;
            }catch(Exception e){
                System.out.println(errMsg);
            }
        }
    }
    
    //hàm nhập chuỗi theo regex và cấm rỗng
    public static String getString(String inpMsg, String errMsg, String regex){
        System.out.println(inpMsg);//mời nhập
        while(true){
            try{
                String str = sc.nextLine();
                if(str.isEmpty() || !str.matches(regex)){
                    throw new Exception();
                }
                return str;
            }catch(Exception e){
                System.out.println(errMsg);
            }
        }
    }
    
    //hàm nhập ngày tháng năm có chuẩn format(chuỗi, format)
    
}
