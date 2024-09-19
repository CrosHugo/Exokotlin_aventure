fun calculDefenseTotal(def: Int,type_armure:Int,qualité:Int):Int{
    val DefTotal= def+type_armure+qualité
    return DefTotal
}

fun main(){
    println(calculDefenseTotal(3,2,1))
}