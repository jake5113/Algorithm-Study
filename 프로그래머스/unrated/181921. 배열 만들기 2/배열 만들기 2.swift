import Foundation

func solution(_ l:Int, _ r:Int) -> [Int] {
    var arr = [Int]()
    var set = Set<Character>()
    for i in (l...r) {
        set = []
        String(i).forEach {
            set.insert($0)
        }
        
        if set == ["0"] ||  set == ["5"] ||  set == ["0", "5"] {
            arr.append(i)
        }
        
    }
    
       if (arr.isEmpty) {
        return [-1]
    }
    

    return arr
}