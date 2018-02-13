/* Write this abstract class called Prism.  It has one private field (height) and a constructor.  
 * It contains the methods calcAreaOfBase, calcPerimeter, calcVolume, and calcSA.
 * None of these methods require parameters.   
 * A couple are abstract - can you tell which ones and why?
 * 
 * Math note:
 * The volume of any prism can be found by multiplying the area of the base by the height.
 * The surface area of any prism can be found by multiplying the perimeter of the base by the height
 *   and then adding on the areas of the 2 bases.
 */

//Abstract classes are classes that contain one or more abstract methods.
//An abstract method is a method that is declared, but contains no implementation. 
//Abstract classes may not be instantiated, and require subclasses to provide implementations for the abstract methods.
public abstract class Prism {
	private double height;

	public Prism(double height) {
		this.height = height;
	}

	// An abstract method is a method that is declared, but contains no
	// implementation.
	// Abstract classes may not be instantiated, and require subclasses to provide
	// implementations for the abstract methods.
	public abstract double calcAreaOfBase();

	public abstract double calcPerimeter();

	public double calcVolume() {
		double volume = calcAreaOfBase() * height;
		return volume;
	}

	public double calcSA() {
		double surfaceArea = (calcPerimeter() * height) + (2 * calcAreaOfBase());
		return surfaceArea;
	}
}
