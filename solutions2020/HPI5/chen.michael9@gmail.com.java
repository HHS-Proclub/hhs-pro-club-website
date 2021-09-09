import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HPI5 {
	public static void main (String[] args) 
	{
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		ArrayList<Person> people = new ArrayList<Person>();
		for (int i = 0; i < n; i++) {
			people.add(new Person(kboard.nextLine()));
		}
		for (int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(kboard.nextLine());
			String name = token.nextToken();
			int start = Integer.parseInt(token.nextToken()), num = Integer.parseInt(token.nextToken());
			if (num != 0) {
				addMoney(people, name, -start);
				int each = start / num;
				int end = start - each * num;
				addMoney(people, name, end);
				for (int j = 0; j < num; j++) {
					String next = kboard.nextLine();
					addMoney(people, next, each);
				}
			}
		}
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i).name + " " + people.get(i).amount);
		}
	}
 
	public static void addMoney(ArrayList<Person> people, String name, int amount) {
		for (int i = 0; i < people.size(); i++) {
			if (people.get(i).name.equals(name)) {
				people.get(i).amount += amount;
			}
		}
	}
 
	static class Person {
		String name;
		int amount;
		public Person(String name) {
			this.name = name;
			amount = 0;
		}
	}
}
