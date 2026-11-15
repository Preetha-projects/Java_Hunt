package DSA_Hunt.Arrays.TwoPointer;

/*
PROBLEM: Container With Most Water
You are given an integer array height of length n.
There are n vertical lines drawn such that the two endpoints of the iᵗʰ line are:
(i, 0) and (i, height[i])
Find two lines that together with the x-axis form a container that holds the maximum amount of water.
Return the maximum amount of water a container can store.

Hints:
-To maximize width: Start with the widest possible container.
-We move only one pointer because:
    At every step, we eliminate only the configuration that is guaranteed not to produce a better result.
-Always move the pointer with the smaller height.

Algorithm:
    1.left = 0
    2.right = n - 1
    3.While left < right:
        Calculate area
        Update max
        Move smaller height pointer
 */

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {  // When pointers meet, no meaningful container can be formed. So we stop before they meet. No need to use left <= right.
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int currentArea = width * minHeight;

            maxArea = Math.max(maxArea, currentArea);

            // Move the smaller height pointer
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater obj = new ContainerWithMostWater();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 7, 3};
        int result = obj.maxArea(height);
        System.out.println("Maximum area of water that can be contained: " + result);
    }
}
