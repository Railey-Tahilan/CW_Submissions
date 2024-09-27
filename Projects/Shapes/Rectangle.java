
public class Rectangle {
	
		//Data Attributes 
	/**
	 * This resolves length and width to a variable
	 */
		private double length ; 
		private double width ;
			
		//Constructor
	/**
	 * This creates the rectangle with parameters of length and width
	 */
		public Rectangle(double l, double w) 
		{
			length = l ;
			width = w ;
		}
		public Rectangle(double s) 
		{
			length = s ;
			width = s ;
		}			
			
			
		//Functionality
	/**
	 * This creates a method that returns length
	 */
		public double getLength()			
		{
			return(length) ;
		}
	/**
	 * This creates a method that returns width
	 */
		public double getWidth()
		{				
			return(width) ;
		}
	/**
	 * This creates a method that returns perimeter
	 */
		public double getPerimeter()
		
		{
			return(length+length+width+width) ;
		}
		
	/**
	 * This creates a method that returns area
	 */
		public double getArea()
		{
			return(length*width) ;
		}
		
	/**
	 * This creates a method that returns shape
	 */
		public static String getShape()
		{
			return ("Rectangle") ;
				
		}
			
	}



