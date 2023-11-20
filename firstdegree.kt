import kotlin.math.* // import the math library
 
fun main() {
var a: Double // declare a as a double variable
var b: Double // declare b as a double variable
var x: Double // declare x as a double variable
println("Enter the values of a and b: ") // prompt the user to enter the values of a and b
a = readLine()!!.toDouble() // read the value of a from the standard input and convert it to a double
b = readLine()!!.toDouble() // read the value of b from the standard input and convert it to a double
if (a == 0.0) // check if a is zero
{
if (b == 0.0) // check if b is also zero
{
println("The equation has infinitely many solutions.") // print a message
}
else // if b is not zero
{
println("The equation has no solution.") // print a message
}
}
else // if a is not zero
{
x = -b / a // solve for x using the formula
println("The solution of the equation is x = $x") // print the value of x
}
}
