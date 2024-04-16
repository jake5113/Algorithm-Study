import Foundation

func solution(_ my_strings:[String], _ parts:[[Int]]) -> String {
    var result = ""
    for i in 0..<my_strings.count {
        for j in parts[i][0]...parts[i][1] {
            result.append(Array(my_strings[i])[j])
        }
    }
    return result
}