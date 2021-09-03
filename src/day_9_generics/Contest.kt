package day_9_generics

class Contest<T : Pet> (var vet :Vet<T>) {
    val scores: MutableMap<T, Int> = mutableMapOf()
    fun addScore(t: T, score: Int = 0) {
        if (score >= 0) scores.put(t, score)
//        if (score >= 0) scores[t] = score
    }

    fun getWInners(): MutableSet<T> {
        val highScore = scores.values.maxOrNull()
        val winners: MutableSet<T> = mutableSetOf()
        for ((t, score) in scores) {
            if (score == highScore) winners.add(t)
        }
        return winners
    }
}