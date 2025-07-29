 import java.util.*;
 class SampleConversion{
	public static void main (String[] args){
 Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to be converted:");
		int num = sc.nextInt();
			System.out.println("Original Number: " + num);
            System.out.println("Binary     : " + Integer.toBinaryString(num));
            System.out.println("Octal      : " + Integer.toOctalString(num));
            System.out.println("Hexadecimal: " + Integer.toHexString(num).toUpperCase());
			 }
			 }