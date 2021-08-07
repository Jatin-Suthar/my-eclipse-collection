package comparablesAndComparable;

import java.util.*;
public class MainClass {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		
		students.add(new Student(591 , "jatin"));
		students.add(new Student(591 , "kshitij"));
		students.add(new Student(593 , "khushi"));
		students.add(new Student(592 , "chandrashekhar"));
		students.add(new Student(599 , "indrajeet"));
		students.add(new Student(596 , "pulastya"));
		students.add(new Student(598 , "piyush"));
		students.add(new Student(597 , "indrajeet"));
		
//		Collections.sort(students, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//			
//				if(o1.name.equals(o2.name)) {
//					return o1.marks - o2.marks;
//				}else {					
//					return o1.name.compareTo(o2.name);					
//				}
//			}
//			
//		});
		
//		Collections.sort(students, (o1, o2) -> {
//			
//				if(o1.name.equals(o2.name)) {
//					return o1.marks - o2.marks;
//				}else {					
//					return o1.name.compareTo(o2.name);					
//				}
//			});
		
//		Collections.sort(students, (o1, o2) -> o1.name.compareTo(o2.name));
		
		Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
		
		students.forEach(System.out::println);
	}

}

//class SortByNameThenMarks implements Comparator<Student>{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//
//		if(o1.name.equals(o2.name)){
//			return o1.marks - o2.marks;
//		}else {
//			return o1.name.compareTo(o2.name);
//		}
//	}	
//}
