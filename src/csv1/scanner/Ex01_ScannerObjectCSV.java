package csv1.scanner;

import java.io.File;
import java.util.Scanner;

public class Ex01_ScannerObjectCSV {

	public static void main(String[] args) throws Exception {
		String fileName = "CSVDemo.csv";
		String sourceData = System.getProperty("user.dir") + File.separator + "dataSource" + File.separator + fileName;
		Scanner scanner = new Scanner(new File(sourceData));
		scanner.useDelimiter(",");
		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}
		scanner.close();
	}
}
