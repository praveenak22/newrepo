package org.cap.demo;

public class BootClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		show();
	}
	public static void show() {
		int[] arr= {1,2,3}; int sum=0;
		for(int n:arr)
		{
			sum+=arr[n];
		}
		System.out.println(sum);
		System.out.println("Show method");
	}
}
