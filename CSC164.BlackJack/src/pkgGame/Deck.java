package pkgGame;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eCardRank;
import pkgEnum.eCardSuit;
import pkgEnum.eExceptionType;
import pkgExceptions.DeckException;

public class Deck {

	private ArrayList<Card> cards = new ArrayList<Card>(60);
	private static int iNbrOfDecks = 1;

	public Deck() {
		this(iNbrOfDecks);
	}
	
	public Deck(int iNbrOfDecks) {
		for (int i = 0; i < iNbrOfDecks; i++) {
			for (eCardSuit Suit : eCardSuit.values())

			{
				for (eCardRank Rank : eCardRank.values()) {
					cards.add(new Card(Rank, Suit));
				}
			}
		}
		Collections.shuffle(cards);
	}


	
	public ArrayList<Card> getCards() {
		return cards;
	}

	public Card Draw() throws DeckException
	{
		if (cards.size() == 0)
		{
			throw new DeckException(eExceptionType.EmptyDeck, this);
		}
		
		return cards.remove(0);
	}
	
	
	
}
