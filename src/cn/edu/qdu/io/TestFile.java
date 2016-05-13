package cn.edu.qdu.io;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\NIIT\\Documents\\����.txt");
		if (!f.exists()) {
			System.out.println("���ļ��ļ������ڣ���������...");
			f.createNewFile();
		} else {
			System.out.println("�ļ��Ѵ��ڡ�");
		}
		System.out.format("����޸�ʱ�䣺%tc%n", f.lastModified());
		System.out.format("�Ƿ����ļ���%b%n", f.isFile());
		System.out.format("�Ƿ���Ŀ¼��%b%n", f.isDirectory());
		System.out.format("�Ƿ�ɶ���%b%n", f.canRead());
		System.out.format("�Ƿ��д��%b%n", f.canWrite());
		System.out.format("�Ƿ��ִ�У�%b%n", f.canExecute());
		System.out.format("�Ƿ����·����%b%n", f.isAbsolute());
		System.out.format("�ļ����ȣ�%d%n", f.length());
		System.out.format("�ļ�����%s%n", f.getName());
		System.out.format("�ļ�·����%s%n", f.getPath());
		System.out.format("�ļ�����·����%s%n", f.getAbsolutePath());
		System.out.format("�ļ���Ŀ¼·����%s%n", f.getParent());
	}
}
