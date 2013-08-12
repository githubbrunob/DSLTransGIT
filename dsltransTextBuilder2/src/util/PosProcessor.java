package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PosProcessor {
	private String projectPath;
	private String fileName;
	private String APPLY_ATTRIB_REGEX ;

	public PosProcessor(String projectPath, String fileName, String apply_attrib_regex) {
		this.projectPath = projectPath;
		this.fileName = fileName;
		this.APPLY_ATTRIB_REGEX = apply_attrib_regex;
	}
	public PosProcessor(String projectPath, String fileName) {
		this.projectPath = projectPath;
		this.fileName = fileName;
		this.APPLY_ATTRIB_REGEX = "\t= ";
	}

	public void perform() {
		System.out.println("Processing final file. Searching ApplyAttributes...");
		StringBuilder buffer = new StringBuilder();
		try {
			Scanner scanner = new Scanner(new File(projectPath+"/"+fileName));
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String trimedLine = line.trim();
				line = line.replaceAll(APPLY_ATTRIB_REGEX, "\tself = ");
				line = line.replace("~()~", "~~");
				if (!trimedLine.equals("") )
					buffer.append(line+"\n");
//				if (trimedLine.endsWith(":"))        
//					buffer.append(line);
				if (trimedLine.equals("end rule"))
					buffer.append("\n");
			}
			scanner.close();
			System.out.println("Writing changes...");
			FileWriter fw = new FileWriter(new File(projectPath+"/"+fileName));
			fw.write(buffer.toString());
			fw.flush();
			fw.close();
			System.out.println("Done.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
