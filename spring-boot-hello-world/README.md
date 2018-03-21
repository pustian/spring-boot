# spring 默认返回json格式

# restful 对于资源的具体操作类型，由HTTP动词表示。
  常用的HTTP动词有下面五个（括号里是对应的SQL命令）。
  GET（SELECT）：从服务器取出资源（一项或多项）。
  POST（CREATE）：在服务器新建一个资源。
  PUT（UPDATE）：在服务器更新资源（客户端提供改变后的完整资源）。
  PATCH（UPDATE）：在服务器更新资源（客户端提供改变的属性）。
  DELETE（DELETE）：从服务器删除资源。
  还有两个不常用的HTTP动词。
  HEAD：获取资源的元数据。
  OPTIONS：获取信息，关于资源的哪些属性是客户端可以改变的。
  # 示例
    GET /zoos：列出所有动物园
    POST /zoos：新建一个动物园
    GET /zoos/${id}：获取某个指定动物园的信息
    PUT /zoos/${id}：更新某个指定动物园的信息（提供该动物园的全部信息）
    PATCH /zoos/${id}：更新某个指定动物园的信息（提供该动物园的部分信息）
    DELETE /zoos/${id}：删除某个动物园
    GET /zoos/${id}/animals：列出某个指定动物园的所有动物
    DELETE /zoos/${id}/animals/${id}：删除某个指定动物园的指定动物

# 增加swagger-ui2支持
  http://localhost:8080/swagger-ui.html
  可通过次出try it out做测试
  curl http://localhost:8080/greeting
  
  curl http://localhost:8080/greeting?name='tianpusen'
  
  curl http://localhost:8080/user/selectByUserID
  
  curl http://localhost:8080/user/selectByUserID?userID=003
