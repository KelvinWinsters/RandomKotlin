package day_3_small_games

import java.lang.Integer.parseInt
import kotlin.random.Random

/*
*get user input, check whether it's an integer, get machine input between a certain range check if the guess is correct
*/
fun main() {
    println("The Game has Started")
    val userInput = getUserInput()
    val computerInput = getComputerGuess()
    printGameResults(userInput, computerInput)
}

fun getUserInput(): Int {
    println("Enter a number between 1 and 5")
    val userNumber: Int = parseInt(readLine())
    return userNumber
}

fun getComputerGuess(): Int {
    val number = Random.nextInt(5)
    return number
}

fun printGameResults(userInput: Int, computerInput: Int) {
    println("User input is $userInput")
    println("Computer guessed is $computerInput")
    if (userInput == computerInput) {
        println("Correct")
    } else {
        println("Wrong")
    }
}


