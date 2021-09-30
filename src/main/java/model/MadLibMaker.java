/**
 * @author alexanderpontier - ampontier1
 * CIS175 - Spring 2021
 * Sep 23, 2021
 */
package model;

/**
 * @author alexanderpontier
 *
 */
public class MadLibMaker {
	
	//Initializing variables
	private String noun;
	private String verb;
	private String adverb;
	private String adjective;
	private String bang;
	
	//Constructors
	public MadLibMaker() {
		super();
	}
	public MadLibMaker(String noun, String verb, String adverb, String adjective, String bang) {
		super();
		this.noun = noun;
		this.verb = verb;
		this.adverb = adverb;
		this.adjective = adjective;
		this.bang = bang;
		changeTheWord(noun, bang);
	}
	public String getNoun() {
		return noun;
	}
	public void setNoun(String noun) {
		this.noun = noun;
	}
	public String getVerb() {
		return verb;
	}
	public void setVerb(String verb) {
		this.verb = verb;
	}
	public String getAdverb() {
		return adverb;
	}
	public void setAdverb(String adverb) {
		this.adverb = adverb;
	}
	public String getAdjective() {
		return adjective;
	}
	public void setAdjective(String adjective) {
		this.adjective = adjective;
	}
	public String getBang() {
		return bang;
	}
	public void setBang(String bang) {
		this.bang = bang;
	}
	
	//methods
	public void changeTheWord(String n, String b) {
		String newN = n.substring(0,1).toUpperCase() + n.substring(1);
		this.noun = newN;
		
		String newB = b.toUpperCase();
		this.bang = newB;
	}
	
	public String toString() {
		return "MadLibMaker [adjective=" + adjective + ", adverb=" + adverb 
				+ ", bang=" + bang + ", noun=" + noun + ", verb=" + verb + "]";
	}

}
