### The "average" function:
![Screenshot 2024-12-09 222538](https://github.com/user-attachments/assets/616d57cf-ed2b-491f-afb0-226a1aa06138)

The average function takes an integer and an array of integers (list) as parameters. This function is used to calculate the average value of the first k elements in the array. If k is less than the amount of values in the array, the program will enter the for loop and add all values together, then, divide it by the amount of k integers. The function return the average. However, if k is more than the amount of elements in the array, the program returns 0.

Generate functional test case based on functional description:
### Test Case 1: k is less than the array size
* Input: k = 4, list = {2, 4, 3, 3, 5, 3}
* Expected Output: n= 4. The program returns 3 (The average of the first 4 elements in the array is calculated as (2+4+3+3)/4) = 3).

### Test Case 2: k is greater than the array size
* Input: k = 20, list = {2, 4, 3, 3, 5, 3}
* Expected Output: n = 6. The program return 3 (The average of this run will be calculated as (2+4+3+3+5+3)/6 = 3).

### Test Case 3: k is similar to the array size
* Input: k = 4, list = {2, 4, 3, 3}
* Expected Output: n = 4. The average of the first 4 elements in the array will be (2+4+3+3)/4 = 3. The program returns 3.

### Test Case 4: k is 0 
* Input: k = 0, list = {2, 4, 3, 3}
* Expected Output: n = 0. The program returns 0.

### Test Case 5: k is negative
* Input: k = -10, list = {2, 4, 3, 3}
* Expected Output: n = -10. The program return 0.

### Test Case 6: Array is empty
* Input: k = 4, list = {}
* Expected Output: n = 0. The program returns 0.
