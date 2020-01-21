fun bubblesort(arr: Array<Int>) : Array<Int> {
	       
    var finished: Int = 0

    var swapped: Int   

    var size: Int = arr.size - 1    

    while( finished  == 0 ) {

           swapped = 0

           for(i in 0..size-1) {

               if(arr[i] > arr[i+1]) {

                     val holder: Int = arr[i]

                         arr[i] = arr[i+1]

                         arr[i+1] = holder
                         
                         swapped = 1     
               }  
           }

           if(swapped == 1) size = size - 1

                   else 
                            finished = 1 

    }  

    return arr
}

fun main(args: Array<String>) {

    var integers = arrayOf(9,8,7,6,5,4,3,2,1)  	

    println(integers.joinToString(" "))

    integers = bubblesort(integers)

    println(integers.joinToString(" "))
}

