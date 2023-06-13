class Solution {
    fun solution(str1: String, str2: String): String {
        var answer: String = ""
        val s1 = str1.split("")
        val s2 = str2.split("")
        
        for(i in 1..str1.length){
            answer += s1[i]+s2[i]
        }
        
        return answer
    }
}