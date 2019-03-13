package com.lhc.study;

public class TestGit{
	public static void mainn(String{} arg0){
		System.out.println("This is first looking for each other , Git is great tools for codeing worker!");
		System.out.println("This is second looking for each other , Git is great tools for codeing worker!");
		MyGitSay xiao = new MyGitSay();
		xiao.sayHello(1);
	}
}

class MyGitSay{
	public String sayHello(int type){
		if(type == 1 ){
			System.out.println(1);
		}elseif(type > 1){
			System.out.println(2);
		}else{
			System.out.println(3);
		}
	}
}
