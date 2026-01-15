 package leetcode_work;

 public class Most_Water_Container {
   public static int maxArea(int[] height) {
     int l = 0; int r = height.length-1;
     int largest_area = 0;
     while(l < r) {
       int curr_area = (r-l)*Math.min(height[l], height[r]);
       largest_area = Math.max(largest_area, curr_area);
       if(height[l] < height[r]) l++;
       else r--;
     }
     return largest_area;
   }
 }
