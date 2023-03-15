
public class Candidate extends Student implements Exam{

	public Candidate(String name, int age) {
		super(name, age);
		
	}

	@Override
	public void examName() {
		System.out.println("jee examination");
	}
	
}
