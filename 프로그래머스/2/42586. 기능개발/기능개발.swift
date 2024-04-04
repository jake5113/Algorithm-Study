import Foundation

func solution(_ progresses:[Int], _ speeds:[Int]) -> [Int] {
    var result: [Int] = []
    var pro = progresses
    var spd = speeds
    var count = 1
    
    while !pro.isEmpty {
        for i in 0..<pro.count {
            pro[i] += spd[i]
        }
        count = 1
        if pro[0] >= 100 {
            for i in 1..<pro.count {
                if pro[i] >= 100 {
                    count += 1
                    continue
                } else {
                    result.append(count)
                    break
                }
            }
            pro.removeSubrange(0..<count)
            spd.removeSubrange(0..<count)
        }
    }
    result.append(count)
    return result
}