# AlgoAnalysisHW
Different sorting algorithms and its runtime analyses


![image](https://user-images.githubusercontent.com/43817874/162685193-2b9661ed-ff21-4384-964c-8af10846801c.png)

** Times in nanoseconds

I implemented the algorithms on geeksforgeeks
Heapsort: https://www.geeksforgeeks.org/heap-sort/
Introsort: https://www.geeksforgeeks.org/introsort-or-introspective-sort/
Shellsort: https://www.geeksforgeeks.org/shellsort/
1. Equal Integer Comparision:
For the equal integers, we do not need to sort numbers because they are already sorted. This 
situation may be the best case but for the not-stable algorithms, this is not the best case because the 
numbers are changed during the sorting. According to my running time calculations, heapsort is the 
best for small values of but for the large values of n introsort is the best. Based on theoratical 
calculations, these values are wrong because introsort supposed to be the best case for small values 
of n. As expected, shellsort is the worts for all values of n because the time complexity of shellsort is 
O(n^2).
2. Random Integer Comparision
Random integers is used to represent average case. Both Intro and the Heap sort time complexity is 
O(nlogn) for the average case. Shellsort is O(n^2). According to my running time calculations, 
heapsort is the worst and shellsort is slightly the best for 1000 values. For 100000 values introsort is 
the best as it is supposed to be. But for the heapsort it should not have the worst because the time 
complexity of the heapsort is better than the shellsort. I implemented different version of heap, intro 
and shellsort but the running times are always turned out like this.
3. Increasing Integer Comparision
Increasing integer is used to represent best case. For 1000 and 10000 values, heapsort is the best. 
Time complexity of heap sort is O(nlogn) for best case. Heapsort time complexity does not change for 
best, worst and average cases and we can see at the table, values are close to each other for every 
cases. For 100000 values, introsort is best by far. This becaues introsort is a hybrid sorting algorithm.
4. Decreasing Integer Comparision
Decreasing integer is used to represent worst case. For 1000 values, introsort is the best and shellsort 
is the worst as I expected. As the value of n grows. Introsort becomes more efficent according to my 
calculations. So, introsort is may be the best option for the worst case for all values of n.
Scenario
This situation holds for average case and for large values of n. According to my calculations. Introsort 
is the best option with no doubt if we interpret the situation for theoretical and practical results. 
Maybe heapsort can be used but introsort faster than heapsort 5 times for 100000 values.
