import java.util.ArrayList;
import java.util.Scanner;

public class PRI4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int probs = Integer.parseInt(in.nextLine());
		while (probs > 0) {
			probs--;
			String[] nums = in.nextLine().split(" ");
			String[] goldstr = in.nextLine().split(" ");
			int[] gold = new int[goldstr.length];
			int S = goldstr.length;
			int P = Integer.parseInt(nums[1]);
			ArrayList<ArrayList<Integer>> friends = new ArrayList<ArrayList<Integer>>();
			for(int i=0;i<S;i++) {
				friends.add(new ArrayList<Integer>());
				gold[i]=Integer.parseInt(goldstr[i]);
			}
			for(int i=0;i<P;i++) {
				String[] pair = in.nextLine().split(" ");
				int friend1 = Integer.parseInt(pair[0]);
				int friend2 = Integer.parseInt(pair[1]);
				friends.get(friend1-1).add(friend2);
				friends.get(friend2-1).add(friend1);
			}//figure out which people have no friends, and also figure out how many networks there are, and for each network bribe the least expensive member of the network
			ArrayList<ArrayList<String>> networks = new ArrayList<ArrayList<String>>();
			for(int i=0;i<S;i++) {//for each person
				ArrayList<Integer> currentFriends = friends.get(i);
				int networkNum =-1;
				for(int j=0;j<networks.size();j++) {//for each network
					if(networks.get(j).contains(""+(i+1))) {
						networkNum=j;
						break;
					}
				}
				ArrayList<String> network;
				if(networkNum>-1)
					network=networks.get(networkNum);
				else {
					network = new ArrayList<String>();
					network.add(""+(i+1));
				}
				for(int friend: currentFriends) {
					if(!network.contains(""+friend))
						network.add(""+friend);
				}
				if(networkNum>-1)
					networks.set(networkNum, network);
				else
					networks.add(network);
			}
			int totalcost=0;
			for(int i=0;i<networks.size();i++) {//for each network
				int minprice=-1;
				for(int j=0;j<networks.get(i).size();j++) {//for each person in the network
					String person = networks.get(i).get(j);
					int price = gold[Integer.parseInt(person)-1];
					if(minprice==-1||price<minprice)
						minprice=price;
				}
				totalcost+=minprice;
			}
			System.out.println(totalcost);
		}
	}
}
