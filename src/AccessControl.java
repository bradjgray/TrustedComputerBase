import java.util.ArrayList;
import java.util.List;

public class AccessControl {
	
	private List<File> _files;
	private String _openFile;
	
	public AccessControl() {
		_files = new ArrayList<File>();
		_files.add(new File("passwords.txt"));
		_files.add(new File("shopping_list.txt"));
		_files.add(new File("phone_numbers.txt"));
	}
	
	public String createFile(String key, String fileName) {
		
		if (key.equals(SecurityLevels.LEVEL_1) || key.equals(SecurityLevels.LEVEL_2) || 
				key.equals(SecurityLevels.LEVEL_3)) 
		{
			if (_files.stream().anyMatch(x -> x.getFileName().equals(fileName))) {
				return "Cannot create file as it already exists!";
			}
		}
		
		return "";
	}
	
	public String openFile(String key, String fileName) {
		if (key.equals(SecurityLevels.LEVEL_0) || key.equals(SecurityLevels.LEVEL_1) ||
				key.equals(SecurityLevels.LEVEL_2) || key.equals(SecurityLevels.LEVEL_3)) 
		{
			if (_files.stream().anyMatch(x -> x.getFileName().equals(fileName))) {
				_openFile = fileName;
				return "File: " + fileName;
			}
		}
		
		return null;
	}
	
	public String appendFile(String key, String fileName) {
		if (key.equals(SecurityLevels.LEVEL_2) || key.equals(SecurityLevels.LEVEL_3)) 
		{
			
		}
		
		return "";
	}
	
	public String closeFile(String key, String fileName) {
		if (key.equals(SecurityLevels.LEVEL_0) || key.equals(SecurityLevels.LEVEL_1) ||
				key.equals(SecurityLevels.LEVEL_2) || key.equals(SecurityLevels.LEVEL_3)) 
		{
			
		}
		
		if (_openFile.equals(fileName)) {
			
		}
		
		return "";
	}
	
	public String deleteFile(String key, String fileName) {
		if (key.equals(SecurityLevels.LEVEL_3)) 
		{
			
		}
		
		return "";
	}
}
