class Solution {
    fun solution(n: Int, control: String): Int {
       var answer = n
        control.forEach{
            when(it){
                'w' -> answer += 1
                's' -> answer -= 1
                'd' -> answer += 10
                'a' -> answer -= 10
            }
        }
        
        return answer
    }
}