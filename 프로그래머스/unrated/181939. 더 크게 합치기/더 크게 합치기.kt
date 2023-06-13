class Solution {
    fun solution(a: Int, b: Int): Int {
        var num1 = a.toString() + b.toString()
        var num2 = b.toString() + a.toString()
        
        return if((num1.toInt() - num2.toInt()) >= 0) num1.toInt() else num2.toInt()
    }
}