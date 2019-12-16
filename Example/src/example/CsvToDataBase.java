package example;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvToDataBase {
	
	private static List<Employee> list = new ArrayList<Employee>();

	public static List<Employee> csvReader() {
		String line;
		try {

			FileReader filereader = new FileReader("hai1.csv");
			BufferedReader csvReader = new BufferedReader(filereader);
			csvReader.readLine();
			while ((line = csvReader.readLine()) != null) {
			
				System.out.println(line);
					//fullEmployeeGet(line);

				}
				System.out.println();
			
			csvReader.close();

			/*
			 * CsvReader csvReader = new CsvReader(filereader); String[] nextRecord; while
			 * ((nextRecord = csvReader.readNext()) != null) { for (String cell :
			 * nextRecord) { System.out.print(cell + "\t"); } } System.out.println();
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void main(String args[]){    
		/*String[] str = line.split(";");
		Employee emp = new Employee();
		
		emp.setId(Integer.parseInt(str[0]));
		emp.setFname(str[1]);
		emp.setLname(str[2]);
		emp.setSal(Integer.parseInt(str[3]));
		
		list.add(emp);*/
		System.out.println("jjjjj");
	}
}
