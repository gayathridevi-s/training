import java.util.Arrays;

public class StringPractice {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("navin");
		sb.reverse();
		sb.replace(0, 2, "tu");
		System.out.println(sb.toString());
		System.out.println("capacity of string buffer " + sb.capacity());
		String str = sb.toString(); // convert stringbuffer to string
		System.out.println(str);

		sb.append(" abraham");
		System.out.println(sb);
		System.out.println(sb.substring(1, 5));

		String sister1 = "geethanjali";
		String sister2 = "geethanjali ";
		String sister3 = new String("geethanjali");
		System.out.println(sister1 == sister2); // refers to same reference
		System.out.println(sister1 == sister3);// one is in pool and other is in non pool
		String s4 = sister3.intern();
		System.out.println(sister1 == s4);// after using intern method,reference became same
		System.out.println(sister1.compareTo(str));
		System.out.println("is sister1 equal to sister2 " + sister1.equalsIgnoreCase(sister2));
		String y = sister1.concat(" sachin"); // assign seperate memory space
		System.out.println("name without concatination " + sister1);
		System.out.println("name after concatination " + y); // concatinated object

		Details student = new Details(); // new object
		student.setName("gayathri");
		student.setAge(22);
		System.out.println(student); // getting values and printing using tostring
		String[] array = { "hello", "i", "am", "gayathri" };
		StringBuilder builder = new StringBuilder(); // stringbuilder
		builder.append(array[0]);
		builder.append(" " + array[1]);
		System.out.println(builder);
		System.out.println("string representation in the form of list of array elements :" + Arrays.toString(array)); // toString
																														// method
																														// in
																														// array
																														// package
		int[] numberArray = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(numberArray));
		String sample = "java is a programming language";
		String sample1 = sample.replace("java", "python");
		System.out.println(sample1);
		int number1 = 10;
		String numString = "10";
		System.out.println(numString + String.valueOf(10));
		StringBuffer sample2 = new StringBuffer("java is good");
		System.out.println(sample2);
		System.out.println(sample2.insert(8, "very very "));
		System.out.println(sample2.indexOf("good"));
		System.out.println(sample2.lastIndexOf("good"));
		System.out.println(sample2.replace(18, 22, "bad"));
		System.out.println(sample2.delete(8, 12));
		System.out.println(sample.substring(0, 4));
		personalDetails person=new personalDetails("PUX132");
		System.out.println(person.getDetails());   //to access final keyword use getmethod

	}
}
 final class personalDetails{
	public final String PANCARDNUMBER;
	public  personalDetails(String number){     //immutable class
		PANCARDNUMBER=number;
	}
	public String getDetails() {
		return PANCARDNUMBER;
	}
}

class Details {
	String name;
	int age;

//		Details(String name,int age){
//			this.name=name;
//			this.age=age;
//		}
	void setName(String name) {
		this.name = name;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "tostring results: Details [Name=" + getName() + ", Age=" + getAge() + "]";
	}

}
