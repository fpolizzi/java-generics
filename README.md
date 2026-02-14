# Java Generics

### Purpose of generics
- introduced in Java 5 (1.5)
- to make code more error less
- avoid type casting errors
- to make code more readable, flexible and secure

### Naming convention
- **E** : Element (used extensively in Collections)
- **K** : Key (used in Map)
- **V** : Value (used in Map)
- **T** : Type
- **N** : Number

### Writing own Generics
```java
    public class Box<T> {

    private T type;

    public T get() {
        return type;
    }

    public void set(T type) {
        this.type = type;
    }
}
```
