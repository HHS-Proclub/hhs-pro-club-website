import java.util.Scanner;

public class PRA13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long width = in.nextLong();
		long height = in.nextLong();
		long maxArea = in.nextLong();
		
		// Width as limit
		long areaByWidth = 0;
		for (int i = 0; i < width; i++) {
			areaByWidth += height;
			
			if (areaByWidth > maxArea) {
				areaByWidth -= height;
				break;
			}
		}
		
		// Height as limit
		long areaByHeight = 0;
		for (int i = 0; i < height; i++) {
			areaByHeight += width;
			
			if (areaByHeight > maxArea) {
				areaByHeight -= width;
				break;
			}
		}
		
		long diffByWidth = maxArea - areaByWidth;
		long diffByHeight = maxArea - areaByHeight;
		System.out.println(diffByWidth < diffByHeight ? areaByWidth : areaByHeight);
	}

}
