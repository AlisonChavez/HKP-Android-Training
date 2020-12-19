class Main {
 
public static int[] searchRange(int nums[], int target)
   {
      //first try below but then I realized it was O(n) efficiency not O(log n)
      int[] array = {-1,-1};
          
      //storing the max and min indexes of the array
      int min = 0;
      int max = nums.length - 1;
      int first = -1;
      //searching for first pos of target, iterate until search contains at least one index
      while (min <= max)
      {
         //determine the middle index of the array
         int mid = (min + max) / 2;
         
         //if the target equals middle index update first and search towards right
         if(target == nums[mid]) {
            first = mid;
            max = mid - 1;
         }
         //if target is less than middle value, search left    
         if(target < nums[mid])
            max = mid - 1;
         //if target is greater than middle value, search right
         if(target > nums[mid])
            min = mid + 1;  
      }
      //update array so that the first value of it is equal to first index 
      array[0] = first;
     
      //search for ending position
      //restoring max and min pos of array and storing default last index val to -1
      int last = -1;
      min = 0;
      max = nums.length - 1;
      //searching for last pos of target, iterate until search contains at least one index
      while (min <= max)
      {
         //determine the middle index of the array
         int mid = (min + max) / 2;
         
         //if the target equals middle index update last and search towards left
         if(target == nums[mid]) {
            last = mid;
            min = mid + 1;
         }
         //if target is less than middle value, search left    
         if(target < nums[mid])
            max = mid - 1;
         //if target is greater than middle value, search right
         if(target > nums[mid])
            min = mid + 1;  
      }
      //update array so that the second value of it is equal to last 
      array[1] = last;
      
      return array;
      
   }
   //used to print returned arrays from searchRange
   public static String output(int[] array) {
     //array only has two values
     String str = "[" + array[0] + "," + array[1] + "]";
     return "Output: " + str;
   }
   public static void main(String[] args)
   {
      //declaring arrays to run tests with
      int[] nums = {5,7,7,8,8,10};
      int[] nums2 = {5,7,7,8,8,10};
      int[] nums3 = {};
      
      //storing returned arrays fromo SearchRange
      int[] res1 = searchRange(nums, 8);
      int[] res2 = searchRange(nums2, 6);
      int[] res3 = searchRange(nums3, 0);
      
      //print out output
      System.out.println(output(res1));
      System.out.println(output(res2));
      System.out.println(output(res3));
   }   
}   