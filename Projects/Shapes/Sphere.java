
public class Sphere {
	
		//Data Attributes 
	/**
	 * This sets a final value to pi
	 * This resolves radius to a variable
	 */
		private final double pi = 3.141592653589793238462643383279502884197 ;
		private double radius ; 
		
		//Constructor
	/**
	 * This creates the sphere with a parameter of radius
	 */
		public Sphere(double rad) 
		{
			radius = rad ;
		}
		
		//Functionality
	/**
	 * This creates a method that returns radius
	 */
	
		public double getRadius()
		{
			return(radius) ;
		}
	/**
	 * This creates a method that returns volume
	 */
		public double getVolume()
		{
			return(radius*2*pi) ;
		}
	/**
	 * This creates a method that returns area
	 */
		public double getArea()
		{
			return(radius*radius*4*pi) ;
		}
	/**
	 * This creates a method that returns shape
	 */
		public static String getShape()
		{
			return ("Sphere") ;         
			
			
		}
		

	}


