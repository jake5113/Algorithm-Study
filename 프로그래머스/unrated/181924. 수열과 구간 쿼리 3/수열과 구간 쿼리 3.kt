import java.util.*

class Solution {
  fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
    var answer = arr.toMutableList()
    for (index in 0..queries.size-1){
        Collections.swap(answer, queries[index][0], queries[index][1])
    }
    return answer.toIntArray()
}

}