import java.util.ArrayList;

import java.util.Arrays;

import java.util.Collections;

import java.util.List;

import java.util.Scanner;


public class PRA3 {


public static void main0(String[] args) {

PRA3 p = new PRA3();


for (int i = 1; i < 16; i++) {

int[] arr = p.decimalToBinary(i, 4);

System.out.println(Arrays.toString(arr));

}

}



public static void main(String[] args) {

PRA3 p = new PRA3();

Scanner in = new Scanner(System.in);

String qStr = in.nextLine();

/*

 * Number of test-cases

 */

int q = Integer.parseInt(qStr);


List<Integer> resultList = new ArrayList<>();


for (int taskIndex = 0; taskIndex < q; taskIndex++) {

String task = in.nextLine();


String[] arr1 = task.split(" ");


/*

 * x = number of vacation days

 */

int x = Integer.parseInt(arr1[0]);


/*

 * n = number of assignments

 */

int n = Integer.parseInt(arr1[1]);


/*

 * d = difficulty

 */

int d = Integer.parseInt(arr1[2]);


List<Integer> importance = new ArrayList<>();

List<Integer> days = new ArrayList<>();


for (int k = 0; k < n; k++) {

String assignment = in.nextLine();


String[] arr2 = assignment.split(" ");


int imp = Integer.parseInt(arr2[0]);

importance.add(imp);


int day = Integer.parseInt(arr2[1]);

days.add(day);

}


int maxVacationDays = p.computeMaxVacationDays(n, importance, days, x, d);

resultList.add(maxVacationDays);


}


for (int val : resultList) {

System.out.println(val);

}


in.close();

}


public int[] decimalToBinary(int number, int pow) {

List<Integer> binaryList = new ArrayList<>();


while (number > 0) {

int remainder = number % 2;

number /= 2;

binaryList.add(remainder);

}


int size = binaryList.size();

for (int i = 0; i < pow-size; i++) {

binaryList.add(0);

}


Collections.reverse(binaryList);

int[] array = new int[binaryList.size()];


for (int i = 0; i < array.length; i++) {

array[i] = binaryList.get(i);

}

return array;

}


public int computeMaxVacationDays(int n, List<Integer> importance, List<Integer> days, int x, int d) {

int sum1 = 0;


for (int i = 0; i < importance.size(); i++) {

sum1 += importance.get(i);

}


if (sum1 < d) {

return -1;

}



int minDays = Integer.MAX_VALUE;


int[] pickedArr = null;



int pow = (int) Math.pow(2, n) - 1;


for (int j = 1; j <= pow; j++) {


int[] array = decimalToBinary(j, n);

int importanceSum = 0;

int daysSum = 0;


for (int k = 0; k < array.length; k++) {

if (array[k] == 1) {

importanceSum += importance.get(k);

daysSum += days.get(k);

}

}


if (importanceSum >= d) {

if (daysSum < minDays) {

minDays = daysSum;

pickedArr = array;

}

}

}


if (minDays >= x) {

return 0;

} else {

//System.out.println(Arrays.toString(pickedArr));

return (x - minDays);

}

}

}

