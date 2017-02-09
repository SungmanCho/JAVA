package com.ktds.sungman.address.book.dao;

import java.util.List;

import com.ktds.sungman.address.book.vo.AddressVO;

public interface AddressDao {
	/*System.out.println("============주소록 프로그램===============");
	System.out.println("1.주소록 조회");
	System.out.println("2.주소록 검색");
	System.out.println("3.주소록 삭제");
	System.out.println("4.주소록 수정");
	System.out.println("5.주소록 추가");
	System.out.println("====================================");*/
	
//	@return 모든 주소를 반환함
	//주소록 조회
	public List<AddressVO> queryAllList();
	//주소 검색
	//@param index 주소 번호(1,2,3,4...)
	//@return 하나의 주소를 반환함
	public  AddressVO findOneAddress(int index);
	//주소 삭제
	//@param index 삭제할 주소 번호(1,2,3,4...)
	//
	public void removeAddress(int index);
	//주소 수정
	//@param index 수정할 주소 번호(1,2,3,4...)
	//@param newAddress 신규 주소 정보
	public void updateAddress(int index, AddressVO newAddress);
	//주소 추가
	//@param newAddress
	public void addAddress(AddressVO newAddress);
}
	
