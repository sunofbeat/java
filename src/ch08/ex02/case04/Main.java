package ch08.ex02.case04;

public class Main {

	public static void main(String[] args) {
		int choice = 1;
		String jobName = "";
		
		switch(Job.toJob(choice)) {
		case EXIT: jobName = "����"; break;
		case LIST: jobName = "���"; break;
		case ADD: jobName = "�߰�"; break;
		case FIX: jobName = "����"; break;
		case DEL: jobName = "����";
		}

		
		choice = 7;
		Job job = null;
		switch((job = Job.toJob2(choice)) !=null ? job : Job.EXIT) {
		case EXIT: jobName = "����"; break;
		case LIST: jobName = "���"; break;
		case ADD: jobName = "�߰�"; break;
		case FIX: jobName = "����"; break;
		case DEL: jobName = "����";
		}
		System.out.println(jobName);
	}

}
