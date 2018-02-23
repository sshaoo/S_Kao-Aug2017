
public class Sphere extends ThreeDShape {
	private double radius;
	public Sphere (double radius) {
		this.radius = radius;
	}
	public double calcVolume() {
		double calcVolume = (4/3) * Math.PI * (radius * radius * radius);
		return calcVolume;
	}
	public double calcSA() {
		double calcSA = 4 * Math.PI * (radius * radius); 
		return calcSA;
	}
}
