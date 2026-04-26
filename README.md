# Assignment3-ADS

A. PROJECT OVERVIEW:

The project implements and compares 3 algorithms:
1) Selection Sort - a basic simple algorithm that works slowly with large data. The difficulty - O(n^2)
2) Quick sort - one of the most efficient and used sorting algorithms. Difficulty - O(nlogn)
3) Binary search - a highly efficient algorithm for finding elements. Difficulty - O(logn)

The purpose of this experiment is to run algorithms and compare their performance in different array sizes and input data.

B. ALGORITHM DESCRIPTIONS:

1. Selection Sort:

How it works: The algorithm divides the array into two parts: sorted (at the beginning) and unsorted. At each step, 
we find the minimum element in the unsorted part and swap it with the first element of this part, thereby increasing the
sorted part by one element. The process repeats until the entire unsorted part is gone

Time Complexity:

Best Case - O(n^2)

Middle Case - O(n^2)

Worst Case - O(n^2)

2. Quick Sort:

How it works: 