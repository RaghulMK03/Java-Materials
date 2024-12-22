package buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferDemo {

	public static void main(String[] args) throws IOException {
		
		
		
//		InputStreamReader is = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(is);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a String : ");
//		String str = br.readLine();
//		System.out.println("Your mssg = "+str);
		int num =Integer.parseInt(br.readLine());
		System.out.println(num*100);

	}

}
