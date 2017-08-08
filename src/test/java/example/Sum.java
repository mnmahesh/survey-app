package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sum {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(3);
		list.add(7);
		list.add(9);
		list.add(2);


		System.out.println("Sum excluding Maximum value is : " + getSum(list, Collections.max(list)));
		System.out.println("Sum excluding Minimum value is : " + getSum(list, Collections.min(list)));
	}

	public static Integer getSum(List<Integer> listItem, Integer value) {
		Integer sum = 0;
		for(Integer listValue:listItem){
			if(listValue!=value)
				sum=sum+listValue;
		}
		return sum;
	}
}
