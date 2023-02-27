class Capital{
	String input;
	Capital(String input){
		this.input=input;
	}
	String capitalizeString() {
		String[] words=input.split(" ");
		String capitalString="";
		for(String word:words) {
			String firstLtter=word.substring(0,1);
			String remainingWord=word.substring(1);
			
			capitalString+=firstLtter.toUpperCase()+remainingWord+" ";
		}
		return capitalString ;
		
	}
}
public class Capitalize {
	public static void main(String[] args) {
		Capital line=new Capital("i am hi");
		System.out.println(line.capitalizeString());
	}

}
