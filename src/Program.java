
public class Program {
	
	private int _securityLevel;
	private String _key;

	public Program() {
	}

	public void setSecurityLevel(int securityLevel) throws Exception {
		_securityLevel = securityLevel;
		switch (securityLevel) {
		case 0:
			_key = SecurityLevels.LEVEL_0;
			break;
		case 1:
			_key = SecurityLevels.LEVEL_1;
			break;
		case 2:
			_key = SecurityLevels.LEVEL_2;
			break;
		case 3:
			_key = SecurityLevels.LEVEL_3;
			break;
		default:
			throw new Exception("Security level does not exist!");
		}
	}
	
	public String getKey() {
		return _key;
	}
}
