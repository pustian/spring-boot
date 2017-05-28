package tian.pusen.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tian.pusen.web.dto.MockRequest;
import tian.pusen.web.dto.MockResponse;


@RestController
@RequestMapping("/mockXML")
public class MockXMLController {
	private static final Logger logger = LoggerFactory.getLogger(MockXMLController.class);

	// curl -H "Content-Type: text/xml" -d '<?xml version="1.0" encoding="UTF-8" standalone="yes"?><sessionID></sessionID><message>Me</message><sign>Hello!</sign>' 'http://localhost:13101/mockXML/service'
	@RequestMapping(value="/service")
	public MockResponse mockService(@RequestBody MockRequest mockRequest) {
		logger.trace("request:{}",mockRequest);
		MockResponse mockResponse = new MockResponse();
		mockResponse.setSessionID("OPEN-MOCK xml united response sessionID");
		mockResponse.setBodyMessage("OPEN-MOCK xml BodyMessage");
		mockResponse.setMockInfo("OPEN-MOCK xml mockInfo");
		logger.trace("request:{}", mockResponse);
		return mockResponse;
	}
}
