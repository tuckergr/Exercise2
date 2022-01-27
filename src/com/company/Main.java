package com.company;

public class Main {
                                                                                                                    //Tucker Gragg 1/27/2022
    public static void main(String[] args) {
        String[] day = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};              //String Array with days that correspond to the numbers in the int arrays
        int[] temp = {45, 29, 10, 22, 41, 28, 33};
        int[] precip = {95, 60, 25, 5, 0, 75, 90};


        for (int i = 0; i < 7 ; i++) {                                  
            if (temp[i] < 32 && precip[i] > 50) {                       //If the temp lower than x and precip lower than x print the day
                System.out.println(day[i]);
        }














        }
    }
}
