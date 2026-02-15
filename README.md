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

### Bounded Type Parameter

Type parameters can be bounded to restrict the types that can be used 
as arguments for a generic class or method. This is useful when you 
want to ensure that certain operations are only performed on compatible types.

```java
static <T extends Comparable<T>> int countGreaterThan(T[] numbers, T number) {

    int count = 0;

    for (T n : numbers) {

        if (n.compareTo(number) > 0) {
            count++;
        }
    }

    return count;
}
```
In the above example, the `countGreaterThan` method is bounded to types that 
implement the `Comparable` interface. This ensures that the comparison 
operation is valid for the given types.
Only types that implement the `Comparable` interface can be used as arguments 
for this method.

It is also possible to use more than one interface in the bound.
For example, you can bound a type parameter to both `Comparable` and `Serializable` 
interfaces.
This ensures that the type is both comparable and serializable.
In addition, it is possible to use a class as a bound. This ensures that the type
is a subclass of the given class.
Even so, you can use a class and multiple interfaces in the bound. As in normal
inheritance, the class takes precedence over the interfaces, and only one class 
bound can be used, but multiple interfaces can be used.
If a class is bound, this must stand in the first place.