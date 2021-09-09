import java.util.*;

class PRA22 {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        int len = in.nextInt();

        for(int i = 0; i< len; i++)
        {
            int goodValue = in.nextInt();
            in.nextLine();
            StringTokenizer token = new StringTokenizer(in.nextLine());
            ArrayList<Integer> inputs = new ArrayList<Integer>();

            while (token.hasMoreTokens()) {
                int bars = Integer.parseInt(token.nextToken());
                inputs.add(bars);
            }

            int[] k = new int[inputs.size()];
            for(int j = 0; j < inputs.size(); j++){
                k[j] = inputs.get(j);
            }

            System.out.println(printSubsets(k, goodValue));

        }

    }
    private static int printSubsets(int[] set, int goodValue)
    {
        int n = set.length;
        int result = 0;
        for (int i = 0; i < (1<<n); i++)
        {
            ArrayList<Integer> ints = new ArrayList<Integer>();
            for (int j = 0; j < n; j++)

                if ((i & (1 << j)) > 0) ints.add(set[j]);


            if(checkGoodValue(ints, goodValue)){
                result++;

            }
        }
        return result;

    }
    private static boolean checkGoodValue(ArrayList<Integer> inp, int goodValue){
        if(inp.isEmpty()){
            return false;
        }
        int product = 1;
        for(int i = 0; i <inp.size(); i++){
            product *= inp.get(i);
        }
        if (product == goodValue){
            return true;
        }else{
            return false;
        }
    }
}
