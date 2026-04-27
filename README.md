# Assignment3-ADS

A. PROJECT OVERVIEW:
-
The project implements and compares 3 algorithms:
1) Selection Sort - a basic simple algorithm that works slowly with large data. The difficulty - O(n^2)
2) Quick sort - one of the most efficient and used sorting algorithms. Difficulty - O(nlogn)
3) Binary search - a highly efficient algorithm for finding elements. Difficulty - O(logn)

The purpose of this experiment is to run algorithms and compare their performance in different array sizes and input data.

---
B. ALGORITHM DESCRIPTIONS:
-
1. Selection Sort:

How it works: The algorithm divides the array into two parts: sorted (at the beginning) and unsorted. At each step, 
we find the minimum element in the unsorted part and swap it with the first element of this part, thereby increasing the
sorted part by one element. The process repeats until the entire unsorted part is gone

Time Complexity:

Best Case - O(n^2)

Middle Case - O(n^2)

Worst Case - O(n^2)

2. Quick Sort:

How it works: The algorithm is of the "Divide and conquer" type (that is, splitting the problem into 2, smaller subtasks and splitting until the elements become basic, then a combined solution and combining the results of the subtasks). A pivot is selected from the array. The elements that are smaller than the pivot are shifted to the left, and those that are larger are shifted to the right. Then apply this approach until the sorting is complete.

Time Complexity:

Best Case - O(nlogn)

Middle Case - O(nlogn)

Worst Case - O(n^2)

3. Binary Search

How it works: It works on the principle of "Divide and conquer". The middle element in the array is selected. If the middle element is equal to the one you are looking for, then the search ends. If the search is less than the average, the search is in the left half, if it is more, in the right half. It runs until the desired value is found.

Time Complexity:

Best Case - O(1)

Middle Case - O(logn)

Worst Case - O(logn)

---

C. EXPERIMENTAL RESULTS
-

Tests run on: Random arrays and Pre-sorted arrays. 

Sizes: 10, 100, 1000.

---
1. Array size: 10

---
1. Type: Random 

a) Selection Sort: 5014 ns

b) Quick Sort: 10 454 ns

c) Binary Search: 2211 ns

---
1.1 Type: Sorted

a) Selection Sort: 2397 ns

b) Quick Sort: 4571 ns

c) Binary Search: 1201 ns

---

2. Array Size: 100

---
1.Type: Random

a) Selection Sort: 76 543 ns

b) Quick Sort: 21 729 ns

c) Binary Search: 1042 ns

---

1.2. Type: Sorted

a) Selection Sort: 72 897 ns

b) Quick Sort: 166 723 ns

c) Binary Search: 985 ns

---

3. Array Size: 1000

---

1. Type: Random


