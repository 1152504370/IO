package cn.edu.qdu.io;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\NIIT\\Documents\\测试.txt");
		if (!f.exists()) {
			System.out.println("该文件文件不存在，正在生成...");
			f.createNewFile();
		} else {
			System.out.println("文件已存在。");
		}
		System.out.format("最后修改时间：%tc%n", f.lastModified());
		System.out.format("是否是文件：%b%n", f.isFile());
		System.out.format("是否是目录：%b%n", f.isDirectory());
		System.out.format("是否可读：%b%n", f.canRead());
		System.out.format("是否可写：%b%n", f.canWrite());
		System.out.format("是否可执行：%b%n", f.canExecute());
		System.out.format("是否绝对路径：%b%n", f.isAbsolute());
		System.out.format("文件长度：%d%n", f.length());
		System.out.format("文件名：%s%n", f.getName());
		System.out.format("文件路径：%s%n", f.getPath());
		System.out.format("文件绝对路径：%s%n", f.getAbsolutePath());
		System.out.format("文件父目录路径：%s%n", f.getParent());
	}
}
