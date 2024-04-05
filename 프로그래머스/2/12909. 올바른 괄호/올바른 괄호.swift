import Foundation

func solution(_ s:String) -> Bool {
    if s.first == ")" || s.last == "(" {
        return false
    }
    
    var arr = Array(s)
    var stack: [Character] = []
    
    for i in 0..<arr.count {
        if stack.last == "(" && arr[i] == ")" {
            stack.popLast()
            continue
        }
        stack.append(arr[i])
    }
    
    return stack.isEmpty
}

