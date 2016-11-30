package com.company;

public class Main {

    public static void main(String[] args) {



        //this is the old way of doing this
	    String MyX = "";
        String X = "X";
        for (int k = 0; k<8; k++){
            MyX = MyX + X;
            System.out.println(MyX);
        }
        System.out.println("");



        //time for the new stuff
        //---------------------------------------------
        //this is the String Buffer in use

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 8; i++){
            sb.append("X");
        }
    }
}
