import Foundation

func solution(_ my_string:String, _ index_list:[Int]) -> String {
    var result = ""
    index_list.forEach {
        result += String(my_string[my_string.index(my_string.startIndex, offsetBy: $0)])
    }
    return result
}