package io.github.guilhermedelemos;

import io.github.guilhermedelemos.blackjack.Card;
import io.github.guilhermedelemos.blackjack.Deck;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {

    @Test void drawTest() {
        Deck deck = new Deck();
        Card card = deck.draw();
        assertNotNull(card);
    }

    @Test void cardsLeft() {
        Deck deck = new Deck();
        int amount = deck.cardsLeft();
        deck.draw();
        assertTrue(deck.cardsLeft() < amount);
    }

    @Test void cardsDiscarded() {
        Deck deck = new Deck();
        int amount = deck.cardsDiscarded();
        deck.draw();
        assertTrue(deck.cardsDiscarded() > amount);
    }

    //testa o metodo de embaralhar
    @Test void shuffle(){
        Deck deck = new Deck();
        List<Card> baralhoInicial = deck.listCards();
        String rank1 = baralhoInicial.get(1).getRank();

        deck.shuffle(baralhoInicial);
        List<Card> baralhoEmbaralhado = deck.listCards();
        String rank2 = baralhoEmbaralhado.get(1).getRank();

        assertNotEquals(rank1, rank2);



    }

}
