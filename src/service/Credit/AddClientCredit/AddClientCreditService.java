package service.Credit.AddClientCredit;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.ClientVO;

public interface AddClientCreditService extends Remote{

	public boolean addCredit(String clientID,double point)throws RemoteException;
	
	public ClientVO getClientVO(String ClientID)throws RemoteException;
	
	public boolean checkID(String ClientID)throws RemoteException;
}
