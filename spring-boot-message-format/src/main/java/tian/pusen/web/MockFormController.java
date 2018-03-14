package tian.pusen.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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

	@RequestMapping(value = "/mockService2", method = RequestMethod.POST,
			consumes= "application/x-www-form-urlencoded",
			produces = "application/json")
	@ResponseBody
	public MockResponse mockService2(@RequestParam String sessionID, @RequestParam String message, @RequestParam String sign) {
		logger.trace("request:{} {} {}",sessionID, message, sign);
		MockResponse mockResponse = new MockResponse();
		mockResponse.setSessionID("2OPEN-MOCK form united response sessionID");
		mockResponse.setBodyMessage("2OPEN-MOCK form BodyMessage");
		mockResponse.setMockInfo("2OPEN-MOCK form mockInfo");
		logger.trace("request:{}", mockResponse);
		return mockResponse;
	}
}
