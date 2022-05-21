fun main(){
        println(calculateCharacters(listOf("b","a","a","a","a","b")))
}

fun calculateCharacters(list: List<String>): Any {
    var a = 0
    var b = 0
    // all Strings should be from one Character
    // all Characters should be either a or b
    // calculate percentage of a,b
    if (list.isEmpty()) {
        return -1
    }
    for (item in list) {
        if (item.length == 1) {
            when (item) {
                "a" -> {
                    a += 1
                }
                "b" -> {
                    b += 1
                }
                else -> return -1
            }
        } else {
            return -1
        }
    }
    if (a == 0){
        return 0
    }
    var result: Double = (a * 100).toDouble() / list.size.toDouble()
    return "%.1f".format(result).toDouble()
}