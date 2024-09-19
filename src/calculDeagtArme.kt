fun calculDegatArme(nbDes:Int,nbFace:Int,bonusquali:Int,activationcc:Int,multiplicateurcc:Int): Int {
    var result=lancerDes(nbDes,nbFace)
    if(result >= activationcc){
        result *= multiplicateurcc
    }else{
        result = result
    }
    result += bonusquali
    return result
}

fun main(){
    println(calculDegatArme(1,6,2,6,2))
}