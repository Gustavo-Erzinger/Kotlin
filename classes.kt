class Pessoa(val a: String, val b: Int){
    val c: Int = 15
}
fun main(){
    /*val p : Pessoa
    p = Pessoa("Gustavo",1234)
    Desta maneira estamos fazendo a declaração de uma variavel do tipo classe pessoa de forma explicita
    */
    val p = Pessoa("Gustavo",1234)
    print("ID: ${p.c}")
}