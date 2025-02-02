# All the concepts in Java

####  1. Autoboxing and Unboxing in java
Autoboxing = covert from primitive datatype to non-primitive data type
unboxing = covert from non primitive to primitive

e.g. \
🔹 Autoboxing: Converts int → Integer.\
🔹 Unboxing: Converts Integer → int.


#### 2. What is difference between int and Integer
| Feature                  | `int` (Primitive)               | `Integer` (Wrapper Class)       |
|--------------------------|----------------------------------|----------------------------------|
| **Type**                 | Primitive data type             | Reference (Object) type         |
| **Memory**               | Stores raw value directly in stack memory | Stores reference in heap memory |
| **Default Value**        | `0` (if declared as a field)    | `null` (as it is an object)     |
| **Supports Generics?**   | ❌ No                           | ✅ Yes                          |
| **Performance**          | ✅ Fast (no overhead)           | ❌ Slower (because of object creation & unboxing) |
| **Methods Available?**   | ❌ No methods                   | ✅ Provides utility methods (`parseInt()`, `toString()`, etc.) |
| **Usage in Collections?**| ❌ Cannot be used (e.g., `List<int>` is invalid) | ✅ Required in Collections (`List<Integer>`) |
| **Can be null?**         | ❌ No                           | ✅ Yes                          |

