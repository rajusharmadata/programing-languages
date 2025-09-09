# Ultimate Recursion, Backtracking, and Divide & Conquer Cheat Sheet (Java)

## 1. Recursion Fundamentals

### 1.1 What is Recursion?
- A programming technique where a method calls itself to solve a problem
- Consists of two main components:
  1. Base case: The condition that stops the recursion
  2. Recursive case: The part where the method calls itself with a modified input

### 1.2 Basic Recursion Template
```java
public class RecursionTemplate {
    public static int recursiveMethod(int input) {
        // Base case: Termination condition
        if (baseCondition) {
            return baseResult;
        }

        // Recursive case
        return recursiveMethod(modifiedInput);
    }
}
```

### 1.3 Key Recursion Characteristics
- **Call Stack**: Each recursive call is added to the call stack
- **Memory Overhead**: Can be memory-intensive for deep recursions
- **Performance**: Often less efficient than iterative solutions

## 2. Types of Recursion

### 2.1 Linear Recursion
- Method makes a single recursive call in each execution
```java
public class LinearRecursion {
    public static int factorial(int n) {
        // Base case
        if (n <= 1) {
            return 1;
        }
        // Recursive case
        return n * factorial(n - 1);
    }
}
```

### 2.2 Tree Recursion
- Method makes multiple recursive calls
```java
public class TreeRecursion {
    public static int fibonacci(int n) {
        // Base cases
        if (n <= 1) {
            return n;
        }
        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
```

### 2.3 Tail Recursion
- Recursive call is the last operation in the method
- Note: Java doesn't automatically optimize tail recursion
```java
public class TailRecursion {
    public static int factorial(int n) {
        return factorialHelper(n, 1);
    }

    private static int factorialHelper(int n, int accumulator) {
        // Base case
        if (n <= 1) {
            return accumulator;
        }
        // Recursive case
        return factorialHelper(n - 1, n * accumulator);
    }
}
```

## 3. Common Recursion Patterns

### 3.1 Factorial Calculation
```java
public class FactorialRecursion {
    public static long factorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case
        return n * factorial(n - 1);
    }
}
```

### 3.2 Power Function
```java
public class PowerRecursion {
    public static double power(double base, int exponent) {
        // Base case
        if (exponent == 0) {
            return 1;
        }

        // Handle negative exponents
        if (exponent < 0) {
            return 1 / power(base, -exponent);
        }

        // Recursive case
        return base * power(base, exponent - 1);
    }
}
```

### 3.3 Palindrome Check
```java
public class PalindromeRecursion {
    public static boolean isPalindrome(String s) {
        // Remove non-alphanumeric characters and convert to lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Base case
        if (s.length() <= 1) {
            return true;
        }

        // Check first and last characters
        return s.charAt(0) == s.charAt(s.length() - 1) &&
               isPalindrome(s.substring(1, s.length() - 1));
    }
}
```

## 4. Backtracking

### 4.1 What is Backtracking?
- Recursive algorithm for solving problems by trying partial solutions
- Systematically explores all potential solutions
- Abandons a solution as soon as it determines it cannot possibly be completed

### 4.2 Backtracking Template
```java
public class BacktrackingTemplate {
    public void backtrack(List<Integer> current, List<Integer> remainingOptions) {
        // Base case: Solution found or exhausted
        if (isSolutionComplete(current)) {
            // Process or store the solution
            return;
        }

        // Try all possible next steps
        for (int i = 0; i < remainingOptions.size(); i++) {
            // Make a choice
            current.add(remainingOptions.get(i));

            // Remove the chosen option to prevent reuse (if needed)
            List<Integer> updatedOptions = new ArrayList<>(remainingOptions);
            updatedOptions.remove(i);

            // Recursively explore
            backtrack(current, updatedOptions);

            // Backtrack: remove the last added element
            current.remove(current.size() - 1);
        }
    }

    private boolean isSolutionComplete(List<Integer> current) {
        // Implement solution completion check
        return false;
    }
}
```

### 4.3 Backtracking Example: Generating Permutations
```java
public class PermutationBacktracking {
    public List<List<Integer>> generatePermutations(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(new ArrayList<>(), nums, result);
        return result;
    }

    private void backtrack(List<Integer> current, int[] nums, List<List<Integer>> result) {
        // Base case: permutation is complete
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Try adding each unused number
        for (int num : nums) {
            if (!current.contains(num)) {
                current.add(num);
                backtrack(current, nums, result);
                current.remove(current.size() - 1);
            }
        }
    }
}
```

## 5. Divide and Conquer Strategies

### 5.1 Merge Sort
```java
public class MergeSort {
    public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Recursively sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        // Merge logic implementation
        // ... (full implementation omitted for brevity)
    }
}
```

### 5.2 Quick Sort
```java
public class QuickSort {
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find partition index
            int partitionIndex = partition(arr, low, high);

            // Recursively sort left and right subarrays
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        // Partition logic implementation
        // ... (full implementation omitted for brevity)
        return 0;
    }
}
```

## 6. Best Practices and Considerations

### 6.1 Recursion Pitfalls
- **Stack Overflow**: Deep recursion can cause stack overflow
- **Performance**: Recursive solutions can be less efficient
- **Readability**: Not always more readable than iterative solutions

### 6.2 Optimization Techniques
- Use memoization to cache results
- Consider tail-call optimization
- Use iterative solutions for performance-critical code

## 7. When to Use Recursion
- Tree and graph traversals
- Divide and conquer algorithms
- Problems with recursive mathematical definitions
- Backtracking algorithms
- Situations where recursive solution is more intuitive

## 8. Performance Considerations
- Time Complexity: O(2^n) for exponential recursive algorithms
- Space Complexity: O(n) for call stack in linear recursion
- Memoization can improve time complexity for repeated subproblems
