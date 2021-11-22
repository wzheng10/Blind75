 class Container With Most water {
    //Approach #1 Brute Force
    public int maxArea(int[] height) {
        int maxarea = 0;
        for(int i = 0; i < height.length; i++) {            //left point
            for(int j= i + 1; j < height.length; j++) {     //right point
                int currentArea = Math.min(height[i], height[j]) * (j - i);

                maxarea = Math.maxarea(maxarea, currentArea);       //update maximum area
            }

        }
        return maxarea;
    }

    //Approach #2 Two Pointers
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length -1;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
 }