package Aula12

import Aula10.Ferrari
import Aula2.Animal

fun main() {
    val ferrariF50 = Ferrari()
    val ferrariF40 = Ferrari()
    val ferrariF70 = Ferrari()

    ferrariF40.nome = "Ferrari Teslas"
    val ferrariF60 = ferrariF40

    println(ferrariF40.toString())


    val nome1 = "Renan Corredato"
    val nome2 = "renan corredato"

    val listaTeste = listOf("renan", "Cesar", "Pedro","Edu")
    println(listaTeste.asReversed())

    if (nome1 == nome2){
        println("São iguais")

    }else{
        println("São diferente")
    }

    println(ferrariF40.nome)
    println(ferrariF60.nome)

    ferrariF60.nome = "Ferrari Fiat"
    ferrariF60.motor = "730cv"
    ferrariF60.cor = "Preta"
    println(ferrariF60.toString())

    println(ferrariF40.nome)
    println(ferrariF60.nome)

   if (ferrariF40.equals(111111)){
       println("São iguais")
    }else{
        println("São diferente")
   }

   if (ferrariF40 == ferrariF70){
    println("São iguais")

        }else{
        println("São diferente")
        }
    println(ferrariF40.hashCode())
    println(ferrariF60.hashCode())

    val animal = Animal()
    println(animal.hashCode())
    println(animal.toString())

}