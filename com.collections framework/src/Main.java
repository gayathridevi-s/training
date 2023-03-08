import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
public static void main(String[] args) {
	Set<String> fruits=new HashSet<>();
	System.out.println(fruits.add("apple"));
	fruits.add("orange");
	System.out.println(fruits.add("guava"));
	System.out.println(fruits.add("guava"));
	System.out.println("list of fruits: "+fruits);
	if(fruits.contains("apple")) {
		System.out.println("it contains apple");
	}
	Iterator<String> i=fruits.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	fruits.forEach(System.out::println);
	for(String x:fruits) {
		System.out.println(x);
	}
	if(fruits.isEmpty()) {
		System.out.println("set is empty");
	}
	else {
		System.out.println("set is not empty");
	}
	Set<String> moreFruits=new HashSet<>();
	moreFruits.add("grape");
	moreFruits.add("pineapple");
	fruits.addAll(moreFruits);
	System.out.println(fruits);
	fruits.clear();
	System.out.println(fruits);
	List<Integer> list=new ArrayList<>(Arrays.asList(3,4,7,6,34,9,1,4,0,2,4));
	Set<Integer> set=new LinkedHashSet<>(list);   //remove  duplicates,preserves order
	List<Integer> newList=new ArrayList<>(set);
	System.out.println(set);
	System.out.println("after removing duplicates: "+newList);
	Set<Integer> setNew=new TreeSet<Integer>(list); //ascending order,removes duplicates
	System.out.println(setNew);
	System.out.println("size of tree set"+setNew.size());
	System.out.println("lowest value"+((TreeSet<Integer>) setNew).pollFirst());
	System.out.println("highest value"+((TreeSet<Integer>) setNew).pollLast());
	System.out.println("reverse set"+((TreeSet<Integer>) setNew).descendingSet());
	System.out.println("headset"+((TreeSet<Integer>) setNew).headSet(4,true));
	System.out.println("tailset"+((TreeSet<Integer>) setNew).tailSet(4,false));
	System.out.println("subset"+((TreeSet<Integer>) setNew).subSet(3,true,7,false));
	Map<String,String> myMap=new HashMap<>();
	myMap.put("name", "gayathri");
	myMap.put("place", "ekm");
	myMap.put("clg", "mace");
	myMap.put("place" ,"idukki");  //cannot repeat keys,replace previous value
	myMap.put("area", "mace");  //can have more values with same name
	System.out.println("printing map"+myMap);
	System.out.println(myMap.get("name"));
	Set<String> keys=myMap.keySet();  //keys are set,no repetitions
								//values are list
	for( String key:keys) {
		System.out.println(key+" "+ myMap.get(key));
	}
	System.out.println("values"+myMap.values());  //print values in list
	System.out.println("keys are :"+myMap.keySet());
	Set<Map.Entry<String, String>> model=myMap.entrySet();
	for(Map.Entry<String, String>mode:model) {
		System.out.println(mode.getKey()+" :"+mode.getValue());
	}
	myMap.replace("name", "reshma");
	System.out.println("new map:"+myMap);
	System.out.println("set of mappings"+myMap.entrySet());
		HashMap<String,Integer>	sites=new HashMap<String,Integer>();
		sites.put("facebook",1);
		sites.put("mozilla", 3);
		sites.computeIfPresent("mozilla", (key,value)->value+1);
		System.out.println(sites);
			LinkedHashMap<Integer,String> details=new LinkedHashMap<>();	//maintains insertion order
			details.put(100, "Amit");
			details.put(101, "sandul");
			details.put(103, "reshmi");
			System.out.println(details);
			System.out.println(details.entrySet());
			System.out.println(details.keySet());	//fetching key
			System.out.println(details.values());	//fetching values
}
}
