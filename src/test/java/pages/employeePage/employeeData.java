package pages.employeePage;

import java.util.Scanner;

public class employeeData {

    Scanner input = new Scanner(System.in);

    public String[] employee() {
        String[] res = {"Ahmet - Jan 1 1990", "Mehmet - Feb 1 1991", "Ali - Mar 1 1990", "Hasan - May 1 1995", "Bekir - Jan 8 1111"};
        return res;
    }


    public String[] name(String[] employeeData){
        String[] name=employeeData;
        for (int i = 0; i < name.length; i++) {
            name[i]=name[i].substring(0,name[i].indexOf("-")-1);
        }
        return name;
    }


}
