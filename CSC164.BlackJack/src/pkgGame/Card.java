package pkgGame;

import pkgEnum.*;

public class Card {

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

}
