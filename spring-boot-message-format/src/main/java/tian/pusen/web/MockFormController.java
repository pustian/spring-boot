package tian.pusen.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tian.pusen.web.dto.MockRequest;
import tian.pusen.web.dto.MockResponse;


@Controller
@RequestMapping("/mockForm")
public class MockFormController {
	private static final Logger logger = LoggerFactory.getLogger(MockFormController.class);

	// curl -d '"message"="MESSage"&"sessionID"="SessionID"' 'http://localhost:13101/mockForm/service'
	@RequestMapping(value="/service", produces="application/json")
	@ResponseBody
	public MockResponse mockService(@ModelAttribute MockRequest mockRequest, Model model) {
		logger.trace("request:{}",mockRequest);
		
		MockResponse mockResponse = new MockResponse();
		mockResponse.setSessionID("OPEN-MOCK form united response sessionID");
		mockResponse.setBodyMessage("OPEN-MOCK form BodyMessage");
		mockResponse.setMockInfo("OPEN-MOCK form mockInfo");
		logger.trace("request:{}", mockResponse);
		return mockResponse;
	}
}
