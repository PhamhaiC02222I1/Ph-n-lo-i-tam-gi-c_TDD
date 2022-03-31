package com.company;

public class TriangleClassifier {
    public static String testFindAbsolute(int[] side){
    if (side.length !=3) return null;
    int side1=side[0];
    int side2=side[1];
    int side3=side[2];
//    String kqua="";
        if (side1+side2>side3&&side1+side3>side2&&side2+side3>side1){
            if (side1==side2&&side2==side3){
                return "tam giac deu";
            }else if (side1==side2||side1==side3||side2==side3){
               return "tam giac can";
            }else return  "tam giac thuong";
        }else return  "khong phai tam giac";

    }


}
