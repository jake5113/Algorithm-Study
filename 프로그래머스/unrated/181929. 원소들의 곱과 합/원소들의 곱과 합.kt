class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var sumNum:Int = 0
        var mulNum:Int = 1
        
        num_list.forEach{
            sumNum += it
            mulNum *= it
        }
        
        if(sumNum*sumNum > mulNum) answer = 1 else answer = 0
        
        return answer
    }
}