package com.globant.searchAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class SearchA {

	
	
	public static int binarySearch(List<Integer> numbers,int l, int h, int x) {
		
		if (h >= l) {
			int mid = l + (h - l) / 2;
			// If the element is present at the middle itself
			if (numbers.get(mid) == x)
			return mid;
			// If element is smaller than mid, then it can only be present in left subarray
			if (numbers.get(mid) >x)
			return binarySearch(numbers, l, mid - 1, x);
			// Else the element can only be present in right subarray
			return binarySearch(numbers, mid + 1, h, x);
			}
			// We reach here when element is not present in array
			return -1;	
	}
	
	
	public static int binarySearchIterative(List<Integer> numbers, int elementToSearch) {

	    int firstIndex = 0;
	    int lastIndex = numbers.size() - 1;

	    // termination condition (element isn't present)
	    while(firstIndex <= lastIndex) {
	        int middleIndex = (firstIndex + lastIndex) / 2;
	        // if the middle element is our goal element, return its index
	        if (numbers.get(middleIndex) == elementToSearch) {
	            return middleIndex;
	        }

	        // if the middle element is smaller
	        // point our index to the middle+1, taking the first half out of consideration
	        else if (numbers.get(middleIndex) < elementToSearch)
	            firstIndex = middleIndex + 1;

	        // if the middle element is bigger
	        // point our index to the middle-1, taking the second half out of consideration
	        else if (numbers.get(middleIndex) > elementToSearch)
	            lastIndex = middleIndex - 1;

	    }
	    return -1;
	}
	
	//secuential or linear search
	public static int secuentialSearch(List<Integer> numbers,int key) {
		for(int i=0;i<numbers.size();i++)
		{
            if(numbers.get(i) == key)
            {
                return i;
            }
        }
        return -1;
	}

	

	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);		
		
		//begin Binary search	
		int h=numbers.size()-1;
		int l=0;
		int x=3;
		int res = binarySearch(numbers,l,h,x);
		if (res == -1)
		System.out.println("Element not present");
		else
		System.out.println("Element found at index " + res);
		//end Binary search	
		
		
		//begin secuential or linear search 
		int res2 =secuentialSearch(numbers, x);
		if (res2 == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + res2);
		
		//end secuential or linear search 
		

	}

}
