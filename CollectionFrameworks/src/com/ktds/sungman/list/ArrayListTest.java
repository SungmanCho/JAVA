package com.ktds.sungman.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public void start(){
		//�迭 �õ�� ���
		int[] scoreArray = new int [4];
		//list����� ���
		List<Integer> scoreList = new ArrayList<Integer>();//������Ƽ�� Ÿ���� ������ ���۷��� Ÿ������ ����
		//�迭�� �����͸� �ִ� ���
		scoreArray[0]=100;
		scoreArray[1]=90;
		scoreArray[2]=80;
		scoreArray[3]=70;
		//List�� �����͸� �ִ� ���
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
		//�迭 �����͸� ����ϴ� ���
		//1. for
		for(int i = 0;i<scoreArray.length; i++){
			System.out.println(scoreArray[i]);
		}
		//2. for each
		for(int score:scoreArray){
			System.out.println(score);
		}
		//List �����͸� ����ϴ� ���
		//1.for
		for(int i =0; i<scoreList.size();i++){
			System.out.println(scoreList.get(i));
		}
		//2.for each
		for(int score : scoreList){
			System.out.println(score);
		}
		//�迭 ������ �����ϱ�(1�� �ε����� ���� 10���� ����)
		scoreArray[1] = 10;
		//List ������ �����ϱ�(1�� �ε����� ���� 10���� ����)
		scoreList.set(1, 10);
		
		//�迭 ������ �����ϱ�
		//�Ұ���......
		
		//List ������ �����ϱ�(1�� �ε����� ������)
		scoreList.remove(1);
		
		//�迭 ������ �˻��ϱ�(80�� �ִ��� Ȯ��)
		for(int i = 0; i<scoreArray.length; i++){
			if(scoreArray[i]==80){
				System.out.println("ScoreArray�� 80��"+ i +"�� �ε����� �ֽ��ϴ�.");
			}
			//list������ �˻��ϱ�(80�� �ִ��� Ȯ��)
			if(scoreList.contains(80)){
				System.out.println("ScoreList�� 80��"+
							scoreList.indexOf(80)+"�� �ε����� �ֽ��ϴ�.");
			}
		}
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		new ArrayListTest().start();
	}
}
