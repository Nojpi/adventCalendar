package adventCalendar;

import java.util.List;

public class Calendar3 {

	public long task1(List<String> input, int right, int down) {
		int position =0;
		int count = 0;
		for(int i =0; i<input.size(); i=i+down) {
			char a = input.get(i).charAt(position);
			if(a == '#') {
				count++;
			}
			position = (position + right) % input.get(i).length(); 
		}
		return count;
	}
	
	public long task2(List<String> input) {
		long t1 = task1(input, 1, 1);
		long t2 = task1(input, 3, 1);
		long t3 = task1(input, 5, 1);
		long t4 = task1(input, 7, 1);
		long t5 = task1(input, 1, 2);

		return t1*t2*t3*t4*t5;
	}
}
