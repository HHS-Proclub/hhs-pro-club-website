import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HPI6 {
	
	private static int[][] paths = new int[100][100];
	private static HashMap<String, Integer> nodes = new HashMap<String, Integer>();
	
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		int counter = 0;
		for (int i = 0; i < n; i++) { 
			StringTokenizer token = new StringTokenizer(kboard.nextLine());
			String first = token.nextToken(), second = token.nextToken();
			int d = Integer.parseInt(token.nextToken());
			if (nodes.containsKey(first) == false) {
				nodes.put(first, counter);
				counter++;
			}
			if (nodes.containsKey(second) == false) {
				nodes.put(second,  counter);
				counter++;
			}
			paths[nodes.get(first)][nodes.get(second)] = d;
		}
//		for (HashMap.Entry<String,Integer> entry : nodes.entrySet()) {
//			  String key = entry.getKey();
//			  Integer value = entry.getValue();
//			  System.out.println(key + " " + value);
//			}
		StringTokenizer token = new StringTokenizer(kboard.nextLine());
		int start = nodes.get(token.nextToken()), end = nodes.get(token.nextToken());
		System.out.println(findShortest(start, end));
	}
	
	public static int findShortest(int start, int end) {
		HashSet<Integer> visited = new HashSet<Integer>();
		visited.add(start);
		int[] minValues = new int[nodes.size()];
		Arrays.fill(minValues, 10000000);
		minValues[start] = 0;
		int currentNode = start;
		while (visited.size() != nodes.size()) {
			for (int i = 0; i < 100; i++) {
				if (paths[currentNode][i] != 0) {
					if (visited.contains(i) == false && paths[currentNode][i] + minValues[currentNode] < minValues[i]) {
						minValues[i] = paths[currentNode][i] + minValues[currentNode];
					}
				}
			}
			int minSize = 10000000, minNode = -1;
			for (int i = 0; i < minValues.length; i++) {
				if (!visited.contains(i) && minValues[i] < minSize) {
					minSize = minValues[i];
					minNode = i;
				}
			}
			visited.add(minNode);
			currentNode = minNode;
		}
		return minValues[end];
	}
}
