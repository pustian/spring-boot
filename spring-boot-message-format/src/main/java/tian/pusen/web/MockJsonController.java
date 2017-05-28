package tian.pusen.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tian.pusen.web.dto.MockRequest;
import tian.pusen.web.dto.MockResponse;


@RestController
@RequestMapping("/mockJson")
public class MockJsonController {
	private static final Logger logger = LoggerFactory.getLogger(MockJsonController.class);

	// curl -l -H "Content-type: application/json" -X POST -d '{"message":"MESSage","sessionID":"SessionID"}' 'http://localhost:13101/mockJson/service'
	@RequestMapping(value="/service")
	public MockResponse mockService(@RequestBody MockRequest mockRequest) {
		logger.trace("request:{}",mockRequest);
		MockResponse mockResponse = new MockResponse();
		mockResponse.setSessionID("OPEN-MOCK json united response sessionID");
		mockResponse.setBodyMessage("OPEN-MOCK json BodyMessage");
		mockResponse.setMockInfo("OPEN-MOCK form mockInfo");
		logger.trace("request:{}", mockResponse);
		return mockResponse;
	}
}
