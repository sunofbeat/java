package ch08.ex04;

import java.util.logging.Level;
import java.util.logging.Logger;

public class C02MyLogger {
	private Logger logger;
	
	public C02MyLogger() {
		this.logger = Logger.getLogger("ch08.ex04");
	}
	
	public void log() {
		logger.info("�α��� �����մϴ�.");
		
		try {
			throw new Exception("�Ϻη� ���ܸ� ��������ϴ�.");
		}catch(Exception e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
		
		logger.info("�α��� �����ϴ�.");
	}
	
	public static void main(String[] args) {
		new C02MyLogger().log();
	}
}
