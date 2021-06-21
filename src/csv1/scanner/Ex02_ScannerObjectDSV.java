package csv1.scanner;

import java.io.File;
import java.util.Scanner;

public class Ex02_ScannerObjectDSV {

	public static void main(String[] args) throws Exception {
		String fileName = "CSVDemowithPipe.csv";
		String sourceData = System.getProperty("user.dir") + File.separator + "dataSource" + File.separator + fileName;
		// parse the csv to the Scanner class's constructor
		Scanner scanner = new Scanner(new File(sourceData));
		scanner.useDelimiter("|");
		while (scanner.hasNext()) {
			System.out.print(scanner.next());
		}
		scanner.close();
	}
}
