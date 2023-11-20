fun euclid(x: Int, y: Int) : Int {
 
    var r: Int
    var a: Int = x
    var b: Int = y
 
    while(b!=0) {
 
         r = a % b
 
         a = b
 
         b = r
    }
 
    return a     
}
 
fun main(arr: Array<String>) {
 
	val a: Int = 155
	val b: Int = 20
 
	println(euclid(a, b))
}
