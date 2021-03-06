package com.nevergetme.nevergetmeweb;


//import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

//import org.springframework.web.servlet.DispatcherServlet;


@EnableCaching
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 3600*24*10)
@SpringBootApplication
@ServletComponentScan(basePackages = "com.nevergetme.nevergetmeweb.*")
public class NevergetmewebApplication extends SpringBootServletInitializer {
//	@Bean
//	public Queue helloQueue(){
//		return new Queue("helloQueue");
//	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(NevergetmewebApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(NevergetmewebApplication.class, args);
	}
//	DispatcherServlet
//	AbstractXmlApplicationContext
//	XmlBeanDefinitionReader
//	DefaultBeanDefinitionDocumentReader
//	DefaultListableBeanFactory
//	AbstractXmlApplicationContext
//	ClassPathXmlApplicationContext
//	AbstractAutowireCapableBeanFactory
//	DefaultAdvisorAutoProxyCreator
//	AnnotationAwareAspectJAutoProxyCreator
//	ReflectiveMethodInvocation
//	JdkDynamicAopProxy
//	DefaultAopProxyFactory
//	AfterReturningAdviceInterceptor
}
