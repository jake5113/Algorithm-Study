func solution(_ a:Int, _ b:Int, _ c:Int, _ d:Int) -> Int {
    let nums = [a, b, c, d]
        
    if Set(nums).count == 4 {
        return nums.min()!
    }
    
    var count = [Int: Int]()
    
    for num in nums {
        count[num] = (count[num] ?? 0) + 1
    }
    
    if Set(nums).count == 1 {
        return nums.first! * 1111
    } else if Set(nums).count == 2 {
        if count.values.contains(3) {
            let p = count.first { $0.value == 3 }!.key
            let q = nums.first { $0 != p }!
            return (10 * p + q) * (10 * p + q)
        } else {
            let p = count.keys.first!
            let q = count.keys.dropFirst().first!
            return (p + q) * abs(p - q)
        }
    } else {
        let p = count.first { $0.value == 2 }!.key
        let q = nums.first { $0 != p }!
        let r = nums.first { $0 != p && $0 != q }!
        return q * r
    }
}