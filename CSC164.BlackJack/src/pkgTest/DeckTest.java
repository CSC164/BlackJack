package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import pkgEnum.eCardRank;
import pkgEnum.eCardSuit;
import pkgGame.Card;
import pkgGame.Deck;

class DeckTest {

	
	void DeckTest1() {

		Deck d = new Deck();

		for (Card c : d.getCards()) {
			System.out.println(c.toString());

		}
	}
	
	@Test 
	void DeckTest2()
	{
		
		Deck d = new Deck();
		
		Collections.sort(d.getCards());
			
		
		for (Card c : d.getCards()) {
			System.out.println(c.toString());

		}
		
	}
	
	@Test 
	void DeckTest3()
	{
		Deck d = new Deck();
		Card c = new Card(eCardSuit.HEART, eCardRank.ACE);
		
		if (!(d.getCards().contains(c)))
		{
			fail("Ace of Hearts not in deck");
		}
		
		
		ArrayList<Card> Hearts = new ArrayList<Card>();

		Hearts = (ArrayList<Card>) d.getCards().stream().
				filter(x -> x.geteCardSuit() 
				== eCardSuit.HEART).filter(y -> y.geteCardRank() 
						== eCardRank.ACE)
				.collect(Collectors.toList());
		
		
		
		
		
	}

}
