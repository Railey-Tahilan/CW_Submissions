
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This prints out the shape type
		System.out.println("The first shape is a " + Circle.getShape());
		System.out.println(" ");
		
		// This sets and prints the radius of sphere one, two, and three
		Circle circOne = new Circle(4);
		Circle circTwo = new Circle(5);
		Circle circThree = new Circle(10);
		System.out.println("Radius of circle one is " + circOne.getRadius());
		System.out.println("Radius of circle two is " + circTwo.getRadius());
		System.out.println("Radius of circle three is " + circThree.getRadius());
		System.out.println(" ");
		
		// This prints the volume of sphere one, two, and three
		System.out.println("Circumference of circle one is " + circOne.getCircumference());
		System.out.println("Circumference of circle two is " + circTwo.getCircumference());
		System.out.println("Circumference of circle three is " + circThree.getCircumference());
		System.out.println(" ");
		
		// This prints the surface area of sphere one, two, and three
		System.out.println("Area of circle one is " + circOne.getArea());
		System.out.println("Area of circle two is " + circTwo.getArea());
		System.out.println("Area of circle three is " + circThree.getArea());
		System.out.println(" ");

		//-----------------------------------------------------------------------
		
		// This prints out the shape type
		System.out.println("The second shape is a " + Square.getShape());
		System.out.println(" ");

		// This sets and prints the length of square one, two, and three
		Square squOne = new Square(4);
		Square squTwo = new Square(5);
		Square squThree = new Square(10);
		System.out.println("Length of square one is " + squOne.getSide());
		System.out.println("Length of square two is " + squTwo.getSide());
		System.out.println("Length of square three is " + squThree.getSide());
		System.out.println(" ");
		
		// This prints the value of perimeter of square one, two, and three
		System.out.println("Perimeter of square one is " + squOne.getPerimeter());
		System.out.println("Perimeter of square two is " + squTwo.getPerimeter());
		System.out.println("Perimeter of square three is " + squThree.getPerimeter());
		System.out.println(" ");

		// This prints the area of square one, two, and three
		System.out.println("Area of square one is " + squOne.getArea());
		System.out.println("Area of square two is " + squTwo.getArea());
		System.out.println("Area of square three is " + squThree.getArea());
		System.out.println(" ");
		
		//-----------------------------------------------------------------------
		
		// This prints out the shape type
		System.out.println("The third shape is a " + Sphere.getShape());
		System.out.println(" ");
		
		// This sets and prints the radius of sphere one, two, and three
		Sphere sphOne = new Sphere(4);
		Sphere sphTwo = new Sphere(5);
		Sphere sphThree = new Sphere(10);
		System.out.println("Radius of sphere one is " + sphOne.getRadius());
		System.out.println("Radius of sphere two is " + sphTwo.getRadius());
		System.out.println("Radius of sphere three is " + sphThree.getRadius());
		System.out.println(" ");
		
		// This prints the volume of sphere one, two, and three
		System.out.println("Volume of sphere one is " + sphOne.getVolume());
		System.out.println("Volume of sphere two is " + sphTwo.getVolume());
		System.out.println("Volume of sphere three is " + sphThree.getVolume());
		System.out.println(" ");
		
		// This prints the surface area of sphere one, two, and three
		System.out.println("Surface Area of sphere one is " + sphOne.getArea());
		System.out.println("Surface Area of sphere two is " + sphTwo.getArea());
		System.out.println("Surface Area of sphere three is " + sphThree.getArea());
		System.out.println(" ");

		//-----------------------------------------------------------------------
		
		// This prints out the shape type
		System.out.println("The fourth shape is a " + Rectangle.getShape());
		System.out.println(" ");
		
		// This sets and prints the length of rectangle one, two, and three
		Rectangle recOne = new Rectangle(2,4);
		Rectangle recTwo = new Rectangle(3,5);
		Rectangle recThree = new Rectangle(7,10);
		System.out.println("Length of rectangle one is " + recOne.getLength());
		System.out.println("Width of rectangle one is " + recOne.getWidth());
		System.out.println("Length of rectangle two is " + recTwo.getLength());
		System.out.println("Width of rectangle two is " + recTwo.getWidth());
		System.out.println("Length of rectangle three is " + recThree.getLength());
		System.out.println("Width of rectangle three is " + recThree.getWidth());
		System.out.println(" ");
		
		// This prints the value of perimeter of rectangle one, two, and three
		System.out.println("Perimeter of rectangle one is " + recOne.getPerimeter());
		System.out.println("Perimeter of rectangle two is " + recTwo.getPerimeter());
		System.out.println("Perimeter of rectangle three is " + recThree.getPerimeter());
		System.out.println(" ");
		
		// This prints the value of area of rectangle one, two, and three
		System.out.println("Area of rectangle one is " + recOne.getArea());
		System.out.println("Area of rectangle two is " + recTwo.getArea());
		System.out.println("Area of rectangle three is " + recThree.getArea());
		System.out.println(" ");
		
		//-----------------------------------------------------------------------
		
		// This prints out the shape type
		System.out.println("The fifth shape is a " + Rectangular_Prism.getShape());
		System.out.println(" ");
		
		// This prints out the length, width, and height of rectangular prism one, two, and three
		Rectangular_Prism rpOne = new Rectangular_Prism(2,3,4);
		Rectangular_Prism rpTwo = new Rectangular_Prism(3,5,7);
		Rectangular_Prism rpThree = new Rectangular_Prism(5,7.5,10);
		System.out.println("Length of rectangular prism one is " + rpOne.getLength());
		System.out.println("Width of rectangular prism one is " + rpOne.getWidth());
		System.out.println("Height of rectangular prism one is " + rpOne.getHeight());
		System.out.println(" ");

		System.out.println("Length of rectangular prism two is " + rpTwo.getLength());
		System.out.println("Width of rectangular prism two is " + rpTwo.getWidth());
		System.out.println("Height of rectangular prism two is " + rpTwo.getHeight());
		System.out.println(" ");

		System.out.println("Length of rectangular prism three is " + rpThree.getLength());
		System.out.println("Width of rectangular prism three is " + rpThree.getWidth());
		System.out.println("Height of rectangular prism three is " + rpThree.getHeight());
		System.out.println(" ");

		// This prints out the volume of rectangular prism one, two, and three
		System.out.println("Volume of rectangular prism one is " + rpOne.getVolume());
		System.out.println("Volume of rectangular prism two is " + rpTwo.getVolume());
		System.out.println("Volume of rectangular prism three is " + rpThree.getVolume());
		System.out.println(" ");
		
		// This prints out the surface area of rectangular prism one, two, and three
		System.out.println("Surface Area of rectangular prism one is " + rpOne.getArea());
		System.out.println("Surface Area of rectangular prism two is " + rpTwo.getArea());
		System.out.println("Surface Area of rectangular prism three is " + rpThree.getArea());
		System.out.println(" ");		
		
		//-----------------------------------------------------------------------
		
		// This prints out the shape type
		System.out.println("The sixth shape is a " + Cube.getShape());
		System.out.println(" ");
		
		// This sets and prints out the edge value of cube one, two and three
		Cube cuOne = new Cube(4);
		Cube cuTwo = new Cube(5);
		Cube cuThree = new Cube(10);
		System.out.println("Edge of cube one is " + cuOne.getEdge());
		System.out.println("Edge of cube two is " + cuTwo.getEdge());
		System.out.println("Edge of cube three is " + cuThree.getEdge());
		System.out.println(" ");
		
		// This prints out the volume of cube one, two and three
		System.out.println("Volume of cube one is " + cuOne.getVolume());
		System.out.println("Volume of cube two is " + cuTwo.getVolume());
		System.out.println("Volume of cube three is " + cuThree.getVolume());
		System.out.println(" ");
		
		// This prints out the surface area of cube one, two and three
		System.out.println("Surface Area of cube one is " + cuOne.getArea());
		System.out.println("Surface Area of cube two is " + cuTwo.getArea());
		System.out.println("Surface Area of cube three is " + cuThree.getArea());
		System.out.println(" ");
		
		// Prints everything about a square using one string
		System.out.println(squOne.toString());

	}
	

}
