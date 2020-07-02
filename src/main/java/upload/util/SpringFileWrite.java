package upload.util;

import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;


public class SpringFileWrite
{
	private FileOutputStream fos;

	public void writeFile(MultipartFile file, String path)
	{

		String fileName = file.getOriginalFilename();

		try {
			byte[] fileData = file.getBytes();
			fos = new FileOutputStream(path+"\\"+fileName);
			fos.write(fileData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void writeFile(MultipartFile file, String path, String myid)
	{
		String fileName = myid+"_"+file.getOriginalFilename();

		try {
			byte[] fileData = file.getBytes();
			fos = new FileOutputStream(path+"\\"+fileName);
			fos.write(fileData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void writeFileRename(MultipartFile file, String path, String fileName)
	{		
		try {
			byte[] fileData = file.getBytes();
			fos = new FileOutputStream(path+"\\"+fileName);
			fos.write(fileData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}