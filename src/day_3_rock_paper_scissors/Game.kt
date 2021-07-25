package day_3_rock_paper_scissors

fun main() {
    val options = arrayOf("rock", "paper", "scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResults(userChoice, gameChoice)
}

fun getGameChoice(optionParam: Array<String>): String {
    return optionParam[(Math.random() * optionParam.size).toInt()]
}

fun getUserChoice(optionParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice) {
//        get input from user
        println("Please enter one of the following: ")
        for (item in optionParam) println(" $item.")
//        println(".")
        val userInput = readLine()
        // validating the input
        if (userInput != null && userInput in optionParam) {
            isValidChoice = true
            userChoice = userInput
        }
//        if the choice is invalid
        if (!isValidChoice) println("You must enter a valid choice")
    }
    return userChoice
}

fun printResults(userChoice: String, gameChoice: String) {
//    val result: String = if (userChoice == gameChoice) "Tie"

//    val result: String
//    if (userChoice == gameChoice) result = "Tie"
//    else if ((userChoice == "rock" && gameChoice == "scissors") ||
//        (userChoice == "paper" && gameChoice == "rock") ||
//        (userChoice == "scissors" && gameChoice == "paper")
//    ) result = "You win!"
//    else result = "You lose!"
//    println("You chose $userChoice. I chose $gameChoice. $result")

    val result: String = if (userChoice == gameChoice) "Tie"
    else if ((userChoice == "rock" && gameChoice == "scissors") ||
        (userChoice == "paper" && gameChoice == "rock") ||
        (userChoice == "scissors" && gameChoice == "paper")
    ) "You win!"
    else "You lose!"
    println("You chose $userChoice. I chose $gameChoice. $result")
}