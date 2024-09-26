package com.example.kotlin_039

fun main(){


     val sumaResult = calculate(20, 30,:: suma)
    val multiplica = calculate(8,9) {a,b -> a * b}

    println("sumResul $sumaResult, multiplica $multiplica")


}


fun calculate ( x :Int, y :Int, operation : (Int,Int) -> Int): Int{
    return operation( x,y)

}

fun suma ( x:Int, y:Int) = x + y

fun multiplicar( x:Int, y:Int) = x * y











































/*
// Clase padre :Animal

open class Animal ( val nombre: String , val sonido: String) {

    //  funcion que emite sonido
    open fun hacerSonido() {

        println("$nombre  hace: $sonido")
    }
}

    // clase hija : Perro ( hereda de animal)

    class  Perro( nombre : String ): Animal( nombre, "Guau"){


        //sobreescribir el método para un comportamiento especifico
        override fun hacerSonido() {
            //super.hacerSonido()
            println("$nombre ladra fuerte $sonido")
        }

        // función mover la cola

        fun moverLaCola(){

            println("$nombre esta moviendo la cola felizmente por el 18")
        }

    }


// clase Gato

       class Gato( nombre:String): Animal ( nombre, "MIAUWW"){

           override fun hacerSonido() {
              // super.hacerSonido()
               println("$nombre maulla suavemente : $sonido ")
           }

           // funcion especifica del gato

           fun emiteSonido(){
               println("$nombre esta ronroneando")
           }







       }
*/



