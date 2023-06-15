class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var odd:String = ""
        var even:String = ""

        num_list.forEach{
            if(it%2 == 0) even += it
            else odd += it
        }
        answer = even.toInt() + odd.toInt()
        
        return answer
    }
}