# Java Collections

## Overview

1. Basics of Java Collections Framework
2. Core Interfaces
3. Key Implementations
4. Utility Classes

---------
**Knowledge required before learning java collection**
- [ ] Java classes
- [ ] Java interfaces

### Introduction of Java Collections
  - Any group of individual objects that are represented as a single unit
  - Two main “root” interfaces of Java collection classes.
    1) `java.util.Collection`
    2) `java.util.Map`

![alt text](image.png)

### Use of java Collections
The Java Collections Framework is a set of interfaces and classes in Java that help you store, manage, and manipulate groups of objects (collections) efficiently.

Think of it like a toolbox that gives you different containers (like List, Set, Map) to store data and different tools (methods) to work with them.

**What are the Interfaces**
Interfaces are like blueprint, consider it as type for object or class

**What are the implmentations**
An implementation is a concrete class that provides the actual working code behind an interface.

| Interface                                  | Implementation                              |
| ------------------------------------------ | ------------------------------------------- |
| Describes **what** operations are possible | Provides **how** operations are performed   |
| Examples: `List`, `Set`, `Map`             | Examples: `ArrayList`, `HashSet`, `HashMap` |
| Used for flexibility and decoupling        | Used to actually store and manage data      |


### Core Interfaces
| Interface    | What it Represents                  | Examples of Implementations   |
| ------------ | ----------------------------------- | ----------------------------- |
| `Collection` | Root of all collection interfaces   | `List`, `Set`, `Queue`        |
| `List`       | Ordered collection (like an array)  | `ArrayList`, `LinkedList`     |
| `Set`        | Unique elements, no duplicates      | `HashSet`, `TreeSet`          |
| `Queue`      | Elements in a specific order (FIFO) | `LinkedList`, `PriorityQueue` |
| `Map`        | Key-value pairs                     | `HashMap`, `TreeMap`          |

| Interface | Allows Duplicates | Maintains Order          | Key Feature        |
| --------- | ----------------- | ------------------------ | ------------------ |
| `List`    | ✅ Yes             | ✅ Yes                    | Indexed access     |
| `Set`     | ❌ No              | ❌ (unless LinkedHashSet) | Unique elements    |
| `Queue`   | ✅ Yes             | ✅ Yes (FIFO)             | First-In-First-Out |
| `Map`     | ❌ (keys)          | ❌ (unless LinkedHashMap) | Key-value storage  |

------

### Core Implementatios of Collections
