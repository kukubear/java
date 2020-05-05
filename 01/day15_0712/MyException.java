package day15_0712;

import java.io.PrintStream;
import java.io.PrintWriter;

public class MyException extends Exception {
	private String message;
	private Throwable cause;

	public MyException() {
		super();
	}

	public MyException(String msg) {
		super(msg);
		message = msg;
	}

	public MyException(Throwable cause) {
		super(cause);
		this.cause = cause;
	}

	public MyException(String msg, Throwable cause) {
		super(msg, cause);
		message = msg;
		this.cause = cause;
	}

	public void setCause(Throwable cause) {
		this.cause = cause;
	}

	public Throwable getCause() {
		return cause;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void printStackTrace() {
		System.out.println("::Error�߻�!!!::");
		System.out.println("���� ���� = " + message);
		System.out.println("���� Ŭ���� = " + cause);
		System.out.println("::Error��� ��!!::");
		super.printStackTrace(System.out);

	}

	public void printStackTrace(PrintStream out) {
		super.printStackTrace(out);
	}

	public void printStackTrace(PrintWriter out) {
		super.printStackTrace(out);
	}
	

}
