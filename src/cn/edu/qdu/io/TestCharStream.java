package cn.edu.qdu.io;

import java.io.*;

public class TestCharStream {
	public static void main(String[] args) throws IOException {
		FileReader in = null;
		FileWriter out = null;
		try {
			in = new FileReader("C:\\Users\\NIIT\\Documents\\hello.txt");
			out = new FileWriter("C:\\Users\\NIIT\\Documents\\≤‚ ‘.txt", true);
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
