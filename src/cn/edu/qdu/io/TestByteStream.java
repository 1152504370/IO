package cn.edu.qdu.io;

import java.io.*;

public class TestByteStream {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream(args[0]);
			out = new FileOutputStream("C:\\Users\\NIIT\\Documents\\≤‚ ‘.txt",true);
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
