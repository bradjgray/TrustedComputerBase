public class File {

	private int _id;
	private String _fileName;
	
	public File() {
	}
	
	public File(String fileName) {
		_id = (int) (Math.random() * 10);
		_fileName = fileName;
	}
	
	public int getId() {
		return _id;
	}
	
	public String getFileName() {
		return _fileName;
	}
}
