/*
 * FirstName
 * firstName
 * class-PascalLawConvention
 * method/variable - camelCaseConvention
 */

import java.util.Scanner;

class Calculator {

    int sum(int a, int b){
      return a+b;
    }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int a= input.nextInt();
       int b= input.nextInt();
       Calculator casio = new Calculator();
       int d = casio.sum(a,b);
       System.err.println(d);
    }
}
