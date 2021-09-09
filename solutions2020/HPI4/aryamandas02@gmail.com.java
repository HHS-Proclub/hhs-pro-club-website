import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class HPI4 {

    static class Task {
        /**
         * @param name
         * @param beginTime
         * @param endTime
         */
        public Task(String name, int beginTime, int endTime) {
            super();
            this.name = name;
            this.beginTime = beginTime;
            this.endTime = endTime;
        }
        String name;
        int beginTime;
        int endTime;
    }

    static class TaskCompartor implements Comparator<Task> {

        @Override
        public int compare(Task o1, Task o2) {
            return Integer.compare(o1.endTime,  o2.endTime);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();

        int numTasks = Integer.parseInt(n);
        Task[] taskArray = new Task[numTasks];

        for (int i = 0; i < numTasks; i++) {
            String str = in.nextLine();
            String[] arr = str.split(" ");
            Task task = new Task(arr[0], Integer.parseInt(arr[1]),
                    Integer.parseInt(arr[2]));
            taskArray[i] = task;
        }
        Arrays.sort(taskArray, new TaskCompartor());
        List<String> output = new ArrayList<>();
        Task task = taskArray[0];
        output.add(task.name);

        StringBuilder sb = new StringBuilder();
        sb.append(task.name + " ");
        int count = 0;

        for (int i = 1; i < taskArray.length; i++) {
            Task t1 = taskArray[i];
            for (int j = i-1; j >= 0; j--) {
                Task t2 = taskArray[j];
                if (output.contains(t2.name)) {
                    if (t1.beginTime > t2.endTime) {
                        sb.append(t1.name + " ");
                        count++;
                        output.add(t1.name);
                        break;
                    } else {
                        break;
                    }
                }
                if (count == 4) {
                    break;
                }
            }
        }
        String schedule = sb.toString();
        schedule = schedule.trim();
        System.out.println(schedule);
        in.close();
    }
}
