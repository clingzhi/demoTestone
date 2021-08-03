import com.sun.scenario.effect.Merge;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import sun.applet.Main;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testok {
	final static Logger LOGGER = LoggerFactory.getLogger(testok.class);

	public static void main(String[] args) {
//		ListNode list1 = new ListNode(1);
//		ListNode list2 = new ListNode(2);
//		Merge(list1, list2);
//		System.out.println("ssss");
//		LOGGER.info("123+++");


		String[] ss = {"aaa","eee","fff","ss","hhhh","pppppp"};
		for (int k = 0 ; k < ss.length  ; k++){
			for (int i = 0 ; i < ss.length - 1 ; i++ ){
			if(ss[i].compareTo(ss[i+1])>0){
				String temp= "";
				temp = ss[i];
				ss[i] = ss[i+1];
				ss[i+1] = temp;
			}
			}
		}
System.out.println( Arrays.asList(ss));
System.out.println( Arrays.toString(ss));

	}

	public static ListNode Merge(ListNode list1, ListNode list2) {
		if (list1 == null) {
			return list2;
		}
		if (list2 == null) {
			return list1;
		}
		if (list1.val <= list2.val) {
			list1.next = Merge(list1.next, list2);
			return list1;
		} else {
			list2.next = Merge(list1, list2.next);
			return list2;
		}
	}

	public static class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}
}