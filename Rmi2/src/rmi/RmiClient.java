package rmi;
import java.rmi.*;

public class RmiClient 
{
	public static void main(String a[])throws Exception
	{
		MyRemote obj=(MyRemote)Naming.lookup("rmi://localhost/MyObj");
		System.out.println("result from remote call:\n deposite is:"+obj.deposite(300)+"\nwithdrawal:"+obj.withdraw(100)+"\namount:"+obj.showBalance());
		
	}
}
