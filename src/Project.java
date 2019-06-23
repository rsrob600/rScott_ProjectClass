
public class Project {

	// project name & description fields
	private String name;
	private String description;

	/* ########### overloaded constructor methods ########### */

	// Projects created without a name or description
	public Project() {
	}

	// Projects created with only a name
	public Project(String name) {
		this.name = name;
	}

	// Projects created with both a name and description
	public Project(String name, String description) {
		this.name = name;
		this.description = description;
	}

	/* ############# Getter & Setter ############## */

	// getter & setters for name
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// getter & setter for description
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	/* ######### elevatorPitch (print project name: description) ######## */

	public void elevatorPitch() {
		System.out.println(name + ": " + description);
	}

	// ***************** optional ***************** //

	// initial cost - member variable that is of type double and has both
	// getters/setters

	// add (this) to the elevator pitch in () after the name e.g. name (cost):
	// description

	// create a portfolio class that will keep an ArrayList of Project in the field
	// projects
	// - use generics to ensure these are Project objects

	// add the appropriate getters/setters/constructors for this class to work

	// add the getPortfolioCost method that calculates and returns the cost to buy
	// the entire portfolio

	// add the showPortfolio method that will print all the project elevator
	// pitches, followed by the total cost

}
