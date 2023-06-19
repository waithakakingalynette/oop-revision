fun main() {
    var human=Human("Ityau",23,54)
    human.eat(3)
   println( human.weight)
    var speech="Tomorrow is Thursday"
    println(speech)
    var birthday= human.age++
   println( human.age++)
    var Lynette=fields("Lynette","Warukira","lynnw@gmail.com",759826104,"lynn")
    println( Lynette.firstname)
    println(Lynette.lastname)
    println(  Lynette.password)
}

//1. Create a class called Human with these attributes: name, age, weight. It has
////the following functions:
////- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
////and increments the human’s weight by the weight of the food eaten
////- speak(speech: String) :Prints the string passed to it
////- birthday( ) :Increments the human’s age by 1
////Create an instance of this human class and invoke all its functions
class Human(var name:String, var age:Int, var weight:Int){

    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
        weight+=foodWeight
    }
    fun speak(speech:String){

    }
    fun birthday(){

    }
}

//2. Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes
data class fields(var firstname:String, var lastname:String, var email:String, var phonenumber:Int, var password:String){

}
