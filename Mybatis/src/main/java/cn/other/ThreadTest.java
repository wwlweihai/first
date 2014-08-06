package cn.other;

public class ThreadTest {  
    public static void main(String[] args) {  
        Runnable runnable = new Runnable() {  
        	Count count = new Count();
            public void run() { 
            	System.out.println(Thread.currentThread().getName());
                count.count();  
            }  
        };  
        for(int i = 0; i < 10; i++) {  
            new Thread(runnable).start();  
        }  
    }  
}  
