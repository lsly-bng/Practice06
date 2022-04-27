package com.javaex.ex07;

public class SmartPhone extends MusicPhone {

	public void execute(String str) {

		if ("앱".equals(str)) {
			openApp();
		} else if ("통화".equals(str)) {
			super.execute(str);
		} else if ("음악".equals(str)) {
			playMusic();
		}
	}

	public void openApp() {
		System.out.println("앱실행");
	}

	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}

}
