import Foundation

func solution(_ brown:Int, _ yellow:Int) -> [Int] {
   var result: [Int] = []
   var results: [Int] = []

    var sum = brown + yellow 
    
    (1...sum).forEach {
        if sum % $0 == 0 {
            result.append($0)
        }
    }
    
    for i in 0..<result.count {
        var firstI = result[i]
        var lastI = result[result.count - 1 - i]
        if firstI * lastI == sum && (firstI - 2) * (lastI - 2) == yellow {
            results.append(lastI)
            results.append(firstI)
            break
        }
    }
    
    return results
}

