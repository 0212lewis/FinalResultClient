package service.Client.ManageClientMessage_client;

import java.rmi.Remote;
import java.rmi.RemoteException;

import vo.ClientVO;

public interface ManageClientMessage_clientService extends Remote{

	public ClientVO getClientVO(String clientID) throws RemoteException;
	
	public boolean changeClientMessage(ClientVO vo) throws RemoteException;
}
