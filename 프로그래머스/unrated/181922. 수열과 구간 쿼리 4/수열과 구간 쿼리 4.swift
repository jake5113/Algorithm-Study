import Foundation

func solution(_ arr:[Int], _ queries:[[Int]]) -> [Int] {
    var newArr = arr
    
    queries.forEach {
        for i in $0[0]...$0[1] {
            if i % $0[2] == 0 {
                newArr[i] += 1
            }
        }
    }
    
    return newArr
}