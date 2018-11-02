package test;
import java.util.*;;


public class main {
	public static void main(String[] args){
		int [] a = {15,9,60,44,12,1,4};
		for (int i = 0; i<7;i++){
		System.out.println(a[i]);
		}
		
	}
	/*
	 * use merge-sort
	 */
	public static void ExamSOrt(int[] arr, int size){
		int[] temp = new int[size];
		mergeR(arr,temp, 0, size);
	}
	/*
	 * the recursive method to sort
	 */
	private static void mergeR(int[] arr,int[]temp, int left, int right){
		
		int mid = (left+right)/2;
		int [] lefthalf = partition(arr, left, mid);
		int [] righthalf = partition(arr,mid,right);
		mergeR(lefthalf,temp,left,mid);
		mergeR(righthalf,temp,mid,right);
		
	}
	
	private static int[] partition(int[] a, int left, int right){
		
		int[]c = new int[right-left];
		
		return c;
	}
	
}
