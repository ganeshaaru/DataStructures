package com.r.array;

public class ContainerWithMostWater {

    public int maxAreaOfWater(int[] containerArry) {
        int maxArea = 0;
        int left = 0;
        int right = containerArry.length - 1;

        while (left < right) {
            int width = right - left;
            int height = Math.min(containerArry[left], containerArry[right]);
            int newArea = width * height;
            maxArea = Math.max(maxArea, newArea);

            if (containerArry[left] < containerArry[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int a[] = {1, 5, 4, 3};
        int b[] = {3, 1, 2, 4, 5};

        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

        System.out.println(containerWithMostWater.maxAreaOfWater(a));
        System.out.println(containerWithMostWater.maxAreaOfWater(b));
    }
}
