package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		
		// subList() : arrayList에서 일부를 뽑아서 새로운 배열을 생성
		ArrayList list2 = new ArrayList(list1.subList(1, 4));

		print(list1, list2);
		
//		Collection : 인터페이스
//		Collections : 유틸 클래스
		//오름차순 정렬
		Collections.sort(list1);
		Collections.sort(list2);
		
		print(list1, list2);
		
		//내림차순 정렬
		Collections.reverse(list1);
		Collections.reverse(list2);
		
		print(list1, list2);

		// ContainsAll() : 모든 요소가 모두 포함되어 있는지 확인
		System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2));
		
		// add : 내용을 추가, 위치(인덱스)도 지정가능
		list2.add("B");
		list2.add("C");
		
		list2.add(3, "A");
		
		print(list1, list2);
	
		// set : 해당 위치(인덱스)에 있는 내용을 변경
		list2.set(3, "AA");
		
		print(list1, list2);
		
		// indexOf() : 지정된 객체의 위치(인덱스)를 알려줌
		list1.add(0, "1");
		System.out.println("index : " + list1.indexOf("1"));
		System.out.println("index : " + list1.indexOf(1));
		
		print(list1, list2);
		
		//remove() : 해당 위치(인덱스)의 값이 삭제
		list1.remove(1);
		list1.remove(new Integer(1));
		print(list1, list2);
		
		// retainAll() : 겹치는 부분만 남기고 나머지는 삭제
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		
		print(list1, list2);
		
		//list2에서 list1의 겹치는 부분만 삭제
		for(int i = list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
			
		}
		print(list1, list2);	
		
		// 삭제
		for(int i = list2.size()-1; i >= 0; i--) {
			list2.remove(i);
		}
		print(list1, list2);		
		
		}	
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
	
}
