fun attaquer(hp: Double,deftotal: Int,damagearme: Int,nomatq: String,nomcible:String): Double{
    var attaque = damagearme - deftotal
    if(attaque < 0 ){
        attaque = 0
    }else{
        attaque = attaque
    }
    var hp = hp - attaque
    println("$nomatq attaque $nomcible pour $attaque point de dégâts")
    return hp
}

fun main(){
    println(attaquer(15.0,3,4,"Billyboy","BobJones"))

}