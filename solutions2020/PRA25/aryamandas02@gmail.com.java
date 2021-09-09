import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class PRA25 {

    static enum Color {
        RED,
        GREEN
    }

    private static class BTreeNode {
        public BTreeNode(int index) {
            this.index = index;
        }
        int index;
        Color nodeColor;
        int cost = 0;
        int numGreens = 0;
        int numReds = 0;

        List<BTreeNode> children = new ArrayList<>();
    }

    public static void main(String[] args) {
        PRA25 p = new PRA25();
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        List<Integer> costs = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(n); i++) {
            String line = in.nextLine();
            String[] lineArray = line.split(" ");
            int[] parentArray = new int[lineArray.length];
            for (int j = 0; j < parentArray.length; j++) {
                parentArray[j] = Integer.parseInt(lineArray[j]);
            }
            costs.add(p.generateBTrees(parentArray));
        }
        for (int cost : costs) {
            System.out.println(cost);
        }
        in.close();
    }

    private BTreeNode constructBTree(int[] parentArray) {
        Map<Integer, BTreeNode> parentMap = new HashMap<>();

        for (int index = 0; index < parentArray.length; index++) {
            int child = index+1;
            int parent = parentArray[index];

            BTreeNode childNode = new BTreeNode(child);
            parentMap.put(child,  childNode);

            if (parentMap.containsKey(parent)) {
                BTreeNode parentNode = parentMap.get(parent);
                parentNode.children.add(childNode);
            } else {
                BTreeNode parentNode = new BTreeNode(parent);
                parentMap.put(parent, parentNode);
                parentNode.children.add(childNode);
            }
        }

        return parentMap.get(0);
    }

    private void colorBTree(BTreeNode node, char[] colorArray) {
        /*
         * Post-Order traversal Visit all the children-node and color them Add
         * all the children node's numGreens Add all the children node's numReds
         * Pick the smaller value Set the current's node's color Set the current
         * node's numGreens and numReds
         * 
         * If the node has no children, let's paint it to GREEN Set numGreens =
         * 1, Set numReds to 0
         */

        int numGreenColorTotal = 0;
        int numRedColorTotal = 0;

        for (BTreeNode n : node.children) {
            colorBTree(n, colorArray);

            numGreenColorTotal += n.numGreens;
            numRedColorTotal += n.numReds;
        }

        char mycolor = colorArray[node.index];
        if (mycolor == '0') {
            node.nodeColor = Color.RED;
            node.numReds = numRedColorTotal + 1;
            node.numGreens = numGreenColorTotal;
        } else {
            node.nodeColor = Color.GREEN;
            node.numGreens = numGreenColorTotal + 1;
            node.numReds = numRedColorTotal;
        }
    }

    private int findCost(BTreeNode node) {
        int cost = 0;
        if (node.nodeColor == Color.GREEN) {
            cost += node.numGreens;
        } else {
            cost += node.numReds;
        }

        for (BTreeNode n : node.children) {
            cost += findCost(n);
        }
        return cost;
    }

    public String decimalToBinary(int number, int size) {
        StringBuilder sb = new StringBuilder();

        while (number > 0) {
            int remainder = number % 2;
            number /= 2;
            sb.append(remainder);
        }

        int zerosToFill = size - sb.length();
        for (int i = 0; i < zerosToFill; i++) {
            sb.append(0);
        }
        sb.reverse();
        return sb.toString();
    }

    public int generateBTrees(int[] parentArray) {
        int smallestCost = Integer.MAX_VALUE;

        Set<Integer> parents = new HashSet<>();
        for (int par : parentArray) {
            parents.add(par);
        }

        Integer[] uniqParentIndexArr = parents.toArray(new Integer[parents.size()]);

        int numNodes = uniqParentIndexArr.length;
        for (int i = 1; i < Math.pow(2, numNodes); i++) {
            char[] colorArray = new char[parentArray.length+1];
            Arrays.fill(colorArray, 'u');

            String s = decimalToBinary(i, numNodes);
            char[] parentColorArray = s.toCharArray();

            for (int index = 0; index < uniqParentIndexArr.length; index++) {

                char color = parentColorArray[index];

                int parentIndex = uniqParentIndexArr[index];

                colorArray[parentIndex] = color;
            }

            for (char c : colorArray) {
                if (c == 'u') {
                    c = '0';
                }
            }

            /*
             * 1. Construct Btree
             * 2. Color Btree, by passing colorArray
             * 3. Call findCost()
             */
            BTreeNode root = constructBTree(parentArray);
            colorBTree(root, colorArray);
            int cost = findCost(root);
            if (smallestCost > cost) {
                smallestCost = cost;
            }
        }
        return smallestCost;
    }
}
