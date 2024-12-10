## The "average" function
![Screenshot 2024-12-09 222538](https://github.com/user-attachments/assets/616d57cf-ed2b-491f-afb0-226a1aa06138)

## HW3-PartA: Functional Description
The average function takes an integer and an array of integers (list) as parameters. This function is used to calculate the average value of the first k elements in the array. If the value of k is valid (greater than 0) and the array has at least one element, the program will calculate return the average of the elements. In case of valid inputs: If k is less than the array size, program returns the average of the first k elements in the array; If k is greater than the array size, program returns the average of all elements in the array. Otherwise, the program returns 0 due to invalid input value(s). 

## HW3-PartB: Functional Test Case
#### Test Case 1: k is less than the array size (valid)
* Input: k = 4, list = {2, 4, 3, 3, 5, 3}
* Expected Output: The program returns 3 (The average of the first 4 elements in the array is calculated as (2+4+3+3)/4) = 3).

#### Test Case 2: k is greater than the array size (valid)
* Input: k = 20, list = {2, 4, 3, 3, 5, 3}
* Expected Output: The program return 3 (The average of integers in the array will be calculated as (2+4+3+3+5+3)/6 = 3).

#### Test Case 3: k is similar to the array size (valid)
* Input: k = 4, list = {2, 4, 3, 3}
* Expected Output: The program returns 3 (The average of the first 4 elements in the array will be (2+4+3+3)/4 = 3)

#### Test Case 4: k is 0 (invalid)
* Input: k = 0, list = {2, 4, 3, 3}
* Expected Output: The program returns 0.

#### Test Case 5: k is negative (invalid)
* Input: k = -10, list = {2, 4, 3, 3}
* Expected Output: The program return 0.

#### Test Case 6: Array is empty (invalid)
* Input: k = 4, list = {}
* Expected Output: The program returns 0.

## HW3-PartC: Partitions and Partition Test Cases 
#### Partition by k:
* k < 0
* k = 0
* 0 < k <= list.length
* k > list.length
#### Partion by list.length:
* Empty array
* Non-empty array
#### Partition Test Cases:
|Test Case ID|Partition|Input k|Input Array list|Expected Output|
|-|-|-|-|-|
|P1|k < 0| -5 | [-1,2,-3,4] | 0 |
|P2|k = 0| 0 | {1,2,3,4] | 0 |
|P3| 0 < k < list.length | 2 | [1,2,3,4] | 1 |
|P4| k > list.length | 5 | [1,2,3,4] | 2 |
|P5| empty array | 5 | [] | 0 |
|P6| Non-empty array | 3 | [1,2,3,4] | 2 |

## HW3-PartD: Boundary Value Test Cases:
|Test Case ID| Boundary Condition | Input k | Input Array list | Expected Output |
|-|-|-|-|-|
|B1| k is less than minimum valid value, k <= 0 | k = -1 or k = 0 | [2,4,6] | 0 | 
|B2| minimum valid k | k = 1 | [2,4,6] | 12 |
|B3| maximum valid k, k = list.length | k = 3 | [2,4,6] | 4 |
|B4| k is over the maximum, k = list.length + 1| k = 4 | [2,4,6] | 4 |
|B5| minimum size of array, list.length = 0 | k = 2 | [] | 0 |
|B6| maximum valid size of array, list.length = k | k = 1 | [2] | 2 |

## HW3-PartE: Java Implementation and JUnit Test Cases
### Implement Average Function
``` ruby
public class Average {
    public int average(int k, int[] list) {
        int average = 0;
        int n = Math.min(k, list.length);
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                average += list[i];
            }
            average = average / n;
        }
        return average;
    }
} 
```
### Implement JUnit Test Cases

## HW3-PartF: Compile and Run Test Cases

## Code Coverage
