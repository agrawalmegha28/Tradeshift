
public final class TriangleUtils {
	public static enum TriangleType {EQUILATERAL, ISOSCELES, SCALENE};
	
	/**
	 * 
	 * @param a Side a
	 * @param b Side b
	 * @param c Side c
	 * @return type of the triangle
	 */
	public final static TriangleType determineType(int a, int b, int c){
		// Illegal arguments
		if(a <= 0 || b <= 0 || c <= 0){
			throw new IllegalArgumentException("Side length has to be greater than 0");
		}
		
		// Triangle in-equality
		if(a + b < c || a + c < b || b + c < a){
			throw new IllegalArgumentException("Triange sides should confirm triangle in-equality");
		}
		
		if(a == b && a == c){
			return TriangleType.EQUILATERAL;
		}
		else if(a == b || b == c || a == c){
			return TriangleType.ISOSCELES;
		}
		else {
			return TriangleType.SCALENE;	
		}
	}

}
