# Python Comprehensive Cheat Sheet

## 1. Python Basics

### 1.1 Data Types
```python
# Numeric Types
integer = 10
floating_point = 3.14
complex_num = 3 + 4j

# Sequence Types
list_example = [1, 2, 3]
tuple_example = (1, 2, 3)
string_example = "Hello, Python!"

# Set Types
set_example = {1, 2, 3}
frozenset_example = frozenset([1, 2, 3])

# Mapping Type
dict_example = {"key": "value", "name": "John"}

# Boolean
boolean = True
none_type = None
```

### 1.2 Type Conversion
```python
# Explicit Type Conversion
x = int("10")  # String to Integer
y = float(10)  # Integer to Float
z = str(10)   # Integer to String
list_conv = list("hello")  # String to List
```

## 2. Control Structures

### 2.1 Conditional Statements
```python
# If-Elif-Else
x = 10
if x > 0:
    print("Positive")
elif x < 0:
    print("Negative")
else:
    print("Zero")

# Ternary Operator
result = "Even" if x % 2 == 0 else "Odd"
```

### 2.2 Loops
```python
# For Loop
for item in [1, 2, 3, 4]:
    print(item)

# While Loop
count = 0
while count < 5:
    print(count)
    count += 1

# List Comprehension
squares = [x**2 for x in range(10)]

# Generator Expression
gen = (x**2 for x in range(10))
```

## 3. Functions

### 3.1 Function Definitions
```python
# Basic Function
def greet(name):
    return f"Hello, {name}!"

# Default Arguments
def power(base, exponent=2):
    return base ** exponent

# *args and **kwargs
def flexible_function(*args, **kwargs):
    print(args)    # Tuple of positional arguments
    print(kwargs)  # Dictionary of keyword arguments

# Lambda Functions
multiply = lambda x, y: x * y
```

### 3.2 Decorators
```python
def logger(func):
    def wrapper(*args, **kwargs):
        print(f"Calling {func.__name__}")
        return func(*args, **kwargs)
    return wrapper

@logger
def add(x, y):
    return x + y
```

## 4. Object-Oriented Programming

### 4.1 Class Definition
```python
class Person:
    # Class Variable
    species = "Homo Sapiens"

    # Constructor
    def __init__(self, name, age):
        # Instance Variables
        self.name = name
        self.age = age

    # Instance Method
    def introduce(self):
        return f"I'm {self.name}, {self.age} years old"

    # Class Method
    @classmethod
    def create_anonymous(cls):
        return cls("Anonymous", 0)

    # Static Method
    @staticmethod
    def is_adult(age):
        return age >= 18

# Inheritance
class Student(Person):
    def __init__(self, name, age, grade):
        super().__init__(name, age)
        self.grade = grade
```

### 4.2 Magic Methods
```python
class Vector:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f"Vector({self.x}, {self.y})"

    def __add__(self, other):
        return Vector(self.x + other.x, self.y + other.y)
```

## 5. File Handling

### 5.1 Reading Files
```python
# Read Entire File
with open('file.txt', 'r') as file:
    content = file.read()

# Read Line by Line
with open('file.txt', 'r') as file:
    for line in file:
        print(line.strip())

# Read All Lines
with open('file.txt', 'r') as file:
    lines = file.readlines()
```

### 5.2 Writing Files
```python
# Write to File
with open('output.txt', 'w') as file:
    file.write("Hello, World!")

# Append to File
with open('log.txt', 'a') as file:
    file.write("New log entry\n")
```

## 6. Exception Handling

### 6.1 Try-Except Blocks
```python
try:
    result = 10 / 0
except ZeroDivisionError:
    print("Cannot divide by zero")
except Exception as e:
    print(f"An error occurred: {e}")
else:
    print("No exceptions")
finally:
    print("Always executed")
```

## 7. Data Structures

### 7.1 Lists
```python
# List Operations
my_list = [1, 2, 3, 4, 5]
my_list.append(6)        # Add element
my_list.extend([7, 8])   # Add multiple elements
my_list.insert(0, 0)     # Insert at specific index
my_list.remove(3)        # Remove specific element
popped = my_list.pop()   # Remove and return last element
```

### 7.2 Dictionaries
```python
# Dictionary Operations
my_dict = {"name": "John", "age": 30}
my_dict["city"] = "New York"  # Add new key-value
value = my_dict.get("name")   # Safe retrieval
my_dict.update({"job": "Engineer"})  # Update multiple
```

### 7.3 Sets
```python
# Set Operations
set1 = {1, 2, 3}
set2 = {3, 4, 5}
union_set = set1 | set2
intersection_set = set1 & set2
difference_set = set1 - set2
```

## 8. Advanced Concepts

### 8.1 Generators
```python
def fibonacci_generator(n):
    a, b = 0, 1
    for _ in range(n):
        yield a
        a, b = b, a + b

# Using the generator
for num in fibonacci_generator(10):
    print(num)
```

### 8.2 Context Managers
```python
class FileManager:
    def __init__(self, filename, mode):
        self.filename = filename
        self.mode = mode
        self.file = None

    def __enter__(self):
        self.file = open(self.filename, self.mode)
        return self.file

    def __exit__(self, exc_type, exc_val, exc_tb):
        if self.file:
            self.file.close()

# Usage
with FileManager('test.txt', 'w') as f:
    f.write('Hello, World!')
```

## 9. Standard Library Highlights

### 9.1 Collections
```python
from collections import Counter, defaultdict, OrderedDict

# Counter
word_counts = Counter(['apple', 'banana', 'apple'])

# DefaultDict
word_dict = defaultdict(int)
word_dict['new_key']  # Returns 0 instead of KeyError
```

### 9.2 Itertools
```python
import itertools

# Combinations and Permutations
list(itertools.combinations([1,2,3], 2))
list(itertools.permutations([1,2,3], 2))
```

## 10. Best Practices

### 10.1 PEP 8 Guidelines
- Use 4 spaces for indentation
- Limit lines to 79 characters
- Use snake_case for functions and variables
- Use CamelCase for classes

### 10.2 Performance Tips
- Use list comprehensions instead of loops
- Use generators for large datasets
- Prefer local variables
- Use `join()` for string concatenation
