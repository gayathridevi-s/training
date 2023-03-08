import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Marks {
public static void main(String[] args) {
	HashMap<String,Integer> marks=new HashMap<String,Integer>();
	marks.put("Arya", 40);
	marks.put("Sruthi", 30);
	marks.put("Vicky", 46);
	marks.put("mydhili", 27);
	marks.putIfAbsent("akshara", 45);
	marks.remove("Sruthi");
	Set<Entry<String,Integer>> entry=marks.entrySet();  //to iterate each key and value
	double totalMarks=0;
	for( Map.Entry<String, Integer>mark:entry) {
		totalMarks+=mark.getValue();
	}
	 double averageMark=totalMarks/marks.size();
	 System.out.println("average marks is :"+averageMark);
	 int highScore=Integer.MIN_VALUE;
	 String highScorer="";
	 for( Map.Entry<String,Integer>mark:entry) {
		 if(mark.getValue()>highScore) {
			 highScore=mark.getValue();
			 highScorer=mark.getKey();
		 }
	 }
	 System.out.println("highscorer is "+ highScorer+" and highscore is "+highScore);
}
}
