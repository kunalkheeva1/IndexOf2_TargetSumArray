public class IndexOfTwoElements {

    public static int [] indexOfTwoElements(int [] arr, int target){
        int resultant[] = new int[2];
        int i = 0;
        int j= arr.length -1;
        while (i<j){
            if(arr[i] + arr[j] == target){
                resultant[0] = i+1;
                resultant[1] = j+1;
                break;
            }
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
