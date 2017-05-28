# spring 默认返回json格式。测试内容
  curl http://127.0.0.1:8081/
  curl http://127.0.0.1:8081/project
  curl http://127.0.0.1:8081/ymlConfigInfo
# 此处注意application中汉语格式使用格式。与application.properties 相比较
# 此时更改端口号，相当于命令行中添加  -Dserver.port=8081 参数
# 另外次数类似的 project.name 在命令行加参数无效。
