import javax.print.attribute.IntegerSyntax;

public class StaticRunner {
	public static void main(String[] args) {
		System.out.println(add(50,10));
		System.out.println(add(30,10));
		System.out.println(add(30,10,20));
		System.out.println(add(1,2,3,4,5,6,7));
		
		Person person = new Person("홍길동",10);
		System.out.println(person);
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	public static int add(int x, int y,int z) {
		return x + y + z;
	}	
	public static int add(int... numbers) {
	int sum = 0;
		for (int i = 1; i < numbers.length; i++) {
			sum = sum + i;
		}
			return sum;
		}
	}

class Person {
	private String name;
	private int age;
	
	Person(){
		
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
	


