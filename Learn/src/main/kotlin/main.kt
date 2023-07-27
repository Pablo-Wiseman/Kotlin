fun main() {
    var count = 700
    val food = if (count > 1000) {
       count -=200
        "pizza"
    } else if (count > 400) {
       count -=400
       "coffee"
    } else {
       "nothing"
    }

   println("I can take $food")

}