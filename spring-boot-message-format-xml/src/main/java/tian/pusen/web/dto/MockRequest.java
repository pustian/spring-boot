package tian.pusen.web.dto;

import java.io.Serializable;

/**
 * 银行接收到的报文
 */
public class MockRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	private String sessionID;
	private String message;
	private String sign;
	public final String getSessionID() {
		return sessionID;
	}
	public final void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}
	public final String getMessage() {
		return message;
	}
	public final void setMessage(String message) {
		this.message = message;
	}
	public final String getSign() {
		return sign;
	}
	public final void setSign(String sign) {
		this.sign = sign;
	}
	@Override
	public String toString() {
		return "MockRequest [sessionID=" + sessionID + ", message=" + message + ", sign=" + sign + "]";
	}

	
}
