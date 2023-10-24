class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        answer = arr
        queries.forEach {
            for (i in it[0]..it[1])
                if (i % it[2] == 0) answer[i] += 1
        }
        return answer
    }
}