http://start.spring.io/

# spring-boot-hello-world 
    基础的spring restful请求和返回

# spring-boot-properties-port 
    application.properties 做参数使用
    在application.properties 中更改启动端口号，此处未列示例 

    在 SpringApplication 通过实现EmbeddedServletContainerCustomizer接口，更改端口号
 
# spring-boot-yml-port 
    application.yml 做参数使用
    在application.yml 中更改启动端口号，此处未列示例 
    该项目中更改端口 类似于 java 命令中增加 -Dserver.port=8081 参数

# spring-boot-message-format
    请求响应报文格式    
    json/form 请求返回 json 报文
# spring-boot-message-format-xml
    请求响应报文格式
    form/xml 请求返回 xml/json 报文

# spring-boot-actuator
    actuator是spring boot提供的对应用系统的自省和监控的集成功能，可以对应用系统进行配置查看、相关功能统计等
    自动配置(auto-configuration)
    一项简化配置的功能，比如在classpath中发现有spring security的jar包，则自动创建相关的bean等

# spring-boot-web
    使用Thymeleaf模板引擎渲染web视图 --- web代码中使用的是该模板
    使用Freemarker模板引擎渲染web视图
    使用Velocity模板引擎渲染web视图

# spring-boot-jdbc
    使用jdbcTemplate直接链接

# spring-boot-jpa
    使用hibernate jpa    

# spring-boot-mybatis
    spring-boot-mybatis0 mybatis Application配置
    spring-boot-mybatis1 mybatis plus 配置使用
    spring-boot-mybatis2 mybatis plus druid配置使用
    spring-boot-mybatis3 mybatis plus druid 配置使用监控界面



# spring-boot-swagger-ui    

# spring-boot-security
    用户登陆，会被AuthenticationProcessingFilter拦截，调用AuthenticationManager的实现，而且AuthenticationManager会调用ProviderManager来获取用户验证信息（不同的Provider调用的服务不同，因为这些信息可以是在数据库上，可以是在LDAP服务器上，可以是xml配置文件上等），如果验证通过后会将用户的权限信息封装一个User放到spring的全局缓存SecurityContextHolder中，以备后面访问资源时使用。
 
    所以我们要自定义用户的校验机制的话，我们只要实现自己的AuthenticationProvider就可以了。在用AuthenticationProvider 这个之前，我们需要提供一个获取用户信息的服务，实现  UserDetailsService 接口
    用户名密码->(Authentication(未认证)  ->  AuthenticationManager ->AuthenticationProvider->UserDetailService->UserDetails->Authentication(已认证）

# spring-boot-devtool
    Spring DevTools介绍 ：http://blog.csdn.net/isea533/article/details/70495714

# spring-boot-filter


# spring-boot-cache

# spring-boot-intercepter
# spring-boot-junit
# spring-boot-logger


# spring-boot-command
# spring-boot-batch
# spring-boot-profile
# spring-boot-resttemplate






















starters(简化依赖)
这个比较关键，方便spring去集成各类组件，比如redis、mongodb等等。
    core(security、aop)
    web(web、websocket、ws、vaadin、rest、mobile)
    template(freemarker、velocity、groovy templates、thymeleaf)
    data(jdbc、jpa、mongodb、redis、gemfire、solr、elasticsearch)
    database(h2、hsqldb、mysql、postgresql)
    social(facebook、linkedin、twitter)
    io(batch、integration、jms、amqp)
    ops(actuator、remote shell)
CLI(command-line interface),支持groovy开发
Actuator(对应用系统本身的自省功能)
这个有点devops的味道，使得应用程序本身可以做到自省，比如查看系统运行了多少线程，gc的情况，运行的基本参数等等
