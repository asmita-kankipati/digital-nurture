**Big O Notation**



Big O notation describes how the runtime of an algorithm grows as input size increases.



It helps us compare algorithms based on efficiency, especially for large data.



Common Big O examples:

O(1) → Constant time (fastest)

O(log n) → Logarithmic (very efficient)

O(n) → Linear (medium)

O(n²) → Quadratic (slow)





**Best, Average, and Worst Case Scenarios**



* These represent the different performance outcomes of an algorithm based on input conditions



* Best Case: The minimum time the algorithm takes, often when the target is found early.



* Average Case: The expected time over all possible inputs, assuming uniform distribution.



* Worst Case: The maximum time the algorithm takes, usually when the target is at the end or not present.





**Linear Search**



* Linear search is a simple search method that checks each element of the array one by one.



* Best Case: O(1) – when the element is the first



* Average Case: O(n) – element is in the middle



* Worst Case: O(n) – element is at the end or not present







**Binary Search**



* Binary search is an efficient search method that repeatedly divides the sorted array in half.



* Best Case: O(1) – when the element is in the middle



* Average Case: O(log n)



* Worst Case: O(log n)





**Best choice for E-commerce Platform** : Binary Search (with indexing)



* E-commerce platforms have millions of products
* Search must be fast and scalable
* O(log n) is much better than O(n)





