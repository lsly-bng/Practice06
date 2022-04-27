package com.javaex.ex07;

public class SmartPhone extends MusicPhone {

	public void execute(String str) {

		/*
		 if ("앱".equals(str)) { 
		 		openApp(); 
		 	} else if ("통화".equals(str)) {
		 		super.execute(str); 
		 	} else if ("음악".equals(str)) { 
		 		playMusic(); 
		 	}
		 }  //기존 코딩 
		 */
		
		if ("앱".equals(str)) {
			openApp();
		} else {
			super.execute(str); //참조 코딩 : 이렇게만해도 부모 내용 상속되며, playMusic도 Override 적용되어 원하는 출력값 나옴
		}
	}

	public void openApp() {
		System.out.println("앱실행");
	}

	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}

}
