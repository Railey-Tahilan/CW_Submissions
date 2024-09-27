
public class Cube {
	
		//Data Attributes 
	/**
	 * This resolves width to a variable
	 */
		private double edge ; 
			
		//Constructor
	/**
	 * This creates the cube with a parameter of edge
	 */
		public Cube(double e) 
		{
			edge = e ;
		}
			
		//Functionality
		/**
		 * This creates a method that returns edge
		 */	
		public double getEdge()
		{
			return(edge) ;
		}
		/**
		 * This creates a method that returns volume
		 */
		public double getVolume()
		{
			return(edge*edge*edge) ;
		}
		/**
		 * This creates a method that returns area
		 */
		public double getArea()
		{
			return(6*edge*edge) ;
		}
		/**
		 * This creates a method that returns shape
		 */
		public static String getShape()
		{
			return ("Cube") ;
				
		
		}
		public getArea()

			
}
