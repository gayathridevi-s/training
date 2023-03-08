import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class MyLibrary{
	String name;
	String author;
	int date;
	MyLibrary(String x,String y,int z){
		name=x;
		author=y;
		date=z;
	}
}
public class Library {
public static void main(String[] args) {
	HashMap<Integer,MyLibrary> books=new HashMap<>();
	MyLibrary book1=new MyLibrary("dark","navin",1990);
	MyLibrary book2=new MyLibrary("smile","ajith",2000);
	MyLibrary book3=new MyLibrary("ghost","stephen",2013);
	books.put(1,book1);
	books.put(2,book2);
	books.put(3,book3);
	Set<Entry<Integer,MyLibrary>> entry=books.entrySet();
	for(Map.Entry<Integer, MyLibrary> newEntry:entry) {
		MyLibrary b=newEntry.getValue();
		System.out.println(newEntry.getKey());
		System.out.println(b.name+" "+b.author+" "+b.date);
	}
	
	
}
}
