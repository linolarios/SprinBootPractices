package com.lino.corp;

import org.springframework.aop.aspectj.SingletonAspectInstanceFactory;

public class Solution {
	
	
	
	
	public static void main(String args[]){
	
		Singleton s = Singleton.getSingleInstance();
		
		
		Singleton b= Singleton.getSingleInstance();
		
		Singleton b2= Singleton.getSingleInstance();

		 s = Singleton.getSingleInstance();

		System.out.println();
	}

}




final class Singleton{
    
      final private  static  Singleton singleton = new Singleton() ;    
    public String str;
    private Singleton(){
          System.out.println("Hello I am a singleton! Let me say hello world to you");
    }
    public  static Singleton getSingleInstance (){
        

        return singleton;
        
    }

}
