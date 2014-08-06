package cn.other;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class MyClassLoader { 
        public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, IllegalAccessException, InstantiationException { 
            URL url = new URL("file:/F:\\workspace\\myeclipse\\Mybatis\\src\\main\\java"); 
            ClassLoader myloader = new URLClassLoader(new URL[]{url}); 
//            Class c = myloader.loadClass("Test3"); 
            Class c  = Class.forName("Test3");
            
            System.out.println("----------"); 
            Test3 t3 = (Test3) c.newInstance(); 
            System.out.println(t3);
            Test3 t4 = (Test3) c.newInstance(); 
            System.out.println(t4);
            Test3 t5 = (Test3) c.newInstance(); 
            System.out.println(t5);
//        	ClassLoader loader = MyClassLoader.class.getClassLoader(); 
//            System.out.println(loader); 
//            //ʹ��ClassLoader.loadClass()�������࣬����ִ�г�ʼ���� 
//            loader.loadClass("Test3");
//          //ʹ��Class.forName()�������࣬Ĭ�ϻ�ִ�г�ʼ���� 
//            Class.forName("Test3"); 
//          //ʹ��Class.forName()�������࣬��ָ��ClassLoader����ʼ��ʱ��ִ�о�̬�� 
//            Class.forName("Test3", false, loader); 
        } 
}