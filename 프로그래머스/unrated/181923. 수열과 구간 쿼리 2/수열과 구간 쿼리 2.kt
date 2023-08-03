import kotlin.math.min

class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
    var answer: MutableList<Int> = mutableListOf()
    queries.forEach {
        var samples = mutableListOf<Int>()
        for(i in it[0]..it[1]){
             if(arr[i] > it[2]) samples.add(arr[i])
        }
        if (samples.isEmpty()) answer.add(-1)
        else answer.add(samples.minOf { it })
    }
    return answer.toIntArray()
}
}