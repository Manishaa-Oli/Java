package rmi;
import java.rmi.*;
	public interface MyRemote extends Remote
	{
		public int deposite(int a)throws RemoteException;
		public int withdraw(int b)throws RemoteException;
		public int showBalance()throws RemoteException;
	}

