package day21_0722;

import java.io.File;
import java.util.ArrayList;

public class FileTest {
	static int totalFiles = 0;
	static int totalDirs = 0;
	
	public static void main(String[] args) {
		File f1 = new File("C:/MyProject/workspace/pro01/FruitEx3.java");
		String fileName1 = f1.getName();
		
	
		
		
		int pos1 = fileName1.lastIndexOf(".");
		
		System.out.println("��θ� ������ �����̸� - "+f1.getName());
		System.out.println("Ȯ���ڸ� ������ ���� �̸� - "+fileName1.substring(0, pos1));//FruitEx3
		System.out.println("Ȯ���� - "+fileName1.substring(pos1+1));
		System.out.println();
		
		System.out.println("��θ� ������ �����̸� - "+f1.getPath());
		System.out.println("������ ������ - "+f1.getAbsolutePath());
		System.out.println("������ ���� �ִ� ���丮 - "+f1.getParent());
		System.out.println();
		
		System.out.println("File.pathSeparator - "+File.pathSeparator);
		System.out.println("File.pathSeparatorChar - "+File.pathSeparatorChar);
		System.out.println("File.seperator - "+ File.separator);
		System.out.println("File.seperatorChar"+File.separatorChar);
		System.out.println();
		
		File f = new File("C:/Temp");
		String fileName;
		if(!f.exists()||!f.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
			System.exit(0);
		}
		File []files = f.listFiles();
		
		for(int i =0; i<files.length; i++) {
			 fileName = files[i].getName();
			 System.out.println(files[i].isDirectory()?"["+fileName+"]":fileName);
		}
		
		printFileList(f);
		System.out.println();
		System.out.println("�� "+totalFiles+"���� ����");
		System.out.println("�� "+totalDirs+"���� ���丮");
	}
	
	public static void printFileList(File f) {
		System.out.println(f.getAbsolutePath()+" ���丮");
		File [] files = f.listFiles();
		
		ArrayList subf = new ArrayList();
		
		for(int i = 0; i<files.length;i++) {
			String filename = files[i].getName();
			
			if(files[i].isDirectory()) {
				filename = "["+filename+"]";
				subf.add(i+"");
			}
			System.out.println(filename);
			
		}
		
		int fNum = subf.size();
		int fileNum = files.length-fNum;
		
		totalFiles +=fileNum;
		totalDirs += fNum;
		
		System.out.println(fileNum +"���� ����. "+fNum+"���� ���丮");
		
	}
}
