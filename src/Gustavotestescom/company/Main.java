package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	int a, b, year;
	a = 8000;
	b= 200000;
	year = 0;


   while (a <= b){

   	a+= b * 0.03;
   	b+= b * 0.015;
   	year+= 1;

   }
		System.out.println("a ultrapassa b em " + year + " anos");

}


    }

