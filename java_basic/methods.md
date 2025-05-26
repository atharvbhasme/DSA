# Java Methods

### Difference Between Methods and Functions
| Aspect       | Method (Java)                          | Function (General)                     |
| ------------ | -------------------------------------- | -------------------------------------- |
| Defined in   | Inside a class                         | Can be standalone                      |
| Java support | ✅ Yes                                  | 🚫 Not directly supported              |

### What is Java Methods
- Methods are block of codes that perform specific task
- Methods in java must belong to class

### Java Key Compoent of methods
- Access Modifiers: It specifies the method's access level (e.g., public, private, protected, or default).
- Return Type: Type Like (void, int, string etc)
- Method Name: it should start with a lowercase verb and use camel case for multiple words.
- Parameters: A list of input values (optional)
- Method Body: It contains the logic to be executed (optional in the case of abstract methods).
- Exception List: The exceptions the method might throw (optional).
  e.g. 
  ```java
  returnType methodName(parameterList) throws ExceptionType1, ExceptionType2, ... {
    // Method body
    }
  ```

### Different way to create methods
| Feature              | Static Method                    | Instance Method            |
| -------------------- | -------------------------------- | -------------------------- |
| Belongs to           | Class                            | Object (instance of class) |
| Needs object to call | ❌ No                             | ✅ Yes                      |
| Keyword              | Uses `static` keyword            | No `static` keyword        |
| Access to variables  | Can only access static variables | Can access all variables   |
| Example usage        | `ClassName.method()`             | `object.method()`          |


### Calling Methods
- calling user defined functions
- calling abstact methods
- calling predefined methods
- calling static methods

#### Access Modifiers
| Context                       | `private` | **default** (no keyword) | `protected` | `public` |
| ----------------------------- | --------- | ------------------------ | ----------- | -------- |
| Same package, same class      | ✅ Yes     | ✅ Yes                    | ✅ Yes       | ✅ Yes    |
| Same package, subclass        | ❌ No      | ✅ Yes                    | ✅ Yes       | ✅ Yes    |
| Same package, different class | ❌ No      | ✅ Yes                    | ✅ Yes       | ✅ Yes    |
| Different package, subclass   | ❌ No      | ❌ No                     | ✅ Yes       | ✅ Yes    |
| Different package, diff class | ❌ No      | ❌ No                     | ❌ No        | ✅ Yes    |


