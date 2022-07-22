package ch08.ex04;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class C03FileLogger {
	private Logger logger;
	
	public C03FileLogger() {
		this.logger = Logger.getLogger(this.getClass().getName());
	}
	
	public void log() throws Exception{
		Handler handler = new FileHandler("c:/DEV/ch08.ex04.xml");
		logger.addHandler(handler);
		
		logger.info("�α��� �����մϴ�.");
		logger.severe("���ܰ� �߻��߽��ϴ�.");
		logger.info("�α��� �����ϴ�.");
		
		handler.flush();
		handler.close();
	}
	
	public static void main(String[] args) throws Exception  {
		new C03FileLogger().log();
	}
}
