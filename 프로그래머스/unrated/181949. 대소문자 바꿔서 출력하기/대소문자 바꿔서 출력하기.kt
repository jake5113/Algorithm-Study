fun main(args: Array<String>) {
    val s1 = readLine()!!
    var s2 = ""
    s1.forEach{
        s2 += if(it.isUpperCase()) it.toLowerCase() else it.toUpperCase()
    }
    print(s2)
}