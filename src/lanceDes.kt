import kotlin.random.Random
fun lancerDes(nbDes:Int, nbFace: Int): Int {
    var somme = 0
    for(i in 1..nbDes){
        val resultat = Random.nextInt(1,nbFace + 1)
     somme+= resultat

    }
    return somme
}

fun main(){
    println(lancerDes(4,20))
}