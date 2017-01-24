package com.ktds.sungman;

public class Student {
		private String s = "공부";//외부에서 무분별한 수정을 막기 위해서 쓴다.
		private String st = "학생";
		private String f = "급식";
		private String b = "교과서";
		private String n = "조성만";
		private String t = "시험";
	
		//instance field에 대해서 setter를 생성
		//setter의 역할은 데이터를 갱신 시켜주는 것이다. 데이터를 함부로 바꿀수 없게 하는 것.
		/*public void setName() {
			// name  인스턴스 필드를 갱신함.
		}*/
		/*public void set멤버변수명(멤버변수타입 멤버변수명){
			this.set멤버변수명 = 멤버변수명;
		}*/
		public void setStudy(String study){
			if(study.length()==5){
			this.s = study;
			}
		}
		public void setName(String name){
			if(name.length()==2){
			this.n = name;
			}
		}
		public void setEat(String eat){
			if(eat.length()==4){
			this.f = eat;
			}
		}
		public void setTest(String test){
			if(test.length()==3){
			this.t = test;
			}
		}
		public void study(){
			
			String message= String.format("%s를 하기 위해 %s를 폅니다.",s,b);
			System.out.println(message);
		}
		public void name(){
			String message= String.format("%s의 이름은 %s입니다",st,n);
			System.out.println(message);
		}
		public void eat(){
			String message= String.format("%s은 %s을 먹습니다.",st,f);
			System.out.println(message);
		}
		public void test(){
			String message= String.format("%s은 %s로 공부를 해서 %s을 봅니다.",st,b,t);
			System.out.println(message);
		}
	}
