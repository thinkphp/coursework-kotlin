import java.util.Scanner
 
fun main() {
    val scanner = Scanner(System.`in`)
 
    val t = scanner.nextInt()
    val soln = Solution()
 
    for (i in 0 until t) {
        val s = scanner.next()
        println(soln.foo(s))
    }
}
 
class Solution {
    fun foo(s: String): String {
        val n = s.length
        var track = 0
        var res = ""
 
        for (i in n - 1 downTo 0) {
            if (s[i] in 'a'..'z') {
                track = i
                break
            }
        }
 
        for (i in 0 until n) {
            if (i <= track) {
                res += s[i]
                continue
            }
            if (s[i] == '0') {
                res += s[i]
                continue
            }
            break
        }
 
        return res
    }
}
