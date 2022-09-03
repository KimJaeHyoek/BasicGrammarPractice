import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> scoreList= new ArrayList<>();
		scoreList.add(10);
		scoreList.add(20);
		scoreList.add(30);
		scoreList.add(40);
		scoreList.add(50);
		
		scoreList.add(2,200); //(몇번째,무슨값을 넣는것)
		scoreList.remove(2);
		
		
		System.out.println(scoreList.size());
		System.out.println(scoreList.get(4));
		System.out.println(scoreList);
	}

}
