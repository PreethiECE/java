
import java.util.Scanner;
import java.lang.NumberFormatException;
public class First {
	public static void main(String[] arg)throws NumberFormatException
	{
	Scanner in=new Scanner(System.in);
	int n,m=0;
	n=in.nextInt();
	boolean status=false;    
	 //it is the number to be checked  
	  m=n/2;    
	  for(int i=2;i<=m;i++){    
	   if(n%i==0){    
	   System.out.println("Number is not prime");    
	   status=true;    
	   break;    
	   }    
	  }    
	  if(status==false)    
	  System.out.println("Number is prime");
}
}

