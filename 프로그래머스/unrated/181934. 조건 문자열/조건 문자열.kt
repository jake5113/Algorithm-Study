class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var answer: Int = 0
        
        if(eq == "=" && n==m) return 1
        
        when(ineq){
            "<" -> if(n < m) answer = 1
            ">" -> if(n > m) answer = 1
        }
        
        return answer
    }
}