# Introduction to Kotlin language

- Kotlin is modern, trending programming langauge
- Kotlin is easy to learn, especially if you already know Java (it is 100% compatible with Java).
- Kotlin is used to develop Android apps, server side apps, and much more.


# Kotlin Data Types

```
val myNum: Int = 5                // Int
val myDoubleNum: Double = 5.99    // Double
val myLetter: Char = 'D'          // Char
val myBoolean: Boolean = true     // Boolean
val myText: String = "Hello"      // String
```

# Kotlin Arrays

```
val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
cars[0] = "Opel"
println(cars[0])
// Now outputs Opel instead of Volvo
```

# Kotlin Loops

```
val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
for (x in cars) {
  println(x)
}

val cars2 = arrayOf("Volvo", "BMW", "Ford", "Mazda")
for (x in cars2.reversed()) {
  println(x)
}
```

## Examples

* https://ideone.com/N0rFMp (Calculator - euclid, sqrt, PI)
* https://ideone.com/cuBoe1 (Bubble Sort in Action)
* https://ideone.com/qAzN74 (Natural Logarithm) 
