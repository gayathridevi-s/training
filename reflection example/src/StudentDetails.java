import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.Annotation;
import java.util.Arrays;

class Student {

	private String name;
	private int age;
	public String deptName;
	public int empId;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

}

public class StudentDetails {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

		Student childnew = new Student("gaya", 21);
		Class child = childnew.getClass(); // 3 ways of creating class object
		// Class child=Student.class;
		// Class child=Class.forName("Student");
		Constructor[] constructor = child.getConstructors();
		System.out.println("constructors are :" + Arrays.toString(constructor));
		Constructor newConstructors = child.getConstructor(String.class, int.class);
		System.out.println("here is the constructor :" + newConstructors);
		int parameterCount = newConstructors.getParameterCount();
		System.out.println("paramter count of constructor are  :" + parameterCount);
		String className = child.getName(); // object
		System.out.println("classname is" + className); // classname
		System.out.println("get super class " + child.getSuperclass()); // superclass
		System.out.println("package is " + child.getPackage()); // package
		Field[] fields = child.getFields(); // to get public fields
		for (Field eachField : fields) {
			System.out.println("private fields " + eachField.getName());
		}
		Field[] allFields = child.getDeclaredFields();
		for (Field eachField : allFields) {
			System.out.println("public fields :" + eachField.getName());
		}
		Method[] allMethods = child.getMethods(); // represent all public methods including those inherited from
													// superclass
		for (Method eachMethod : allMethods) {
			System.out.println(" all methods are :" + eachMethod.getName());
		}
		System.out.println("all methods " + Arrays.toString(allMethods)); // string representation
		Method[] methods = child.getDeclaredMethods();
		for (Method eachMethod : methods) {
			System.out.println("methods are " + eachMethod.getName());
		}
		Class candidate1 = Class.forName("Candidate");
		System.out.println(candidate1.getName());
		System.out.println("super class " + candidate1.getSuperclass());
		System.out.println(candidate1.getPackage());
		System.out.println("interfaces is :" + Arrays.toString(candidate1.getInterfaces()));
		int modifier = candidate1.getModifiers();
		System.out.println("modifiers are :" + Modifier.toString(modifier));
		Field[] fieldsNew = candidate1.getDeclaredFields();
		System.out.println("the fields of childclass are:" + Arrays.toString(fieldsNew));
		Constructor[] constructors = candidate1.getConstructors();
		System.out.println(Arrays.toString(constructors));
		Constructor[] allConstructors = candidate1.getDeclaredConstructors();
		System.out.println(Arrays.toString(allConstructors));
		Method[] everyMethods = candidate1.getMethods();
		System.out.println(Arrays.toString(everyMethods)); // all public,inherited methods
		Method[] declared = candidate1.getDeclaredMethods();
		System.out.println("declared methods " + Arrays.toString(declared));
		Method method1 = candidate1.getMethod("examName");
		int parameter = method1.getParameterCount();
		System.out.println("parameter count of method1: s" + parameter);
		java.lang.annotation.Annotation[] annotation = candidate1.getAnnotations();
		System.out.println(Arrays.toString(annotation));
		Class medicalStudent = Class.forName("Entrance");
		Method newMethod = medicalStudent.getDeclaredMethod("greet", String.class);
		newMethod.setAccessible(true); // invoke method even if its private
		Object object = newMethod.invoke(new Entrance(), "ans");
		Field newField = medicalStudent.getDeclaredField("value");
		newField.setAccessible(true);
		Object newObj = newField.get(new Entrance());
		String res = (String) newObj;
		System.out.println(res);
		// String result=(String)object;
		// System.out.println(result);
	}
}
