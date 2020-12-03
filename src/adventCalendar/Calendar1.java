package adventCalendar;

import java.util.ArrayList;
import java.util.List;

public class Calendar1 {

	public int task1(List<String> inputListString) {
		List<Integer> inputList = processInputList(inputListString);
		for(int i = 0; i < inputList.size(); i++) {
			for(int j = i; j < inputList.size(); j++) {
				if(inputList.get(i)+inputList.get(j) == 2020) {
					return inputList.get(i)*inputList.get(j);
				}
			}
		}
		return 0;
	}
	
	public int task2(List<String> inputListString) {
		List<Integer> inputList = processInputList(inputListString);
		for(int i = 0; i < inputList.size(); i++) {
			for(int j = i; j < inputList.size(); j++) {
				for(int z = j; z < inputList.size(); z++) {
					if(inputList.get(i)+inputList.get(j)+inputList.get(z) == 2020) {
						return inputList.get(i)*inputList.get(j)*inputList.get(z);
					}
				}
			}
		}
		return 0;
	}
	
	private List<Integer> processInputList(List<String> inputList){
		List<Integer> output = new ArrayList<>() ;
		for(String line : inputList) {
			output.add(Integer.valueOf(line));
		}
		return output;
	}
}
