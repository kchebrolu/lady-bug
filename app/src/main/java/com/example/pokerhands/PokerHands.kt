package com.example.pokerhands

class PokerHands {

    /**
     * @param playerA list of player A card values
     * @param playerB list of player B card values
     */
    fun getWinner(playerA: List<Int>, playerB: List<Int>): String {

        // Four of a kind
        // if check player same 4 type card
        if (checkFourOfaKind(playerA)) {
            return "Player A wins"
        }

        return "Invalid input"
    }

    private fun checkFourOfaKind(playerACards: List<Int>): Boolean {
        (1 until 13).forEach {
            playerACards.
        }

    }
}