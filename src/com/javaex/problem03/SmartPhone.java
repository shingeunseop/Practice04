package com.javaex.problem03;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
    	 if("음악".equals(str)){
             playMusic();
         }else if("앱".equals(str)){
             playApp();
         }else
        	 call();
        
        //코드작성
        
    }
    public void playMusic(){
        System.out.println("다운로드해서 음악재생");
    }
    public void playApp() {
    	System.out.println("앱실행");
    }
    public void call() {
    	System.out.println("통화기능 시작");
    }
 
    //메소드작성
    
    //메소드작성
    
    
    
}
