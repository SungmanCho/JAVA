package com.ktds.sungman.address.book.biz;

import java.util.ArrayList;
import java.util.List;

import com.ktds.sungman.address.book.vo.AddressVO;

public  class AddressBizImpl implements AddressBiz {
	private List<AddressVO> addressList;
	
	public AddressBizImpl(){
		addressList = new ArrayList<AddressVO>();
	}
	@Override
	public List<AddressVO> queryAllList() {
		return addressList;
	}

	@Override
	public AddressVO findOneAddress(int index) {
		return addressList.get(index);
	}

	@Override
	public void remonveAddress(int index) {
		 addressList.remove(index);
	}

	@Override
	public void updateAddress(int index, AddressVO newAddress) {
		addressList.set(index, newAddress);
		
	}
	@Override
	public void addAddress(AddressVO newAddress) {
		addressList.add(newAddress);
	}
	
	

}
