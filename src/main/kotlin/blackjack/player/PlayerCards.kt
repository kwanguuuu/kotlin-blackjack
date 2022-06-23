package blackjack.player

import blackjack.card.Card

class PlayerCards {
    private val _cards = mutableListOf<Card>()
    private val card: List<Card> get() = _cards.toList()

    fun add(card: Card) {
        _cards.add(card)
    }

    fun toList(): List<Card> {
        return card
    }

    fun getScore(): Int {
        return BlackjackScoreCalculator.getScore(card)
    }
}
