package csv3.readcsv;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

/*
 * Open CSV is 3rd Party API
 * - standard libraries to read "various" versions of CSV
 * - better handling 
 * - Read Tab Delimited Files (TDF)
 * - any number of values per line
 * 
 * - ignore commas in quoted elements
 * "The girl, who had the best grades in the class, went to IIT"
 * Output - 
 * The girl
 * who had the best grades in the class
 * went to IIT
 * "The girl, who had the best grades" in the class, went to IIT
 * Output - 
 * "The girl, who had the best grades" in the class
 * went to IIT
 * 
 * - handle entries that span multiple lines
 */
public class Ex01_ReadCSV {

	public static void main(String[] args) throws IOException, Exception {
		String fileName = "CSVDemo.csv";
		String sourceData = System.getProperty("user.dir") + File.separator + "dataSource" + File.separator + fileName;

		CSVReader reader = new CSVReader(new FileReader(sourceData));
		String[] nextLine;

		while ((nextLine = reader.readNext()) != null) {
			for (String token : nextLine) {
				System.out.print(token);

			}
			System.out.print("\n");
//			System.out.println(); //this is your home work 

		}

	}

}
