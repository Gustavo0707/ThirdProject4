package Gustavotestescom.company;

public class Main {

    public static void main(String[] args) {
	int a, b, year;
	a = 8000;
	b= 200000;
	year = 0;


   while (a <= b){

   	a+= a * 0.03;
   	b+= b * 0.015;
   	year+= 1;

   }
		System.out.println("a ultrapassa b em " + year + " anos");

}


    }

