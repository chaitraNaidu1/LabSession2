package labSession2;

import java.util.Scanner;

public class Denominations {

		public static void main(String[] args) {
			System.out.println("Enter the number of denominations");
			Scanner sc= new Scanner(System.in);
			int deno=sc.nextInt();
			int deno1[]=new int[deno];
			System.out.println("Enter the values of denominations");
			for(int i=0;i<deno;i++) {
				deno1[i]=sc.nextInt();
			}
			mergeSort(deno1,0,deno1.length-1);
			for (int i = 0; i < deno1.length; i++) {
			
				System.out.println(deno1[i]);
			System.out.println("Enter the amount you want to pay: ");
			int amount = sc.nextInt();

			for (int i1 = 0; i1 < deno1.length; i1++) {
				if (amount >= deno1[i1]) {
					int notes = amount / deno1[i1];
					System.out.println(deno1[i1] + " : " + notes);
					amount = amount % deno1[i1];
				}
			}
			}
			}

		public static void mergeSort(int[] deno1,int first,int last) {
			
			int mid=(first+last)/2;
			mergesort(deno1,first,mid, mid);
			mergesort(deno1,mid+1,last, mid);
			mergesort(deno1,first,mid,last);	
		}

		public static void mergesort(int[] deno1, int first, int mid, int last) {
			int lsize=mid+first+1;
			int rsize=mid-first+1;
		    int n1;
			int L[] = new int[n1]; // left Array
			int n2;
			int R[] = new int[n2]; // Right Array

			int[] array;
			int f;
			for (int i = 0; i < n1; i++) {
				L[i] = array[f + i];
			}
			for (int i = 0; i < n2; i++) {
				R[i] = array[mid + 1 + i];
			}

			int i = 0, j = 0, k = f;

			while (i < n1 && j < n2) {
				if (L[i] >= R[j]) {
					array[k] = L[i];
					i++;
				} else {
					array[k] = R[j];
					j++;
				}
				k++;
			}
			while (i < n1) {
				array[k] = L[i];
				i++;
				k++;
			}
			while (j < n2) {
				array[k] = R[j];
				j++;
				k++;
			}
			int amount;
			if (amount > 0)
				System.out.println("Remaining Amount: " + amount);

			scanner.close();

			
		}
		
	}


