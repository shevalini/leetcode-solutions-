# Arrays

Foundation of most coding problems. Contiguous memory, indexed access in O(1), and the base for techniques like prefix sums, sliding window, and two pointers.

## Key concepts
- Fixed size vs dynamic (ArrayList in Java)
- Traversal: O(n)
- Access by index: O(1)
- Insertion/deletion in the middle: O(n) (shifting required)
- Common patterns: two pointers, sliding window, prefix sum

## Java syntax

**Declaring and creating an array:**
```java
int[] nums = new int[5];        // array of 5 ints, default value 0
int[] nums2 = {1, 2, 3, 4, 5};  // declare + initialize directly
```

**2D array:**
```java
int[][] grid = new int[3][3];   // 3x3 grid, all zeros
```

**Accessing and updating elements:**
```java
int first = nums[0];   // access
nums[1] = 10;           // update
```

**Getting the length:**
```java
int len = nums.length;  // note: no parentheses, it's a field not a method
```

**Looping through an array:**
```java
for (int i = 0; i < nums.length; i++) {
    System.out.println(nums[i]);
}

// or enhanced for-loop
for (int num : nums) {
    System.out.println(num);
}
```

**Printing an array:**
```java
System.out.println(nums);              // WRONG: prints something like [I@1b6d3586
System.out.println(Arrays.toString(nums)); // RIGHT: prints [1, 2, 3, 4, 5]
```

**Sorting an array:**
```java
Arrays.sort(nums); // ascending order, in-place
```

**Copying an array:**
```java
int[] copy = Arrays.copyOf(nums, nums.length);       // full copy
int[] part = Arrays.copyOfRange(nums, 1, 4);         // copy indices 1 to 3
```

**Converting array to List (and back):**
```java
Integer[] boxed = {1, 2, 3};
List<Integer> list = Arrays.asList(boxed); // array -> List (fixed-size view)

Integer[] backToArray = list.toArray(new Integer[0]); // List -> array
```

**Using ArrayList (dynamic-size array):**
```java
import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
list.get(0);      // access
list.remove(0);   // remove
list.size();      // length
```

## Common pitfalls
- `ArrayIndexOutOfBoundsException` — accessing an index that doesn't exist (e.g. `nums[nums.length]`)
- Plain arrays are **fixed size** — you can't "add" to them, only change existing indices. Use `ArrayList` if size needs to change.
- `nums.length` (no parentheses) for arrays, but `list.size()` (with parentheses) for ArrayList — easy to mix up.

**Note:** `Arrays.sort()`, `Arrays.toString()`, `Arrays.copyOf()`, and `Arrays.asList()` require `import java.util.Arrays;` at the top of your file.
