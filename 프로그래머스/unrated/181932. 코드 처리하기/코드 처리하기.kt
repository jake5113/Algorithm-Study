class Solution {
    fun solution(code: String): String {
        var answer: String = ""
        var mode: Int = -1
        
        code.forEachIndexed {i, v ->
            if(v == '1'){
                mode *= -1
            }
            else {
                if(mode == -1 && (i == 0 || i % 2 == 0)){
                    answer += v
                }
                else if(mode == 1 && i % 2 == 1) {
                    answer += v
                }
            }
        }
        
        if(answer == "") answer = "EMPTY"
               
        return answer
    }
}