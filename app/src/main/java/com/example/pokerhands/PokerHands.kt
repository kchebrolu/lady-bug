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

        return when {
            playerOne.first > playerTwo.first -> {
                "Player A wins"
            }
            playerOne.first < playerTwo.first -> {
                "Player B wins"
            }
            else -> {
                //Tie breakers
                when (playerOne.first) {
                    7 -> tieBreakerFourOfKind(playerOne, playerTwo)
                    6 -> tieBreakerFullHouse(playerOne, playerTwo)
                    else -> ""
                }
            }
        }
    }

    private fun tieBreakerFullHouse(playerOne: Pair<Int, Int>, playerTwo: Pair<Int, Int>): String {
        return "Invalid input"
    }

    private fun tieBreakerFourOfKind(playerOne: Pair<Int, Int>, playerTwo: Pair<Int, Int>): String {
        when {
            playerOne.second > playerTwo.second -> {
                return "Player A wins"
            }
            playerOne.second < playerTwo.second -> {
                return "Player B wins"
            }
            playerOne.second == playerTwo.second -> {
                return if (playerOne.second > playerTwo.second) {
                    "Player A wins"
                } else {
                    "Player B wins"
                }
            }
            else -> return "Invalid input"
        }
    }


    private fun checkValidInput(playerA: List<Int>, playerB: List<Int>): Boolean {
        if (playerA.size == 5 && playerB.size == 5) {
            return true
        }
        return false
    }

    private fun checkFullHouse(playerCards: List<Int>): Pair<Int, Int> {//6
        val groupMap = playerCards.groupBy { it }//.keys
        for (groupSize in groupMap) {
            if (groupSize.value.size == 3) {
                for (groupSize2 in groupMap) {
                    if (groupSize2.value.size == 2) {
                            return Pair(6, groupSize.key)//
                    }
                }
            }
        }
        return Pair(-1, -1)

    }

    private fun checkFourOfaKind(playerCards: List<Int>): Pair<Int, Int> {//7
        val groupMap = playerCards.groupBy { it }//.keys

        for (groupSize in groupMap) {
            if (groupSize.value.size > 3) {
                return Pair(7, groupSize.key)
            }
        }
        return Pair(-1, -1)
    }

    // 7 = four
    // 6 = full house
}