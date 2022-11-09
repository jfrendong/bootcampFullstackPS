package challenge1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Challenge1 {

	public static String methodA() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese 'Tipo A' o 'Tipo B': ");
		String option = "";
		option += sc.nextLine();
		String num = "";
			
		
		if (option.equals("Tipo A")) {
			char [] chars = "0123456789".toCharArray();
			Random random = new Random();
			StringBuffer buffer = new StringBuffer();
			
			for (int i=0;i<8;i++){
			   buffer.append(chars[random.nextInt(chars.length)]);
			}
			
			num = "54" + buffer.toString();
						
		} else if (option.equals("Tipo B")) {
			char [] chars = "0123456789".toCharArray();
			Random random = new Random();
			StringBuffer buffer = new StringBuffer();
			
			for (int i=0;i<8;i++){
			   buffer.append(chars[random.nextInt(chars.length)]);
			}
			
			num = "08" + buffer.toString();
		} else {
			num = "El parámetro de entrada ingresado es incorrecto, por favor ingrese 'Tipo A' o 'Tipo B'";
		}
		
		return num;
	}
	
	public static Boolean methodB(String word, String [] list) {
			
		Boolean check = true;
		
		if (Arrays.asList(list).contains(word)) {
			check = false;
		} else {
			check = true;
		}
		
		return check;
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(methodA());
		
		String word = "Enero";
		String [] list = {"hola", "mundo", "enero", "2022"};
		System.out.println(methodB(word,list));
		
	}

}
