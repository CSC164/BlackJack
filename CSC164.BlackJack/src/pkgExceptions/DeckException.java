package pkgExceptions;

import pkgEnum.*;
import pkgGame.Deck;

public class DeckException extends Exception {

	private eExceptionType eExceptionType;
	private Deck d;
	
	public DeckException(eExceptionType eType, Deck d)
	{
		this.eExceptionType = eType;
		this.d = d;
	}

	public eExceptionType geteExceptionType() {
		return eExceptionType;
	}

	public Deck getD() {
		return d;
	}
	
	
	
}
