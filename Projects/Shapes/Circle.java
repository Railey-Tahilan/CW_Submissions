
public class Circle {

	//Data Attributes 
			private final double pi = 3.141592653589793238462643383279502884197 ;
			private double radius ; 
			
			//Constructor
			public Circle(double rad) 
			{
				radius = rad ;
				
			}
			
			//Functionality
			public double getRadius()
			{
				return(radius) ;
			}
			public double getCircumference()
			{
				return(radius*2*pi) ;
			}
			public double getArea()
			{
				return(radius*radius*pi) ;
			}

			public static String getShape()
			{
				return ("Circle") ;
				
				
			}
			public void setRadius(double radius) 
			{
				this.radius = radius;
			}

		}
