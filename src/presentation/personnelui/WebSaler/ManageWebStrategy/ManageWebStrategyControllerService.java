package presentation.personnelui.WebSaler.ManageWebStrategy;

import java.rmi.RemoteException;
import java.util.List;
import java.util.Vector;

import vo.StrategyVO;

public interface ManageWebStrategyControllerService {
	/**
	 * @return �õ���վ������Ӫ������
	 * */
	public Vector<Vector<String>> getAllWebsiteStrategy()throws RemoteException;
	
	/**
	 * @param StrategyVO  Ӫ������
	 * @return �����µ�Ӫ������
	 * */
	public boolean addStrategy(StrategyVO strategyVO)throws RemoteException;
	
	/**
	 * @param StrategyVO Ӫ������
	 * @return StrategyID���䣬����վӪ�����Խ����޸�
	 * */
	public boolean changeStrategy(StrategyVO strategyVO)throws RemoteException;
	
	/**
	 * @param strategyID ���Ա��
	 * @return �Բ��Խ���ɾ��
	 * */
	public boolean deleteStrategy(String strategyID)throws RemoteException;
	
	
	public StrategyVO getStrategyVO(String strategyid)throws RemoteException;
	
}
