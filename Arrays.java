public class Arrays 
{
    public static void main(String[] args) {
        // Declare and initalize the array in one line
        int[] nums = new int[]{3, 4, 5, 6};

        // For Loop to square each element and print to console
        for ( int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] * nums[i]);
        }
        
    }
}