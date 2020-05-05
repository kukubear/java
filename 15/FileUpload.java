package sec01.ex01;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class FileUpload
 */
@WebServlet("/upload.do")
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		String encoding="utf-8";
		//업로드할 파일경로 지정
		File currentDirPath = new File("C:\\file_repo");
		DiskFileItemFactory factory = new DiskFileItemFactory();
		//파일 경로 설정
		factory.setRepository(currentDirPath);
		//최대 업로드 가능한 파일 크기를 설정
		factory.setSizeThreshold(1024*1024);
		ServletFileUpload upload = new ServletFileUpload(factory);
		
		try {
			//request 객체에서 
			List items = upload.parseRequest(request);
			for(int i=0; i<items.size(); i++) {
			FileItem fileItem =(FileItem) items.get(i);
			if(fileItem.isFormField()) {
				System.out.println(fileItem.getFieldName()+"="+fileItem.getString(encoding));
			}else {
				System.out.println("매개변수이름 : "+fileItem.getFieldName());
				System.out.println("파일 이름 : "+fileItem.getName());
				System.out.println("파일 크기 : "+fileItem.getSize()+"bytes");
				
				if(fileItem.getSize()>0) {
					int idx= fileItem.getName().lastIndexOf("\\");
					if(idx ==-1) {
						idx=fileItem.getName().lastIndexOf("/");
					}
					String fileName = fileItem.getName().substring(idx+1);
					File uploadFile = new File(currentDirPath+"\\"+fileName);
					fileItem.write(uploadFile);
				}//end if
			}//end if
			}//end for
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
