package adventCalendar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Calendar {

	public static void main(String[] args) {
		/*
		List<String> input = readFile("input1.txt");
		Calendar1 cal1 = new Calendar1();
		System.out.println(cal1.task1(input));
		System.out.println(cal1.task2(input));
		*/
		/*
		List<String> input = readFile("input2.txt");
		Calendar2 cal2 = new Calendar2();
		System.out.println(cal2.numberOfValidPassword1(input));
		System.out.println(cal2.numberOfValidPassword2(input));
		*/
		List<String> input = readFile("input3.txt");
		Calendar3 cal3 = new Calendar3();
		System.out.println(cal3.task1(input, 3, 1));
		System.out.println(cal3.task2(input));
	}

	private static List<String> readFile(String name){
		BufferedReader reader;
		List<String> output = new ArrayList<>();
		try {
			reader = new BufferedReader(new FileReader(name));
			String line = reader.readLine();
			while (line != null) {
				output.add(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return output;
	}
	

}
