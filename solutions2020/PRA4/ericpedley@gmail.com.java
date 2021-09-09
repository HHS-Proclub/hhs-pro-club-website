import java.util.ArrayList;
import java.util.Scanner;

public class PRA4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int probs = Integer.parseInt(in.nextLine());
		while (probs > 0) {
			probs--;
			int numDrifts = Integer.parseInt(in.nextLine());
			ArrayList<ArrayList<Integer>> neighbors = new ArrayList<ArrayList<Integer>>();
			ArrayList<int[]> coords = new ArrayList<int[]>();
			for(int i=0;i<numDrifts;i++) {
				neighbors.add(new ArrayList<Integer>());
				String[] coordstr = in.nextLine().split(" ");
				coords.add(new int[] {Integer.parseInt(coordstr[0]),Integer.parseInt(coordstr[1])});
			}
			for(int i=0;i<coords.size();i++) {//for each snow drift
				int[] curr = coords.get(i);
				for(int j =0;j<coords.size();j++) {
					if(coords.get(j)[0]==curr[0]||coords.get(j)[1]==curr[1])
						neighbors.get(i).add(j);
				}
			}
			ArrayList<ArrayList<Integer>> networks = new ArrayList<ArrayList<Integer>>();
			for(int i=0;i<coords.size();i++) {//for each snow drift
				int networknum = -1;
				for(int j=0;j<networks.size();j++) {//for each network, check if this drift is in it
					if(networks.get(j).contains(i)) {
						networknum=j;
						break;
					}
				}
				ArrayList<Integer> network;
				if(networknum==-1) {
					network =  new ArrayList<Integer>();
					network.add(i);
				} else {
					network = networks.get(networknum);
				}
				for(int j=0;j<neighbors.get(i).size();j++) {//for each of this snow drift's neighbors, check if they are in the netwokr already and if not add them
					if(!network.contains(neighbors.get(i).get(j)))
						network.add(neighbors.get(i).get(j));
				}
				if(networknum==-1)
					networks.add(network);
			}//after this all the networks are built
			System.out.println(networks.size()-1);
//			ArrayList<ArrayList<int[]>> networkCoords = new ArrayList<ArrayList<int[]>>();
//			for(int i=0;i<networks.size();i++) {//for each network
//				ArrayList<int[]> netCoords = new ArrayList<int[]>();
//				for(int j=0;j<networks.get(i).size();j++) {//for each drift in the network
//					netCoords.add(coords.get(networks.get(i).get(j)));
//				}
//				networkCoords.add(netCoords);
//			}
//			for(int i=0;i<networkCoords.size();i++) {//for each network
//				ArrayList<int[]> netCoords = networkCoords.get(i);
//				ArrayList<Integer> intersections = new ArrayList<Integer>();
//				for(int j=0;j<networkCoords.size();j++) {//for each other network
//					if(j==i)
//						continue;
//					ArrayList<int[]> netCoords2 = networkCoords.get(i);
//					for(int k=0;k<netCoords.size();k++) {
//						int x = netCoords.get(k)[0];
//						int y = netCoords.get(k)[1];
//						
//					}
//				}
//			}
		}
	}
}
