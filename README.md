coding dojo session - poker hands.

 POKER HANDS

Your job is to compare several pairs of poker hands and to indicate which, if either, has a higher rank.

Poker rules description

A poker deck contains 52 cards - each card also has a value which is one of 2, 3, 4, 5, 6, 7, 8, 9, 10, jack, queen, king, ace (denoted 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, and ace can be 1 or 14 depending on test case needs). 

A poker hand consists of 5 cards dealt from the deck. Poker hands are ranked by the following partial order from lowest to highest.

High Card: Hands which do not fit any higher category are ranked by the value of their highest card. If the highest cards have the same value, the hands are ranked by the next highest, and so on. Ex: 2,4,7,6,5
Pair: 2 of the 5 cards in the hand have the same value. Hands which both contain a pair are ranked by the value of the cards forming the pair. If these values are the same, the hands are ranked by the values of the cards not forming the pair, in decreasing order.
Ex: 2,2,4,5,3
Two Pairs: The hand contains 2 different pairs. Hands which both contain 2 pairs are ranked by the value of their highest pair. Hands with the same highest pair are ranked by the value of their other pair. If these values are the same the hands are ranked by the value of the remaining card. Ex:2,2,4,3,3
Three of a Kind: Three of the cards in the hand have the same value. Hands which both contain three of a kind are ranked by the value of the 3 cards. Ex:5,5,5,8,9
Straight: Hand contains 5 cards with consecutive values. Hands which both contain a straight are ranked by their highest card. Ex:8,9,10,11,12
Full House: 3 cards of the same value, with the remaining 2 cards forming a pair. Ranked by the value of the 3 cards. Ex:5,5,5,8,8
Four of a kind: 4 cards with the same value. Ranked by the value of the 4 cards. Ex:5,5,5,5,9


Expected output:
Player A Wins
Player B Wins
Tie
Invalid input
