package com.sample;

public class Launch {
	
public static void main(String[] args) {
		
		int arr[]= {11,22,33,44,55,66,77};
		//your code
		int temp=0;
		int sum = 0 ,mul = 1 ;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		}
		for(int i=1;i<arr.length;i++) {
			mul=mul*arr[i];
			
		}
		System.out.print("Orignal Array.:-");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Orignal Array Sum.:- "+sum);
		System.out.println("Orignal Array Multiplication.:- "+mul);
for(int i=0;i<arr.length/2;i++) // 0 1
{
	for(int j=arr.length-1-i;j>=arr.length/2;j--) //4 3 2
	{
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		break;
	}
}
        System.out.print("Reversed Array.:-");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}


