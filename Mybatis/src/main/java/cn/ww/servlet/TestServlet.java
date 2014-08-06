package cn.ww.servlet;

import java.io.IOException;
import java.util.Enumeration;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet{  
  
    @Override  
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException  
    {  
    	Enumeration<String> paraNames=req.getParameterNames();
    	for(Enumeration<String> e=paraNames;e.hasMoreElements();){
    	       String thisName=e.nextElement().toString();
    	       String thisValue=req.getParameter(thisName);
    	       System.out.println(thisName+"--------------"+thisValue);
    	}
    	System.out.println("Protocol:" + req.getProtocol());
    	System.out.println("ServletPath:" + req.getServletPath());
    	System.out.println("Protocol:" + req.getContentLength());
    	System.out.println("Method:" + req.getMethod());
    	Enumeration<String> HeaderNames = req.getHeaderNames();
    	for(Enumeration<String> e=HeaderNames;e.hasMoreElements();){
 	       String thisName=e.nextElement().toString();
 	       String thisValue=req.getParameter(thisName);
 	       System.out.println("      "+thisName+"--------------"+thisValue);
    	}
    	System.out.println("RemoteAddr:" + req.getRemoteAddr());
    	System.out.println("RemoteHost:" + req.getRemoteHost());
    	System.out.println("ServerName:" + req.getServerName());
    	System.out.println("ServerPort:" + req.getServerPort());
    	
        resp.sendRedirect("servlet.jsp");  
    }  
  
    @Override  
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException  
    {  
        // TODO Auto-generated method stub  
        doGet(req, resp);  
    }  
      
}  
