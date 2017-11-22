package tryCatchFinally;

public class FileInputStream implements AutoCloseable {
	private String file;
	
	public FileInputStream(String file) { //������
		this.file = file;
	}
	
	public void read() {
		System.out.println(file+"�б�");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file+"�ݱ�");
	}
}
