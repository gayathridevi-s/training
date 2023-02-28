
class Outer {
	static int value = 20;

	public static class InnerClass {
		static int staticValue = 10;

		public static void staticFieldValue() {
			System.out.println(staticValue);
		}

	}

}

public class OuterClass {
	public static void main(String[] args) {
		System.out.println(Outer.value);
		System.out.println(Outer.InnerClass.staticValue);
		Outer.InnerClass.staticFieldValue();
	}
}
