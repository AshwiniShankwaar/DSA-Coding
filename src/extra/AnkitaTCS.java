package extra;

import java.util.Scanner;

import java.util.*;

class Stack {
    int x, l;
    boolean fallen;

    public Stack(int x, int l) {
        this.x = x;
        this.l = l;
        this.fallen = false;
    }
}

class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack[] stacks = new Stack[n];

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int l = scanner.nextInt();
            stacks[i] = new Stack(x, l);
        }

        Arrays.sort(stacks, Comparator.comparingInt(stack -> stack.x));

        int count = 0;
        int left = Integer.MIN_VALUE;
        int right = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            Stack stack = stacks[i];
            if (stack.fallen) continue;

            int leftFall = stack.x - stack.l;
            int rightFall = stack.x + stack.l;

            if (leftFall > left) {
                stack.fallen = true;
                count++;
                left = stack.x;
                right = stack.x + stack.l;
            } else if (rightFall < right) {
                stack.fallen = true;
                count++;
                right = stack.x;
                left = stack.x - stack.l;
            }
        }

        System.out.println(count);
    }
}

//public class AnkitaTCS {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt(); // number of stacks
//        int[][] stacks = new int[n][2]; // 2D array to store stacks' coordinates and heights
//
//        // read input
//        for (int i = 0; i < n; i++) {
//            stacks[i][0] = scanner.nextInt(); // coordinate xi
//            stacks[i][1] = scanner.nextInt(); // height li
//        }
//
//        // find the maximum number of stacks that Tim can break
//        int maxStacksBroken = 0;
//        for (int i = 0; i < n; i++) {
//            int left = 1, right = 1; // count of stacks that can be broken on the left and right
//
//            // check how many stacks can be broken on the left
//            for (int j = i-1; j >= 0; j--) {
//                if (stacks[j][0] + stacks[j][1] < stacks[i][0] - stacks[i][1]) {
//                    left++;
//                } else {
//                    break;
//                }
//            }
//
//            // check how many stacks can be broken on the right
//            for (int j = i+1; j < n; j++) {
//                if (stacks[j][0] - stacks[j][1] > stacks[i][0] + stacks[i][1]) {
//                    right++;
//                } else {
//                    break;
//                }
//            }
//
//            maxStacksBroken = Math.max(maxStacksBroken, left + right);
//        }
//
//        System.out.println(maxStacksBroken);
//    }
//}
