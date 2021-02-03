import java.util.*


fun main(args:Array<String>)
{
    println("Please enter your birth year")
    var yob = readLine()!!.toInt()
    var currentYear = Calendar.getInstance().get(Calendar.YEAR)
    var age = currentYear - yob
    println("You are $age years old")
}