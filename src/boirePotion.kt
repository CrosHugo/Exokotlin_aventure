fun potion(nomcible: String,pvperso:Int, pvmax: Int,puissacepotion:Int): Int {
    val soin = pvperso + puissacepotion
    if (pvperso > pvmax){
        pvperso == pvmax
    }
    var diff= soin - pvperso
    println("$nomcible boit une potion et recupere $diff PV")
    return diff
}

fun main(){
    println(potion("Billy",8,20,6))
}