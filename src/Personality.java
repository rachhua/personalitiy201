public class Personality {
	
	private String myName;
	
	public Personality(String name) {
		myName = name;
	}
	
	public Personality() {
		this("they with no name");
	}

	/**
	 * Returns this object's identifier
	 * @return this objects identifying String/label
	 */
	public String getName() {
		return myName;
	}
	
	/**
	 * Returns a String describing this object
	 * The String will be a minimum of four characters in length
	 * @return description of this object
	 */
	
	public String getDescription() {
		String description = "";
		if(myName.length() <= 4) {
			description = "playful";
		}
		if(myName.length() > 4) {
			description = "argumentative";
		}
		return description;
	}
}
