package com.merge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MergeArrayTest {

	@Test
	public void testSortedArrayMerge() throws Exception {
		MergeSortedArray mergeSortedArray = new MergeSortedArray();
		int firstArray[] = new int[6];
		firstArray[0]=1;
		firstArray[1]=4;
		firstArray[2]=6;
		firstArray[3]=8;
		int[] secondArray = {3,7};
		int[] expectedArray= {1,3,4,6,7,8};
		
		int[] actualArray = mergeSortedArray.gerMergerdArray(firstArray, secondArray);
		assertEquals(expectedArray[0], actualArray[0]);
		assertEquals(expectedArray[1], actualArray[1]);
		assertEquals(expectedArray[2], actualArray[2]);
		assertEquals(expectedArray[3], actualArray[3]);
		assertEquals(expectedArray[4], actualArray[4]);
		assertEquals(expectedArray[5], actualArray[5]);
	}
}
