package pkgGame;

import java.util.Comparator;
import java.util.Objects;

import pkgEnum.*;

public class Card implements Comparable {

	private eCardSuit eCardSuit;
	private eCardRank eCardRank;

	public Card(pkgEnum.eCardSuit eCardSuit, pkgEnum.eCardRank eCardRank) {
		super();
		this.eCardSuit = eCardSuit;
		this.eCardRank = eCardRank;
	}

	public Card(pkgEnum.eCardRank eCardRank, pkgEnum.eCardSuit eCardSuit) {
		super();
		this.eCardSuit = eCardSuit;
		this.eCardRank = eCardRank;
	}

	public eCardSuit geteCardSuit() {
		return eCardSuit;
	}

	public eCardRank geteCardRank() {
		return eCardRank;
	}

	@Override
	public String toString() {
		return this.geteCardRank() + " " + this.geteCardSuit();

	}

	@Override
	public int hashCode() {
		return Objects.hash(this.geteCardRank(), this.geteCardSuit());
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Card))
			return false;

		Card c = (Card) obj;

		if (c.hashCode() == this.hashCode()) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Object arg0) {

		if (!(arg0 instanceof Card))
			return 0;

		Card c1 = (Card) arg0;


		if (!(c1.geteCardSuit().ordinal() == this.geteCardSuit().ordinal())) {
			return (this.geteCardSuit().ordinal() - c1.geteCardSuit().ordinal());
		}
		
		if (!(c1.geteCardRank().ordinal() == this.geteCardRank().ordinal())) {
			return (this.geteCardRank().ordinal() -c1.geteCardRank().ordinal());
		}
		

		return 0;
	}
		 
}
