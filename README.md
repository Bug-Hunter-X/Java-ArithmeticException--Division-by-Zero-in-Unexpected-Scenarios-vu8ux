# Java ArithmeticException: Division by Zero

This repository demonstrates a common yet potentially tricky Java error: the `ArithmeticException` thrown when dividing by zero.  The example showcases a simple division by zero, but also highlights less obvious scenarios where this can occur (e.g., within complex calculations or when external data isn't properly validated).

The `UncommonBug.java` file contains the buggy code.  The solution (`UncommonBugSolution.java`) provides a robust approach that handles potential division by zero errors gracefully. 

## Key Points

* **Common Error:** `ArithmeticException` due to division by zero.
* **Uncommon Scenarios:**  It is important to check for potential divisors of zero in more complex logic than simple division.
* **Solution:** Implement proper error handling (e.g., using `try-catch` blocks) to prevent the application from crashing and provide informative error messages.