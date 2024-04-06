import Foundation

func solution(_ my_string:String, _ queries:[[Int]]) -> String {
    var newString = Array(my_string)    
    var result = ""

    for i in queries {
        for rvse in 0...(i[1]-i[0])/2 {
            newString.swapAt(i[0] + rvse, i[1] - rvse)
        }
    }
    
    for i in newString {
        result.append(i)
    }

    return result
}

