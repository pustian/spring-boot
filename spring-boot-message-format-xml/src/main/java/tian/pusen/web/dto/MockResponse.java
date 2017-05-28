package tian.pusen.web.dto;

import java.io.Serializable;

/**
 * 银行响应的报文
 */
public class MockResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	private String sessionID;
	private String bodyMessage;
	private String mockInfo;
	private String sign;
	
	public final String getBodyMessage() {
		return bodyMessage;
	}
	public final void setBodyMessage(String bodyMessage) {
		this.bodyMessage = bodyMessage;
	}
	public final String getSessionID() {
		return sessionID;
	}
	public final void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}
	public final String getSign() {
		return sign;
	}
	public final void setSign(String sign) {
		this.sign = sign;
	}
	public final String getMockInfo() {
		return mockInfo;
	}
	public final void setMockInfo(String mockInfo) {
		this.mockInfo = mockInfo;
	}
	@Override
	public String toString() {
		return "MockResponse [sessionID=" + sessionID + ", bodyMessage=" + bodyMessage + ", sign=" + sign + "]";
	}
	

}
