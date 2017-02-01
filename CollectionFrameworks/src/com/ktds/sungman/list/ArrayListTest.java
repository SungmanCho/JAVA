package com.ktds.sungman.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public void start(){
		//배열 맡드는 방법
		int[] scoreArray = new int [4];
		//list만드는 방법
		List<Integer> scoreList = new ArrayList<Integer>();//프리미티브 타입을 강제로 래퍼런스 타입으로 맞춤
		//배열에 데이터를 넣는 방법
		scoreArray[0]=100;
		scoreArray[1]=90;
		scoreArray[2]=80;
		scoreArray[3]=70;
		//List에 데이터를 넣는 방법
		scoreList.add(100);
		scoreList.add(90);
		scoreList.add(80);
		scoreList.add(70);
		scoreList.add(60);
		scoreList.add(50);
		scoreList.add(40);
		scoreList.add(30);
		scoreList.add(20);
		scoreList.add(10);
		scoreList.add(0);
		//배열 데이터를 출력하는 방법
		//1. for
		for(int i = 0;i<scoreArray.length; i++){
			System.out.println(scoreArray[i]);
		}
		//2. for each
		for(int score:scoreArray){
			System.out.println(score);
		}
		//List 데이터를 출력하는 방법
		//1.for
		for(int i =0; i<scoreList.size();i++){
			System.out.println(scoreList.get(i));
		}
		//2.for each
		for(int score : scoreList){
			System.out.println(score);
		}
		//배열 데이터 수정하기(1번 인덱스의 값을 10으로 변경)
		scoreArray[1] = 10;
		//List 데이터 수정하기(1번 인덱스의 값을 10으로 변경)
		scoreList.set(1, 10);
		
		//배열 데이터 삭제하기
		//불가능......
		
		//List 데이터 삭제하기(1번 인덱스를 삭제함)
		scoreList.remove(1);
		
		//배열 데이터 검색하기(80이 있는지 확인)
		for(int i = 0; i<scoreArray.length; i++){
			if(scoreArray[i]==80){
				System.out.println("ScoreArray에 80은"+ i +"번 인덱스에 있습니다.");
			}
			//list데이터 검색하기(80이 있는지 확인)
			if(scoreList.contains(80)){
				System.out.println("ScoreList에 80은"+
							scoreList.indexOf(80)+"번 인덱스에 있습니다.");
			}
		}
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		new ArrayListTest().start();
	}
}
