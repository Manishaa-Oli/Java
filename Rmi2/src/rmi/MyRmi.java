package rmi;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class MyRmi extends UnicastRemoteObject implements MyRemote 
{
	int amt=400;
	public MyRmi()throws RemoteException
	{
		super();
	}
	public int deposite(int a)throws RemoteException
	{
		
		return amt+a;
	}
	public int withdraw(int b)throws RemoteException
	{
		return amt-b;
	}
	public int showBalance()throws RemoteException
	{

		return amt;
	}
	
}
