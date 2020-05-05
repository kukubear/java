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
		
		System.out.println("경로를 제외한 파일이름 - "+f1.getName());
		System.out.println("확장자를 제외한 파일 이름 - "+fileName1.substring(0, pos1));//FruitEx3
		System.out.println("확장자 - "+fileName1.substring(pos1+1));
		System.out.println();
		
		System.out.println("경로를 포함한 파일이름 - "+f1.getPath());
		System.out.println("파일의 절대경로 - "+f1.getAbsolutePath());
		System.out.println("파일이 속해 있는 디렉토리 - "+f1.getParent());
		System.out.println();
		
		System.out.println("File.pathSeparator - "+File.pathSeparator);
		System.out.println("File.pathSeparatorChar - "+File.pathSeparatorChar);
		System.out.println("File.seperator - "+ File.separator);
		System.out.println("File.seperatorChar"+File.separatorChar);
		System.out.println();
		
		File f = new File("C:/Temp");
		String fileName;
		if(!f.exists()||!f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		File []files = f.listFiles();
		
		for(int i =0; i<files.length; i++) {
			 fileName = files[i].getName();
			 System.out.println(files[i].isDirectory()?"["+fileName+"]":fileName);
		}
		
		printFileList(f);
		System.out.println();
		System.out.println("총 "+totalFiles+"개의 파일");
		System.out.println("총 "+totalDirs+"개의 디렉토리");
	}
	
	public static void printFileList(File f) {
		System.out.println(f.getAbsolutePath()+" 디렉토리");
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
		
		System.out.println(fileNum +"개의 파일. "+fNum+"개의 디렉토리");
		
	}
}
