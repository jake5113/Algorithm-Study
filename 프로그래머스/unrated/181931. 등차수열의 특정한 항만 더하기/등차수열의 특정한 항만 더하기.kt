class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        included.forEachIndexed{ index, i ->
            if(i){
                answer += a + d*(index)
            }
        }
        return answer
    }
}