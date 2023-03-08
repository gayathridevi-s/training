import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Collections;

class Book{
	String names;
	int years;
	String authors;
	Book(String name,int year,String author){
		names=name;
		years=year;
		authors=author;
	}
	@Override
	public String toString() {
		return "Book [names=" + names + ", years=" + years + ", authors=" + authors + "]";
	}
}
public class ObectArrayList {
	public static void main(String[] args) {
		ArrayList<Book> list=new ArrayList<Book>();
		Book b1=new Book("heaven",2000,"michal");
		Book b2=new Book("angel",1976,"kimchrom");
		list.add(b1);
		list.add(b2);
		for(Book b:list) {
			System.out.println(b.names+b.years+b.authors);
			System.out.println(b);
		}
		LinkedList<Integer> posNum=new LinkedList<Integer>();
		posNum.add(10);
		posNum.add(9);
		posNum.add(20);
		posNum.add(39);
		Iterator i=posNum.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(posNum); //order has not changed permanently
		Collections.reverse(posNum);
		System.out.println(posNum);//permanently change order using reverse();
		System.out.println(posNum.get(3));	//returns the value in that index
		posNum.set(1, 29);	//replaces the value in that index
		System.out.println(posNum);
		ListIterator<Integer> itr=posNum.listIterator();
		while(itr.hasNext()) {
			System.out.println("index :"+itr.nextIndex()+" value :"+itr.next());
		
		}
		while(itr.hasPrevious()) {
			System.out.println("index :"+itr.previousIndex()+" value :"+itr.previous());
		}
				
		
	}
}
