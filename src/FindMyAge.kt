import java.util.*

fun main(args: Array<String>){

    //input
    print ("enter your DOB: ")
    var DOB:Int=readLine()!!.toInt()
    19
    //process

    var year= Calendar.getInstance().get(Calendar.YEAR)
    var age:Int?
    age =year-DOB

    //output

    println("Your age is $age years")
}