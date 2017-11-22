package tryCatchFinally;

public class FileInputStream implements AutoCloseable {
	private String file;
	
	public FileInputStream(String file) { //생성자
		this.file = file;
	}
	
	public void read() {
		System.out.println(file+"읽기");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file+"닫기");
	}
}
