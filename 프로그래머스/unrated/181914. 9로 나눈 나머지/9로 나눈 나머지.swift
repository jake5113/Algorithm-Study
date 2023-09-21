import Foundation

func solution(_ number:String) -> Int {
    var arr = number.unicodeScalars.map(String.init)
    var sum = 0
    for i in arr{
        sum += Int(i)!
    }
    return sum % 9
}