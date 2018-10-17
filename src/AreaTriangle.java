import java.util.Scanner;

public class AreaTriangle{
	    
static double area;
	
AreaTriangle(double b,double h)
	{
		area=(b*h)/2;
	}
	
     public static void main(String []args){
       
    	double base,height;
         
        Scanner sc=new Scanner(System.in);
         
     
        System.out.print("Enter Base Widht: ");
        base=sc.nextLong();
        
        System.out.print("Enter Height: ");
        height=sc.nextLong();
        

       new AreaTriangle(base,height);
        
        
        System.out.println("Area of Triangle: " +area);    
         
     }
}
	