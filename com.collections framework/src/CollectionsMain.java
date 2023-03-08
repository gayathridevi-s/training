import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;
import java.util.Collection;
class Students{
	String name;
	int marks;
	Students(String name,int marks){
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", marks=" + marks + "]";
	}
	
}

public class CollectionsMain {
	public static void main(String[] args) {
		Collection<String> values = new ArrayList<>();
		values.add("gayathri");
		values.add("gayathri");
		values.add("come");
		values.remove(2); //collections cannot access index,maintain the sequence of insertion
		//values.sort() -undefined for collection
		System.out.println(values);
		for (String i : values) {
			System.out.print(i);
			System.out.print( " ");
		}
		Iterator<String> i=values.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		values.forEach(System.out::println);	//stream API,lambda expression,introduced on java 1.8
List<String> name=new ArrayList<>() ;  //list can access index
name.add("arya");
name.add("gayathri");
name.add("anjali");
name.add(1, "anjana");
Iterator j=name.iterator();  //iterator
while(j.hasNext()) {
	System.out.println(j.next());
}
name.sort(null);  //sorting arraylist


for(String n:name) {	//for each loop
	System.out.println(n);
}
List<Integer> number = new ArrayList<>();
number.add(1);
number.add(2);
number.add(-1);
number.add(34);
number.add(10);
System.out.println("sorted order");
Collections.sort(number);     //sort
number.forEach(System.out::println);
System.out.println("reversed order");
Collections.reverse(number);   //reverse method
number.forEach(System.out::println);

Vector<Integer> x=new Vector<>();
x.add(1);
x.add(3);
x.add(5);
x.remove(1);
for(int k:x) {	//for each loop
	System.out.println(k);
}
List<Students> student=new ArrayList<>();
student.add(new Students("gaya",12));
student.add(new Students("anju",60));
student.add(new Students("arya",20));
for (Students s:student) {
	System.out.println(s);
}
List<Integer> digits=new ArrayList<Integer>() {
	{
		add(34);
		add(20);   //Instantiation using double braces,anonymous inner class
		add(10);
	}
};
for(int digit:digits) {
	System.out.println(digit);
}
Stack<String>nameStudents=new Stack<>();    //stack
nameStudents.push("architha");
nameStudents.push("avani");
	nameStudents.push("kavya");
	nameStudents.pop();
	nameStudents.pop();
	Iterator studentName=nameStudents.iterator();
	while(studentName.hasNext()) {
		System.out.println(studentName.next());
	}
	Queue<String> queueNames=new PriorityQueue<>();
	queueNames.add("Anish");
	queueNames.add("Rishi");
	queueNames.add("Adrija");
	queueNames.add("Anurag");
	System.out.println("printing head of queue :");  //lexicographic order of strings
	System.out.println(queueNames.element()); //element()
	System.out.println(queueNames.peek());  //using peek() method
	System.out.println("removing two elements:");
	queueNames.remove(); //first remove adrija
	queueNames.poll();	//remove anish
	System.out.println(queueNames);
	
	ArrayDeque<String> colors=new ArrayDeque<String>();
	colors.offerFirst("black");
	colors.offerFirst("brown");
	colors.offerLast("blue");
	colors.offerLast("grey");
	System.out.println(colors);
	System.out.println(colors.peekFirst());	//returns last element
	System.out.println(colors.peekLast());
	System.out.println(colors.pollFirst());	//removes first element
	System.out.println(colors);
	}
}
