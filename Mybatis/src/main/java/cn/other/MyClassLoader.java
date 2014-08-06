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
//            //使用ClassLoader.loadClass()来加载类，不会执行初始化块 
//            loader.loadClass("Test3");
//          //使用Class.forName()来加载类，默认会执行初始化块 
//            Class.forName("Test3"); 
//          //使用Class.forName()来加载类，并指定ClassLoader，初始化时不执行静态块 
//            Class.forName("Test3", false, loader); 
        } 
}