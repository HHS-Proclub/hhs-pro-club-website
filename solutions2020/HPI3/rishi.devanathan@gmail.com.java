import java.util.Scanner;
import java.util.Stack;

class HPI3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = Integer.parseInt(in.nextLine());
        String[] tasksAndBooks = new String[len];
        for(int i = 0; i < len; i++){
            tasksAndBooks[i] = in.nextLine();
        }
        Stack pile = new Stack();
        for(int i = 0; i < tasksAndBooks.length; i++){
            int task = Integer.parseInt(String.valueOf(tasksAndBooks[i].charAt(0)));

            if(task == 1){
                String book = tasksAndBooks[i].substring(2);
                pile.add(0, book);
            }
            else if(task == 2){
                pile.remove(0);
            }
            else{
                System.out.println(pile.get(0));
            }



        }

    }
}
