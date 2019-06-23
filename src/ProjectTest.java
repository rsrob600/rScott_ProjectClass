
public class ProjectTest {
	public static void main(String[] args) {

		/* Test 1: Create New Projects */
		System.out.println("<-------Test 1 Begin: Create New Projects-------->"); // Spacer

		// new project without name or description
		Project project1 = new Project();
		String name = project1.getName();
		String description = project1.getDescription();
		System.out.println("Project: " + name);
		System.out.println("Project Description: " + description);

		// new project with only name
		Project project2 = new Project("Malta");
		String pName = project2.getName();
		String pDescription = project2.getDescription();
		System.out.println("Project: " + pName);
		System.out.println("Project Description: " + pDescription);

		// new project with both a name and description
		Project project3 = new Project("Venice", "This project is based out of Italy");
		String pNameDesc = project3.getName();
		String pNameDescription = project3.getDescription();
		System.out.println("Project: " + pNameDesc);
		System.out.println("Project Description: " + pNameDescription);

		// new project with only a description
		Project project4 = new Project("", "This project was created without a title");
		String pNoName = project4.getName();
		String pOnlyDescription = project4.getDescription();
		System.out.println("Project: " + pNoName);
		System.out.println("Project Description: " + pOnlyDescription);

		System.out.println(""); // Spacer

		/* Test 2: Elevator Pitch - Print>> Project Name: Description */
		System.out.println("<-------Test 2 Begin: Elevator Pitch - Print All Projects-------->"); // Spacer

		project1.elevatorPitch();
		project2.elevatorPitch();
		project3.elevatorPitch();
		project4.elevatorPitch();

		System.out.println(""); // Spacer

		/* Test 3: Set missing title & description of first project */
		System.out.println("<-------Test 3 Begin: Add new info to old projects-------->"); // Spacer

		project1.setName("After-thought");
		project1.setDescription("Setting the project description after it was created");
		project1.elevatorPitch();

		project4.setName("Finally-Opened");
		project4.setDescription("Just received all the info for this project to set and open");
		project4.elevatorPitch();

		System.out.println(""); // Spacer

	}

}
