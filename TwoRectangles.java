// A program that prompts user to enter the two rectangle and
// determine if they overlap each other.

public class TwoRectangles {
	public static void main(String[] args) {
		// Prompt user to enter the coordinates of two rectangles
		
		// Create test case
		
		// Test case for Inside
		/*
		double r1cx = 2.5; // rectangle 1's center x coordinate
		double r1cy = 4; // rectangle 1's center y coordinate
		double r1width = 2.5; // rectangle 1's width
		double r1height = 43; // rectangle 1's height
		
		double r2cx = 1.5;
		double r2cy = 5;
		double r2width = 0.5;
		double r2height = 3;
		*/
		
		// Test case for Overlap
		/*
		double r1cx = 1; // rectangle 1's center x coordinate
		double r1cy = 2; // rectangle 1's center y coordinate
		double r1width = 3; // rectangle 1's width
		double r1height = 5.5; // rectangle 1's height
		
		double r2cx = 3;
		double r2cy = 4;
		double r2width = 4.5;
		double r2height = 5;
		*/
		
		// Test case for Not Overlap
		double r1cx = 1; // rectangle 1's center x coordinate
		double r1cy = 2; // rectangle 1's center y coordinate
		double r1width = 3; // rectangle 1's width
		double r1height = 3; // rectangle 1's height
		
		double r2cx = 40;
		double r2cy = 45;
		double r2width = 3;
		double r2height = 2;
		
		// Compute the 4 corners's coordinates for the rectangle
		double r1x1 = r1cx - (r1width / 2.0);
		double r1x2 = r1cx + (r1width / 2.0);
		double r1y1 = r1cy + (r1height / 2.0);
		double r1y2 = r1cy - (r1height / 2.0);
		
		double r2x1 = r2cx - (r2width / 2.0);
		double r2x2 = r2cx + (r2width / 2.0);
		double r2y1 = r2cy + (r2height / 2.0);
		double r2y2 = r2cy - (r2height / 2.0);
		
		// Testing the rectangle coordinates
		System.out.printf(
			"Rectangle 1: (%2.2f, %2.2f), (%2.2f, %2.2f)",
			r1x1, r1y1, r1x2, r1y2);
		System.out.printf(
			"\nRectangle 2: (%2.2f, %2.2f), (%2.2f, %2.2f)\n",
			r2x1, r2y1, r2x2, r2y2);
		
		// Determine if it is inside
		boolean isInside = 
			((r1x1 <= r2x1) && (r1x2 >= r2x2) && 
			(r1y1 >= r2y1) && (r1y2 <= r2y2));
		
		/*System.out.println(
		 * "Is rectangle 2 inside of rectangle 1? " + isInside);*/
		
		// Determine if it is overlap
		boolean isOverLap = 
				((r1x1 <= r2x1) || (r1x2 >= r2x2) || 
				(r1y1 >= r2y1) || (r1y2 <= r2y2));
		
		/*System.out.println(
		 * "Is rectangle 2 overlapping rectangle 1? " + isOverLap);*/
		
		// Determine if it is not overlap
		boolean isNotOverLap = !(isOverLap);
		System.out.println(
		  "Is rectangle 2 overlapping rectangle 1? " + isNotOverLap);
		
		// Display result
	}
}