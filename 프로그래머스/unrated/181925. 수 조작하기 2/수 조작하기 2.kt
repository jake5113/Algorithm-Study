class Solution {
    fun solution(numLog: IntArray): String {
        var answer: String = ""
        var beforeNum: Int = numLog[0]
        
        for(i in 1 until numLog.size){
            var code = numLog[i] - beforeNum
            beforeNum = numLog[i]
            
            when(code){
                1 -> answer+="w"
                -1 -> answer+="s"
                10 -> answer+="d"
                -10 ->answer+="a"
            }
        }
        
        return answer
    }
}