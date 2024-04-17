import Foundation

func solution(_ my_string:String, _ n:Int) -> String {
    var result = ""
    let str = Array(my_string)
    for i in my_string.count - n..<my_string.count {
        result.append(str[i])
    }
    return result
}