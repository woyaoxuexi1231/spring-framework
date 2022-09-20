spring-aop 模块
面向切面编程时使用。Spring通过"横切"的方式将贯穿于多业务中的公共功能独立抽取出来，形成单独的切面，并指定切面的具体动作，在需要使用该功能时，动态地将该功能切入到需要的地方。

spring-aspects 模块
用来实现 AspectJ 框架的集成。而AspectJ是一个通过对 java 扩展出之后的框架，框架里面定义了AOP 的语法，通过特殊的编译器完成编译期间的代码织入，最后生成增强之后的 Class 文件。

spring-beans 模块
完成 Spring 框架的基本功能，里面定义了大量和 Bean 有关的接口，类及注解。例如：bean 定义的顶层接口 BeanDefinition、bean 装配相关的注解  Autowired/Qualifier/Value、用来创建 bean 的工厂接口 BeanFactory 及一些具体的工厂方法等。

spring-context 模块
用来实现 Spring 上下文功能，及 Spring 的IOC，例如初始化Spring容器时所使用的ApplicationContext 接口及常用的抽象实现类 AnnotationConfigApplicatoinContext 或者ClasspathXmlApplicationContext 等。

spring-context-indexer 模块
用来创建Spring应用启动时候选组件的索引，以提高应用的启动速度。通常情况下，应用启动的时候会去扫描类路径下的所有组件，但是如果组件特别多，会导致应用启动特别缓慢。该模块可以在应用的编译器对应用的类路径下的组件创建索引，在启动的时候通过索引去加载和初始化组件，可以大大提升应用启动的速度。

spring-context-support 模块
用来提供 Spring 上下文的一些扩展模块，例如实现邮件服务、视图解析、缓存(定义了对下面几种缓存的支持：caffeine,ehcache,jcache)、定时任务调度等。

spring-core 模块
Spring 的核心功能实现，例如：控制反转(IOC)、依赖注入(DI)、asm 以及 cglib 的实现。

spring-expression 模块
提供 Spring 表达式语言的支持，SPEL。

spring-framework-bom 模块
通过该模块，可以解决 Spring 中的模块与其他框架整合时产生 jar 包版本的冲突，默认为空实现。

spring-instrument 模块
实现 Spring 对服务器的代理接口功能实现，实现的是类级别或者 ClassLoader 级别的代理功能。

spring-jcl 模块
通过适配器设计模式实现的一个用来统一管理日志的框架，对外体统统一的接口，采用"适配器类"将日志的操作全部委托给具体的日志框架，提供了对多种日志框架的支持。

spring-jdbc 模块
Spring 对JDBC(Java Data Base Connector)功能的支持，里面定义了用于操作数据的多种API，常用的即：JdbcTemplate，通过模板设计模式将数据库的操作和具体业务分离，降低了数据库操作和业务功能的耦合。

spring-jms 模块
对 Java 消息服务的支持，对 JDK 中的 JMS API 进行了简单的封装。

spring-messaging 模块
实现基于消息来构建服务的功能。

spring-orm 模块
提供了一些整合第三方 ORM 框架的抽象接口，用来支持与第三方 ORM 框架进行整合，例如：MyBatis，Hibernate，Spring JPA 等。

spring-oxm 模块

Spring 用来对对象和 xml（Object/xml）映射的支持，完成xml和object对象的相互转换。

spring-test 模块
Spring 对 Junit 测试框架的简单封装，用来快速构建应用的单元测试功能及 Mock 测试。

spring-tx 模块
Spring 对一些数据访问框架提供的声明式事务或者编程式事务（通过配置文件进行事务的声明）的支持。例如：Hibernate，MyBatis，JPA 等。

spring-web 模块
用来支持 Web 系统的功能。例如：文件上传，与JSF的集成，过滤器Filter的支持等。

spring-webflux 模块
Spring5 中新增的一个通过响应式编程来实现 web 功能的框架。内部支持了reactive和非阻塞式的功能，例如可以通过tcp的长连接来实现数据传输。webmvc 的升级版，webmvc 是基于 servlet的，而 webflux 是基于 reactive 的。

spring-webmvc 模块
用来支持 SpringMVC 的功能，包括了和 SpringMVC 框架相关的所有类或者接口，例如常用的DispatcherServlet、ModelAndView、HandlerAdapto r等。另外提供了支持国际化、标签、主题、FreeMarker、Velocity、XSLT的相关类。注意：如果使用了其他类似于 smart-framework 的独立MVC框架，则不需要使用该模块中的任何类。

spring-websocket 模块
Spring 对 websocket 的简单封装，提供了及时通信的功能，常用于一些即时通讯功能的开发，例如：聊天室。
