class rectangle
{
	// instance(non static) variables
	double length, breadth;
	// class (static) variables
	static int noofrectangles;
	rectangle()
	{
		length= 0.0;               // this(0.0,0.0) this can be used to call the constructor of the same class(always be in the first line)
		breadth = 0.0;
		noofrectangles ++ ;
	}
	rectangle( double length, double breadth)
	{
		// using this we are referring to the instance which has called the member
		// this has a reference that is implicitly passed when the method is called
		
		this.length = length;
		this.breadth = breadth;
		noofrectangles ++;
		
	}
	@override
	public String tostring()                          // method overriding from class object // already tostring method is used initially without specifying
	{
		return  " rectangle: \n" + "length " + length + "\n"+ "breadth  "+ breadth;
	}
}
public class thisKeywordDemo {

	public static void main(String[] args) {
		rectangle r1 = new rectangle();
		rectangle r2 = new rectangle(10,20);
		System.out.print(r1);
		System.out.print(r2);
		
	}
	
    
    
	
	

}
