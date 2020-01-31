package com.example.pokerhands

class PokerHands {

    /**
     * @param playerA list of player A card values
     * @param playerB list of player B card values
     */
    fun getWinner(playerA: List<Int>, playerB: List<Int>): String {

        if (!checkValidInput(playerA, playerB)) {
            return "Invalid input"
        }
        // Four of a kind
        // if check player same 4 type card
        val playerOne = checkFourOfaKind(playerA)
        val playerTwo = checkFourOfaKind(playerB)

        if (playerOne!!.second > playerTwo!!.second) {
            return "Player A wins"
        } else if (playerOne.second < playerTwo.second) {
            return "Player B wins"
        } else if (playerOne.second == playerTwo.second) {

            if (playerOne.second > playerTwo.second) {
                return "Player A wins"
            } else if (playerOne.second < playerTwo.second) {
                return "Player B wins"
            }
            return "Player A wins"
        }

        return "Invalid input"
    }

    private fun checkValidInput(playerA: List<Int>, playerB: List<Int>): Boolean {
        if (playerA.size == 5 && playerB.size == 5) {
            return true
        }
        return false
    }

    private fun checkFourOfaKind(playerCards: List<Int>): Pair<Int, Int>? {//7
        val count = playerCards.groupBy { it }.keys.max() ?: 0

        if (count > 3) {
            return Pair(7, playerCards.groupBy { it }[count]?.get(0) ?: 0)
        }
        return null
    }

    // 7 = four
}