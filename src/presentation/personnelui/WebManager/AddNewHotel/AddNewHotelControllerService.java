package presentation.personnelui.WebManager.AddNewHotel;

import java.rmi.RemoteException;

import vo.HotelVO;

public interface AddNewHotelControllerService{
	/**
	 * @param HotelPO
	 * ��ס����˳��һ��Ҫ������һ��hotel���������Ӷ�Ӧ��hotelworker
	 * @return ��ӳɹ��Ļ������ؾƵ��ţ����ɹ��Ļ�������""
	 * */
	public String addHotel(HotelVO vo);
}
