# 🔍 Shallow Copy vs Deep Copy in Java

## 📘 What are Copies?
When you create a copy of an object in Java, you have two main approaches: Shallow Copy and Deep Copy.

## 🌊 Shallow Copy: The Surface-Level Twin
### What is a Shallow Copy?
- Creates a new object but shares references to the original object's nested objects
- Like creating a twin that shares the same wardrobe

### Example:
```java
int[] originalArray = {1, 2, 3};
int[] shallowCopy = originalArray; // Same reference
shallowCopy[0] = 100; // Changes BOTH arrays!
```

### 🚨 Potential Issues:
- Modifying the copy can affect the original object
- Risky for objects with nested or mutable fields

## 🏗️ Deep Copy: The Complete Clone
### What is a Deep Copy?
- Creates a completely independent copy of an object
- Copies all fields, creating new instances for nested objects
- Like creating an identical twin with their own unique wardrobe

### Example:
```java
int[] originalArray = {1, 2, 3};
int[] deepCopy = new int[originalArray.length];
// Manually copy each element
for (int i = 0; i < originalArray.length; i++) {
    deepCopy[i] = originalArray[i];
}
deepCopy[0] = 100; // Original array remains unchanged
```

## 🆚 Comparison Table

| Feature | Shallow Copy | Deep Copy |
|---------|--------------|-----------|
| Independence | Shares references | Completely independent |
| Memory Usage | Less memory | More memory |
| Modification Impact | Changes affect both | Changes isolated |
| Performance | Faster | Slower |

## 🛠️ How to Create Deep Copies

### 1. Manual Copying
```java
public Person deepCopy() {
    Person copy = new Person();
    copy.name = this.name;
    copy.scores = Arrays.copyOf(this.scores, this.scores.length);
    return copy;
}
```

### 2. Serialization Method
```java
public Person deepCopy() {
    try {
        // Serialize and then deserialize
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Person) ois.readObject();
    } catch (Exception e) {
        return null;
    }
}
```

## 🤔 When to Use?

### Use Shallow Copy When:
- You want a quick object duplication
- Performance is critical
- Shared references are acceptable

### Use Deep Copy When:
- You need a completely independent object
- Preventing unintended side effects
- Working with mutable objects

## 💡 Pro Tips
- Always be cautious with object references
- Understand the memory implications
- Choose the right copying method for your use case


