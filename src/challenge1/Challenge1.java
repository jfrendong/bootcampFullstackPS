package challenge1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Challenge1 {

	public static String methodA(String option) {
		
		String num = "";
		char [] chars = "0123456789".toCharArray();
		Random random = new Random();
		StringBuffer buffer = new StringBuffer();
		
		for (int i=0;i<8;i++){
		   buffer.append(chars[random.nextInt(chars.length)]);
		}
			
		if (option.equals("Tipo A")) {
			num = "54" + buffer.toString();
		} else if (option.equals("Tipo B")) {
			num = "08" + buffer.toString();
		} else {
			num = "El parámetro de entrada ingresado es incorrecto, por favor ingrese 'Tipo A' o 'Tipo B'";
		}
		
		return num;
	}
	
	public static Boolean methodB(String word, List <String> list) {
			
		Boolean check = true;
				
		if (list.contains(word)) {
			check = false;
		} else {
			check = true;
		}
		
		return check;
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String option = "Tipo A";
		System.out.println(methodA(option));
		
		String word = "mundo";
		List<String> list = new ArrayList<String>();
		list.add("hola");
		list.add("mundo");
		list.add("enero");
		list.add("2022");
		System.out.println(methodB(word,list));
		
	}

}
