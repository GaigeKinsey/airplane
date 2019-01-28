package airplane;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class SavableDatabase extends ArrayList<CanBeSaved> {

	private static final long serialVersionUID = 1L;
	
	public static final String directory = "savables";

	public void save() throws IOException {
		for(CanBeSaved obj : this) {
			saveCanBeSaved(obj);
		}
	}
	
	private void saveCanBeSaved(CanBeSaved obj) throws IOException {
		OutputStream out = new FileOutputStream(directory + "\\" + obj.getFileName());
		PrintStream outFile = new PrintStream(out);
		outFile.print(obj.serialize());
		outFile.close();
	}
	
	public void load(CanBeSavedFactory factory) throws IOException {
		File savableDirectory = new File(directory);
		File[] files = savableDirectory.listFiles();
		for(File file : files) {
			String content = loadFile(file.getAbsolutePath());
			CanBeSaved obj = factory.createInstance();
			obj.deserialize(content);
			this.add(obj);
		}
	}
	
	private String loadFile(String filePath) throws IOException {
		InputStream in = new FileInputStream(filePath);
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String content = "";
		while(reader.ready()) {
			String line = reader.readLine().trim();
			content += line + "\r\n";
		}
		reader.close();
		return content;
	}
}






