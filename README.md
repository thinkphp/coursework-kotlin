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

# Kotlin When

```
fun main() {
  val day = 4

  val result = when (day) {
    1 -> "Monday"
    2 -> "Tuesday"
    3 -> "Wednesday"
    4 -> "Thursday"
    5 -> "Friday"
    6 -> "Saturday"
    7 -> "Sunday"
    else -> "Invalid day."
  }
  println(result)
}
```

# Kotlin break/continue

```
var i = 0
while (i < 10) {
  println(i)
  i++
  if (i == 4) {
    break
  }
}

var i = 0
while (i < 10) {
  if (i == 4) {
    i++
    continue
  }
  println(i)
  i++
}
```

# Kotlin Strings

```

var txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
println("The length of the txt string is: " + txt.length)

var txt = "Please locate where 'locate' occurs!"
println(txt.indexOf("locate"))  // Outputs 7

var txt1 = "Hello World"
var txt2 = "Hello World"
println(txt1.compareTo(txt2))  // Outputs 0 (they are equal)

var firstName = "John"
var lastName = "Doe"
println(firstName + " " + lastName)

//templates
var firstName = "John"
var lastName = "Doe"
println("My name is $firstName $lastName")
```

## Examples

* https://ideone.com/N0rFMp (Calculator - euclid, sqrt, PI)
* https://ideone.com/cuBoe1 (Bubble Sort in Action)
* https://ideone.com/qAzN74 (Natural Logarithm)
  
