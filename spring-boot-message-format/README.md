spring 对http协议传输的报文
# 报文使用form提交,json返回 参数设置查看 MockFormController
    @RequestMapping(value="/service", produces="application/json")
    @ResponseBody
    public MockResponse mockService(@ModelAttribute MockRequest mockRequest, Model model) {
        ......
    }
    注意：这里ResponseBody指定返回格式为json格式
    调用方法 
        curl -d '"message"="MESSage"&"sessionID"="SessionID"' 'http://localhost:13101/mockForm/service'

# 报文使用json提交 参数设置查看 MockJsonController
    @RequestMapping(value="/service")
    public MockResponse mockService(@RequestBody MockRequest mockRequest) {
        ......
    }
    注意：这里未对ResponseBody指定返回格式，默认使用json格式
    调用方法：
        curl -l -H "Content-type:application/json" -X POST -d '{"message":"MESSage","sessionID":"SessionID"}'  'http://localhost:13101/mockJson/service'
        curl -X POST --header "Content-Type:application/json;charset=UTF-8" --data @soap_get.json your_url
