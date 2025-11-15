# 🚀 CIT300 – Algorithm Performance Analyzer  
### Graded Practical Assignment 3 | Week 14  
**Repository:** [AlgorithmExecutionTimeMeasurement](https://github.com/Tharindu999-git/AlgorithmExecutionTimeMeasurement.git)  

This Java‑based project measures and compares the execution time of different algorithms when run on arrays of sizes **100**, **500**, and **1000**, using `System.nanoTime()` for timing.  

---

## 👥 Team Members & Responsibilities  

| Member  | Algorithm       | Task Description                                                                 |
|---------|------------------|----------------------------------------------------------------------------------|
| Member 1 | Linear Search    | Measuring search time in unsorted arrays of sizes 100, 500, 1000                |
| Member 2 | Binary Search    | Sorting the array + performing binary search; measure search time                |
| Member 3 | Bubble Sort      | Measuring sorting time for arrays of sizes 100, 500, 1000                        |
| Member 4 | Quick Sort       | Measuring sorting time (using Quick Sort) for arrays of the three sizes         |

---

## 🎯 Project Objective  

1. Generate random integer arrays for each size.  
2. Run each algorithm (search or sort) on those arrays.  
3. Measure the execution time using `System.nanoTime()`.  
4. Print the results in a clear table format so you can compare how time scales with input size.  

_Example Output Format_:  
Algorithm: Bubble Sort
Input Size | Time (ns)
100 | 152000
500 | 780000
1000 | 3120000


---

## 🛠️ Technologies & Tools  

- Java (JDK 8 or higher)  
- Git & GitHub for version control and collaboration  
- Any Java IDE or editor (IntelliJ, VS Code, NetBeans, etc.)

---

## 📁 Project Structure  



### File Descriptions  
- **ArrayGenerator.java** — Utility class to generate random integer arrays of a given size.  
- **LinearSearch.java** — Implements Linear Search and measures the search time.  
- **BinarySearchAlgo.java** — Sorts the array then performs Binary Search; measures time.  
- **BubbleSort.java** — Implements Bubble Sort and records how long the sorting takes.  
- **QuickSort.java** — Implements Quick Sort (partition + recursion) and measures execution time.  
- **Main.java** — Runs all algorithms in one program, printing tables of results for each size.  

---

## ▶️ How to Run the Program  

1. Clone the repository:  
   ```bash
   git clone https://github.com/Tharindu999-git/AlgorithmExecutionTimeMeasurement.git




