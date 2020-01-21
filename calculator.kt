import kotlin.math.abs 

class Calculator {
	
	private var _euclid: String = "Euclid -> "
	
	private var _sqrt: String = "Sqrt -> "

    fun euclid(x: Int, y: Int) {
 
             var r: Int
             var a: Int
             var b: Int
             a = x
             b = y

             while(b != 0) {

                  r = a % b
                  a = b
                  b = r  
             }

             println(_euclid + "(" + x + "," + y  + " ) = " + a)
    }  

    fun radical(x: Int) {
  
        var an: Double = (x / 2).toDouble()

        var anplus1: Double = (( an + x / an) / 2.0)

        var EPS: Double = 0.00001 

        while( abs(anplus1 - an ) >= EPS) {

               an = anplus1

               anplus1 = ((an + x / an ) / 2.0)
        }
   
             println(_sqrt + "("+ x +") = "+ anplus1)
    }

    fun PI() {

        var t1: Double = 1.0
 
        var t2: Double = 1.0 - 1.0 / 3.0
 
        var EPS: Double = 0.000001
 
        var r: Double
 
        var i: Int = 5
 
        var sign: Int = 1
 
        if(t1 > t2) r = t1 - t2
 
             else 
                    r = t2 - t1  
 
        while(4 * r >= EPS) {
 
          t1 = t2;
 
          t2 = t1 + sign * 1.0 / i
 
          i = i + 2
 
          sign = sign * (-1)         
 
          if(t1 > t2) r = t1 - t2
 
                    else 
 
                      r = t2 - t1    
 
        }
 
        println("PI ~ " + 4*t2)
    }

}

fun main(args: Array<String>) {
	
         val obj = Calculator()
             obj.euclid(100, 6)
             obj.radical(2)
             obj.PI()
}


