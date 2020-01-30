package com.example.pokerhands

import junit.framework.Assert.assertEquals
import junitparams.JUnitParamsRunner
import junitparams.Parameters
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(JUnitParamsRunner::class)
class PokerHandsTest {

    @Test
    @Parameters(method = "getInput")
    fun `test my input`(
        message: String,
        expected: String,
        playerAValues: List<Int>,
        playerBValues: List<Int>
    ) {

        val pokerHands = PokerHands()
        val actualResult = pokerHands.getWinner(playerAValues, playerBValues)

        assertEquals(message, expected, actualResult)
    }

    fun getInput() = arrayOf(
        arrayOf(
            "Less than 5 values for player A or Player B", "Invalid input",
            listOf(2, 3, 4, 5), listOf(7, 8, 9, 10)
        ),
        arrayOf(
            "High card with player B", "Player B wins",
            listOf(2, 3, 4, 5, 6), listOf(7, 8, 9, 10, 11)
        )
    )
}