package rmi;
import java.rmi.*;
import java.rmi.registry.*;
public class MyRemoteServer
{
	public static void main(String a[])throws Exception
	{
		MyRmi obj=new MyRmi();
		LocateRegistry.createRegistry(1099);
		System.out.println("RMI registry started..");
		Naming.rebind("MyObj",obj);
	}

}
