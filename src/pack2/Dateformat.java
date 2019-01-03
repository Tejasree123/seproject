package pack2;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformat {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat("dd-hmsM-yyyy");
		File f = new File("E:\\Date\\"+df.format(new Date()));
		if(!f.exists()){
			f.mkdirs();
			f=new File("E:\\Date\\"+df.format(new Date())+"\\Testing.txt");
			f.createNewFile();
		}

	}

}
