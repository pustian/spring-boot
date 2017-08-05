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

请求响应报文格式。
# spring-boot-message-format
    json/form 请求返回 json 报文

# spring-boot-message-format-xml
    form/xml 请求返回 xml/json 报文

# spring-boot-actuator
    actuator是spring boot提供的对应用系统的自省和监控的集成功能，可以对应用系统进行配置查看、相关功能统计等

目前springboot最新的是1.3.2-SNAPSHOT版本。主要有如下功能：
    自动配置(auto-configuration)
    一项简化配置的功能，比如在classpath中发现有spring security的jar包，则自动创建相关的bean等

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
