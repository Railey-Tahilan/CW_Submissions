
public class Rectangular_Prism {
	
	//Data Attributes 
	/**
	 * This resolves length, width, and height to a variable
	 */
	private double length ; 
	private double width ;
	private double height ;

	
	//Constructor
	/**
	 * This creates the cube with parameters of length, width, and height
	 */
	public Rectangular_Prism(double l, double w, double h) 
	{
		length = l ;
		width = w ;
		height = h ;
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
	 * This creates a method that returns height
	 */
	public double getHeight()
	{
		return(height) ;
	}
	/**
	 * This creates a method that returns volume
	 */
	public double getVolume()
	{
		return(height*length*width) ;
	}
	/**
	 * This creates a method that returns area
	 */
	public double getArea()
	{
		return((2*length*width)+(2*length*height)+(2*height*width)) ;
	}
	/**
	 * This creates a method that returns shape
	 */
	public static String getShape()
	{
		return ("Rectangular Prism") ;
		
	}
}
