package presentation.personnelui_hotelWorker.ManageClient;

import java.util.List;
import java.util.Vector;

import vo.ClientVO;

public interface ManageClientControllerService {
	/*
	 * ת��vo
	 */
	public Vector<Vector<String>> change(List<ClientVO> list);
	
	/*
	 * �õ����пͻ���Ϣ
	 */
	public List<ClientVO> getAllClientVO();
	
	/*
	 * ����id�õ�ĳ���ͻ�����Ϣ
	 */
	public Vector<Vector<String>> getClientVO(String client_id);
	
	/*
	 * ���ݿͻ����Ƶõ�ĳ���ͻ�����Ϣ
	 */
	public Vector<Vector<String>> getClientVO1(String name);
	
	/*
	 * ���ݻ�Ա���͵õ��ͻ���Ϣ
	 */
	
	public Vector<Vector<String>> getClientVO2(String clienttype);
}