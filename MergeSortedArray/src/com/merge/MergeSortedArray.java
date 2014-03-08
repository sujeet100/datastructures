package com.merge;

public class MergeSortedArray {

	public int[] gerMergerdArray(int[] firstArray, int[] secondArray) {
		
		int firstArrayIndex = firstArray.length-secondArray.length-1;
		int secondArrayIndex = secondArray.length-1;
		for(int i=firstArray.length-1; i>0; i--){
			if(secondArrayIndex<0 || firstArray[firstArrayIndex]>secondArray[secondArrayIndex]){
				firstArray[i] = firstArray[firstArrayIndex--];
			}else if(firstArrayIndex<0 || firstArray[firstArrayIndex]<secondArray[secondArrayIndex]){
				firstArray[i] = secondArray[secondArrayIndex--];
			}
		}
		
		return firstArray;
	}

}
