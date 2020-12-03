package adventCalendar;

import java.util.List;

public class Calendar2 {

	public int numberOfValidPassword1(List<String> input) {
		int result = 0;
		for(String line : input) {
			String[] inputArray = line.split(" ");
			String[] numberOfChars = inputArray[0].split("-");
			int min = Integer.valueOf(numberOfChars[0]);
			int max= Integer.valueOf(numberOfChars[1]);
			char condition = inputArray[1].charAt(0);
			long countOfChar = inputArray[2].chars().filter(ch -> ch == condition).count();
			if(min <= countOfChar && countOfChar <= max) {
				result++;
			}
		}
		return result;
	}
	
	public int numberOfValidPassword2(List<String> input) {
		int result = 0;
		for(String line : input) {
			String[] inputArray = line.split(" ");
			String[] numberOfChars = inputArray[0].split("-");
			int min = Integer.valueOf(numberOfChars[0]);
			int max= Integer.valueOf(numberOfChars[1]);
			char condition = inputArray[1].charAt(0);
			if(inputArray[2].charAt(min-1) == condition && inputArray[2].charAt(max-1) == condition) {
			} else if(inputArray[2].charAt(min-1) == condition || inputArray[2].charAt(max-1) == condition){
				result++;
			}
		}
		return result;
	}
}
