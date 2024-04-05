func solution(_ n:Int) -> Int {
    var n01 = 0
    var n02 = 1

    for i in 0..<n {
        (n01, n02) = (n02 % 1234567, (n01 + n02) % 1234567)
    }
    var result = n01 % 1234567
    return result
}