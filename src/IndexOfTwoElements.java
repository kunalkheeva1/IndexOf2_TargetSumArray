public class IndexOfTwoElements {

    //a method which returns the indexes of two numbers whose sum is equal to the target,
    //given array is sorted and stored only one solution
    public static int [] indexOfTwoElements(int [] arr, int target){
        //get an array to be returned
        int resultant[] = new int[2];
        //two pointers
        int i = 0;
        int j= arr.length -1;

        //until i meets j
        while (i<j){
            //if their sum is equals to target then add the indexes in resultant
            if(arr[i] + arr[j] == target){
                resultant[0] = i+1;
                resultant[1] = j+1;
                break;
            }
            // if not, then check if ith is greater or jth, then move on.
            if(arr[i]<arr[j]){
                i++;
            }else{
                j++;
            }
        }return resultant;
    }


    public static void main(String[] args) {

    }
}
