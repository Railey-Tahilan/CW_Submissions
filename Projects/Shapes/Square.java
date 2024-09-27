
public class Square {
	
		//Data Attributes 
	/**
	 * This resolves side to a variable
	 */
		private double side ; 
		
		//Constructor
	/**
	 * This creates the square with a parameter of side
	 */
		public Square(double si) 
		{
			side = si ;
			
		}
		
		//Functionality
	/**
	 * This creates a method that returns side
	 */
		public double getSide()
		{
			return(side) ;
		}
	/**
	 * This creates a method that returns perimeter
	 */
		public double getPerimeter()
		{
			return(side*4) ;
		}
	/**
	 * This creates a method that returns area
	 */
		public double getArea()
		{
			return(side*side) ;
		}
	/**
	 * This creates a method that returns shape
	 */
				public static String getShape()
		{
			return ("Square") ;
			
		}
		
		/**
		 * This creates methods that return all info about a square into a string
		 */		
		public String toString()
		{
			return ("This is a square with a side "+getSide()+
					" and an area of "+ getArea()+
				   	" and a perimeter of "+getPerimeter()) ;
		}

		public void setSide(double side) {
			this.side = side;
		}
		
	}


