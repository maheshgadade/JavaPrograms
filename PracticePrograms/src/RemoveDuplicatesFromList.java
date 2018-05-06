import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(10);
		list1.add(30);
		list1.add(10);
		List<Integer> list2 = new ArrayList<Integer>();
		
		Iterator<Integer> itr1 = list1.iterator();
		
		while(itr1.hasNext()) {
			Integer intr1 = itr1.next();
			
			if(list2.contains(intr1) == false) {
				list2.add(intr1);
			}
		}
		System.out.println(list2);
	}

}
