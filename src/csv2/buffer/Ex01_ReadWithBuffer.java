package csv2.buffer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Ex01_ReadWithBuffer {

	public static void main(String[] args) throws IOException {
		String fileName = "CSVDemo.csv";
		String sourceData = System.getProperty("user.dir") + File.separator + "dataSource" + File.separator + fileName;
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceData));
		
		String line = "";
		String splitBy = ",";
		
		while ((line = bufferedReader.readLine())!=null) {
			String[] actress = line.split(splitBy);
			System.out.println("Actress Information: [ First Name: " + actress[0]
					+ ", Last Name: " + actress[1]
							+ ", Movies: " + actress[2]
									+ ", City: " + actress[3]
											+ ", Married: " + actress[4]
													+ " ]");

			
		}
		bufferedReader.close();
	}

}
