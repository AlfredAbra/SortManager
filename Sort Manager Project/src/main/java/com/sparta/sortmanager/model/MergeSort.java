package com.sparta.sortmanager.model;

public class MergeSort implements Sorter
 {

  @Override
  public int[] Sorter(int[] arrayOfInts)
  {
   int n = arrayOfInts.length;


   if (n < 2) {
    return null;
   }
   int mid = n / 2;
   int[] l = new int[mid];
   int[] r = new int[n - mid];

   for (int i = 0; i < mid; i++) {
    l[i] = arrayOfInts[i];
   }
   for (int i = mid; i < n; i++) {
    r[i - mid] = arrayOfInts[i];
   }
   Sorter(l);
   Sorter(r);

   merge(arrayOfInts, l, r, mid, n - mid);


   return arrayOfInts;
  }
  public static void merge(
          int[] a, int[] l, int[] r, int left, int right) {

   int i = 0, j = 0, k = 0;
   while (i < left && j < right) {
    if (l[i] <= r[j]) {
     a[k++] = l[i++];
    }
    else {
     a[k++] = r[j++];
    }
   }
   while (i < left) {
    a[k++] = l[i++];
   }
   while (j < right) {
    a[k++] = r[j++];
   }
  }


 }
