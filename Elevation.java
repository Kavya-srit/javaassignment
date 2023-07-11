class Elevation {
    public int trapWater(int[] heights) {
        int totalWater = 0;
        int leftMax = 0;
        int rightMax = 0;
        int left, right;
        left = 0;
        right = heights.length - 1;
        while (left <= right) {
            if (heights[left] <= heights[right]) {
                if (heights[left] > leftMax)
                    leftMax = heights[left];
                else
                    totalWater += leftMax - heights[left];
                left++;
            } else {
                if (heights[right] > rightMax)
                    rightMax = heights[right];
                else
                    totalWater += rightMax - heights[right];
                right--;
            }

        }
        return totalWater;
    }

    public static void main(String[] args) {
        int[] height = { 1, 4, 3, 5, 1, 4 };
        Elevation obj = new Elevation();
        int result = obj.trapWater(height);
        System.out.println(result);

    }

}
