import java.util.Arrays;
import  java.util.ArrayList;
import  java.util.List;
public class Main
{

   /* public static int searchInsert2(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int searchInsert(int[] nums, int target) {
        int headArray;
        int endArray;
        int midArray;
        endArray = nums.length - 1;
        headArray = 0;
        while (headArray <= endArray) {
            midArray = headArray + (endArray - headArray) / 2;
            if (nums[midArray] == target) {
                return midArray;
            } else if (nums[midArray] < target) {
                headArray = midArray + 1;
            } else //nums[midArray] > target
            {
                endArray = midArray - 1;
            }
        }
        if (headArray > endArray) {
            return headArray;
        } else {
            return endArray;
        }

    }*/

   /* public static int[] sortCounting(int nums[])
    {

        int max;
        max = nums[0];
        int[] numsRetArray;
        numsRetArray = new int[nums.length];

        for(int i = 0; i < nums.length ; i++)
        {
          if(nums[i] >= max)
          {
              max = nums[i];
          }
        }
        List<Integer> countArray = new ArrayList<>();

        for(int i = 0; i <= max; i++)
        {
            countArray.add(i,0);
        }

        for(int i = 0; i <nums.length; i++)
        {
            countArray.set(nums[i],countArray.get(nums[i]) + 1);
        }
        for(int i=1; i <= max; i++)
        {
            countArray.set(i,countArray.get(i) + countArray.get(i-1));
        }
       for(int i = nums.length -1 ; i >= 0 ; i--)
        {
            //countArray.get(nums[i]) - count which <= nums[i]
            numsRetArray[(countArray.get(nums[i]) - 1)] = nums[i];
            countArray.set(nums[i], countArray.get(nums[i]) - 1);
        }

        return numsRetArray;
    }
*/
    public static void main(String[] args)
    {
        int buf;
        int[] nums = new int[]{5,7,22,35,52};
        int k = 3;
        int[] kArray = new int[k % nums.length];

        for(int i = 0; i < nums.length + kArray.length ; i++)
        {
            if(i < kArray.length)
            {
                kArray[i % kArray.length] = nums[i];
            }
            else
            {
                buf = nums[i % nums.length];
                nums[i % nums.length] = kArray[i % kArray.length];
                kArray[i % kArray.length] = buf;

            }



        }
        System.out.println(nums.length % k);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(kArray));




    }
}