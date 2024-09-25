# Introduction to Kotlin Programming
## Stanford University Coursework

### Lesson 1: Kotlin Basics and Variables

#### 1.1 Hello, World!
Let's start with the traditional "Hello, World!" program:

```kotlin
fun main() {
    println("Hello, World!")
}
```

This simple program introduces the `main()` function, which is the entry point of every Kotlin program, and the `println()` function for output.

#### 1.2 Variables and Data Types
Kotlin uses type inference but also allows explicit type declarations:

```kotlin
val name: String = "Alice"  // Immutable (read-only) variable
var age = 30  // Mutable variable, type inferred as Int
const val PI = 3.14159  // Compile-time constant

println("$name is $age years old")
```

Key concepts:
- `val`: Read-only variable (immutable)
- `var`: Mutable variable
- `const val`: Compile-time constant
- String templates: `$variableName` or `${expression}`

### Lesson 2: Control Flow

#### 2.1 Conditional Statements
Kotlin provides standard if-else statements and a powerful when expression:

```kotlin
val grade = 85

if (grade >= 90) {
    println("A")
} else if (grade >= 80) {
    println("B")
} else {
    println("C or below")
}

when (grade) {
    in 90..100 -> println("Excellent")
    in 80..89 -> println("Good")
    in 70..79 -> println("Average")
    else -> println("Needs Improvement")
}
```

#### 2.2 Loops
Kotlin offers for and while loops, with some enhancements:

```kotlin
// For loop
for (i in 1..5) {
    print("$i ")
}
println()

// While loop
var counter = 0
while (counter < 5) {
    print("${counter++} ")
}
println()

// For loop with step and downTo
for (i in 10 downTo 0 step 2) {
    print("$i ")
}
println()
```

### Lesson 3: Functions

#### 3.1 Function Basics
Functions in Kotlin are declared using the `fun` keyword:

```kotlin
fun greet(name: String): String {
    return "Hello, $name!"
}

println(greet("Stanford"))

// Single-expression function
fun square(x: Int) = x * x

println("Square of 5 is ${square(5)}")
```

#### 3.2 Default and Named Arguments
Kotlin supports default and named arguments:

```kotlin
fun createUser(name: String, age: Int = 18, isStudent: Boolean = true) {
    println("User: $name, Age: $age, Student: $isStudent")
}

createUser("Bob")
createUser("Alice", 22)
createUser("Charlie", isStudent = false)
```

### Lesson 4: Collections

#### 4.1 Lists
Kotlin provides immutable (List) and mutable (MutableList) lists:

```kotlin
val readOnlyList = listOf(1, 2, 3, 4, 5)
val mutableList = mutableListOf(1, 2, 3)

println(readOnlyList)
mutableList.add(4)
println(mutableList)
```

#### 4.2 Maps
Similarly, Kotlin has immutable and mutable maps:

```kotlin
val readOnlyMap = mapOf("a" to 1, "b" to 2, "c" to 3)
val mutableMap = mutableMapOf("x" to 10, "y" to 20)

println(readOnlyMap)
mutableMap["z"] = 30
println(mutableMap)
```

### Lesson 5: Object-Oriented Programming

#### 5.1 Classes and Objects
Kotlin makes creating classes and objects straightforward:

```kotlin
class Person(val name: String, var age: Int) {
    fun introduce() = "Hi, I'm $name and I'm $age years old"
}

val alice = Person("Alice", 30)
println(alice.introduce())
```

#### 5.2 Inheritance
Kotlin classes are final by default. Use `open` to allow inheritance:

```kotlin
open class Animal(val name: String) {
    open fun makeSound() = "The animal makes a sound"
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() = "The dog barks"
}

val animal = Animal("Generic Animal")
val dog = Dog("Buddy")

println(animal.makeSound())
println(dog.makeSound())
```

This coursework provides a foundation in Kotlin programming, covering key concepts with practical examples. Students should practice these concepts and explore Kotlin's extensive standard library for more advanced features.

# Essential Kotlin language

```
kotlinc-jvm filename.kt
kotlin filenameKt
```

- Kotlin is modern, trending programming langauge
- Kotlin is easy to learn, especially if you already know Java (it is 100% compatible with Java).
- Kotlin is used to develop Android apps, server side apps, and much more.

## Variables
```
fun main() {
  var name = "John" // String
  val birthyear = 1975 // Int
  println(name)
  println(birthyear) 
}
//When you create a variable with the val keyword, the value cannot be changed/reassigned.
//When using var, you can change the value whenever you want:

val firstName = "John "
val lastName = "Doe"
val fullName = firstName + lastName
println(fullName)
```

## Kotlin Data Types

```
val myNum: Int = 5                // Int
val myDoubleNum: Double = 5.99    // Double
val myLetter: Char = 'D'          // Char
val myBoolean: Boolean = true     // Boolean
val myText: String = "Hello"      // String
```

## If/Else Control Flow

```
val time = 22
if (time < 10) {
  println("Good morning.")
} else if (time < 20) {
  println("Good day.")
} else {
  println("Good evening.")
}
// Outputs "Good evening."


fun main() {
  val time = 20
  val greeting = if (time < 18) "Good day." else "Good evening."
  println(greeting)
}
```

## Ranges

```
for (chars in 'a'..'x') {
  println(chars)
}

for (nums in 5..15) {
  println(nums)
}

val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
if ("Volvo" in cars) {
  println("It exists!")
} else {
  println("It does not exist.")
} 

for (nums in 5..15) {
  if (nums == 10) {
    break
  }
  println(nums)
} 
```

## Loops Control Flow

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

## Kotlin When Control Flow

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

## break/continue Control Flow

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

## Arrays

```
val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
cars[0] = "Opel"
println(cars[0])
// Now outputs Opel instead of Volvo
```


## Strings

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

## Collections - Map

A map is a collection of key/value pairs, where each key is unique and is used to retrieve the corresponding value. For creating maps, there are functions mapOf() and mutableMapOf(). Using the to infix function makes initialization less noisy. A read-only view of a mutable map can be obtained by casting it to Map.

```
const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)   // 1
val EZPassReport: Map<Int, Int> = EZPassAccounts                                        // 2

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {                                        // 3
        println("Updating $accountId...")                                               
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS  // 4
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    } 
}

fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach {                                                              // 5
        k, v -> println("ID $k: credit $v")
    }
}

fun main() {
    accountsReport()                                                                    // 6
    updatePointsCredit(1)                                                               // 7
    updatePointsCredit(1)                                                               
    updatePointsCredit(5)                                                               // 8 
    accountsReport()                                                                    // 9
}

EZ-Pass report:
ID 1: credit 100
ID 2: credit 100
ID 3: credit 100
Updating 1...
Updating 1...
Error: Trying to update a non-existing account (id: 5)
EZ-Pass report:
ID 1: credit 130
ID 2: credit 100
ID 3: credit 100

1. Creates a mutable Map.
2. Creates a read-only view of the Map.
3. Checks if the Map's key exists.
4. Reads the corresponding value and increments it with a constant value.
5. Iterates immutable Map and prints key/value pairs.
6. Reads the account points balance, before updates.
7. Updates an existing account two times.
8. Tries to update a non-existing account: prints an error message.
9. Reads the account points balance, after updates.

```

## Collections - Zip

zip function merges two given collections into a new collection. By default, the result collection contains Pairs of source collection elements with the same index. However, you can define your own structure of the result collection element.

The size of the result collection equals to the minimum size of a source collection.

```
val A = listOf("a", "b", "c")                  // 1
val B = listOf(1, 2, 3, 4)                     // 1

val resultPairs = A zip B                      // 2
val resultReduce = A.zip(B) { a, b -> "$a$b" } // 3

A to B: [(a, 1), (b, 2), (c, 3)]
$A$B: [a1, b2, c3]

1. Defines two collections.
2. Merges them into a list of pairs. The infix notation is used here.
3. Merges them into a list of String values by the given transformation.

```

## Partition

The partition function splits the original collection into a pair of lists using a given predicate:
1. Elements for which the predicate is true.
2. Elements for which the predicate is false.
```
val numbers = listOf(1, -2, 3, -4, 5, -6)                 // 1
val evenOdd = numbers.partition { it % 2 == 0 }           // 2
val (positives, negatives) = numbers.partition { it > 0 } // 3
Numbers: [1, -2, 3, -4, 5, -6]
Even numbers: [-2, -4, -6]
Odd numbers: [1, 3, 5]
Positive numbers: [1, 3, 5]
Negative numbers: [-2, -4, -6]

1. Defines a collection of numbers.
2. Splits numbers into a Pair of lists with even and odd numbers.
3. Splits numbers into two lists with positive and negative numbers. Pair destructuring is applied here to get the Pair members.
```

## Collections - Lists

A list is an ordered collection of items. In Kotlin, lists can be either mutable (MutableList) or read-only (List). For list creation, use the standard library functions listOf() for read-only lists and mutableListOf() for mutable lists. To prevent unwanted modifications, obtain read-only views of mutable lists by casting them to List.

```
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)        // 1
val sudoers: List<Int> = systemUsers                              // 2

fun addSystemUser(newUser: Int) {                                 // 3
    systemUsers.add(newUser)                      
}

fun getSysSudoers(): List<Int> {                                  // 4
    return sudoers
}

fun main() {
    addSystemUser(4)                                              // 5 
    println("Tot sudoers: ${getSysSudoers().size}")               // 6
    getSysSudoers().forEach {                                     // 7
        i -> println("Some useful info on user $i")
    }
    // getSysSudoers().add(5) <- Error!                           // 8
}

1. Creates a MutableList.
2. Creates a read-only view of the list.
3. Adds a new item to the MutableList.
4. A function that returns an immutable List.
5. Updates the MutableList. All related read-only views are updated as well since they point to the same object.
6. Retrieves the size of the read-only list.
7. Iterates the list and prints its elements.
8. Attempting to write to the read-only view causes a compilation error.

```


## Object-Oriented Programming

```
// Create a c1 object of the Car class
val c1 = Car()

// Access the properties and add some values to it
c1.brand = "Ford"
c1.model = "Mustang"
c1.year = 1969

println(c1.brand)   // Outputs Ford
println(c1.model)   // Outputs Mustang
println(c1.year)    // Outputs 1969

val c1 = Car()
c1.brand = "Ford"
c1.model = "Mustang"
c1.year = 1969

val c2 = Car()
c2.brand = "BMW"
c2.model = "X5"
c2.year = 1999

println(c1.brand)  // Ford
println(c2.brand)  // BMW
```

```
import java.util.*

class Student(var name: String, var surname: String, var year: Int) {
  // Class function
  fun gender(gen: String) {
    println("GEnder: "+ gen)
  }
  
  fun hobby(passion: String) {
    println("Passion: "+ passion)
  }
}
 
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val student1 = Student("Ann", "May", 1969)
    val student2 = Student("Adrian", "Statescu",2969)
    // Call the function
    println(student1.name)
    student1.gender("female")
    student1.hobby("football")
    println(student2.name)
    student2.gender("male")
    student2.hobby("basketball")
}
```
https://ideone.com/2Q1tQd

# Constructor class

```
class Car(var brand: String, var model: String, var year: Int)

fun main() {
  val c1 = Car("Ford", "Mustang", 1969)
  val c2 = Car("BMW", "X5", 1999)
  val c3 = Car("Tesla", "Model S", 2020)
}
```

# Inheritance

```
// Superclass
open class MyParentClass {
  val x = 5
}

// Subclass
class MyChildClass: MyParentClass() {
  fun myFunction() {
    println(x) // x is now inherited from the superclass
  }
}

// Create an object of MyChildClass and call myFunction
fun main() {
  val myObj = MyChildClass()
  myObj.myFunction()
} 
```

## Delegation Pattern

Kotlin supports easy implementation of the delegation pattern on the native level without any boilerplate code.

```
interface SoundBehavior {                                                          // 1
    fun makeSound()
}

class ScreamBehavior(val n:String): SoundBehavior {                                // 2
    override fun makeSound() = println("${n.uppercase()} !!!")
}

class RockAndRollBehavior(val n:String): SoundBehavior {                           // 2
    override fun makeSound() = println("I'm The King of Rock 'N' Roll: $n")
}

// Tom Araya is the "singer" of Slayer
class TomAraya(n:String): SoundBehavior by ScreamBehavior(n)                       // 3

// You should know ;)
class ElvisPresley(n:String): SoundBehavior by RockAndRollBehavior(n)              // 3

fun main() {
    val tomAraya = TomAraya("Thrash Metal")
    tomAraya.makeSound()                                                           // 4
    val elvisPresley = ElvisPresley("Dancin' to the Jailhouse Rock.")
    elvisPresley.makeSound()
}

1. Defines the interface SoundBehavior with one method.
2. The classes ScreamBehavior and RockAndRollBehavior implement the interface and contain their own implementations of the method.
3. The classes TomAraya and ElvisPresley also implement the interface, but not the method. Instead, they delegate the method calls to the responsible implementation. The delegate object is defined after the by keyword. As you see, no boilerplate code is required.
4. When makeSound() is called on tomAraya of type TomAraya or elvisPresley of type ElvisPresley, the call is delegated to the corresponding delegate object.

```

## Examples:

* https://ideone.com/N0rFMp (Calculator - euclid, sqrt, PI)
* https://ideone.com/cuBoe1 (Bubble Sort in Action)
* https://ideone.com/qAzN74 (Natural Logarithm)
* https://ideone.com/u0ecO3 First Degree Equation
* https://ideone.com/shmGW6 Quadratic Equation
* https://ideone.com/u3F7wV Basic Calculator

## Codeforces Kotlin Heroes

* https://codeforces.com/contest/1570
* https://codeforces.com/contest/1910

## References:

* https://kotlinlang.org/docs/kotlin-tour-welcome.html
* https://www.w3schools.com/KOTLIN/index.php
* https://www.programming-books.io/essential/kotlin/
* https://www.programiz.com/kotlin-programming/examples
  
