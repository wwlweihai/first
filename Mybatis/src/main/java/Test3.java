import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test3 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(
					"f:/test1.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(
					"f:/test2.txt"));
			PrintWriter out = new PrintWriter(bw);
			String s;
			  while((s=br.readLine())!=null)  
		        {  
		            out.write(s);  
		        }   
			out.flush();			
			out.close();
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}