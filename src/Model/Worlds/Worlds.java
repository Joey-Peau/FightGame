package Model.Worlds;

public class Worlds {

	// current World
	Worlds current;

	// lvl's Boundaries
	int levelInf, levelSup;

	/**
	 * Create the world in witch enemies will be between levelInf and levelSup
	 * 
	 * @param linf
	 *            minimal enemy level
	 * @param bsup
	 *            maximal enemy level
	 */
	public Worlds(int linf, int bsup) {
		levelInf = linf;
		levelSup = bsup;
	}

	public int getInf() {
		return levelInf;
	}

	public int getSup() {
		return levelSup;
	}

}
