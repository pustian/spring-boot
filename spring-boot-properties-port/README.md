# spring 默认返回json格式。测试内容
  curl http://127.0.0.1:8081/
  curl http://127.0.0.1:8081/project
  curl http://127.0.0.1:8081/propertiesConfigInfo
# 此处注意application中汉语格式使用格式。可以使用native2ascii来获取
# 通过实现EmbeddedServletContainerCustomizer接口，更改端口号
