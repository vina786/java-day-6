import java.util.*;
public class singlearray {
    public static void main(String args[])
    {
        int arr[]={22,44,564,897,808};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        arr[2]=456;
        arr[3]=345;
        System.out.println(Arrays.toString(arr));
    }
}
