class Solution {
    fun solution(number: String): Int {
        var sum = 0
        number.forEach {
            sum += it.digitToInt()
        }
        return sum % 9
    }
}