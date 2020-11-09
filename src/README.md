## 主观题：
 @Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？

***
参考资料：https://stackoverflow.com/a/51238724

1. @Component auto detects and configures the beans using classpath scanning whereas @Bean explicitly declares a single bean, rather than letting Spring do it automatically.

    @Component通过扫描类的路径自动探测和装备beans，而@Bean是自己定义和声明beans。
    
2. @Component does not decouple the declaration of the bean from the class definition where as @Bean decouples the declaration of the bean from the class definition.

    @Component不能将bean的声明和类的定义解耦
    
3. @Component is a class level annotation whereas @Bean is a method level annotation and name of the method serves as the bean name.

    @Component是作用于类上，而@Bean作用于方法上，并且bean名等于方法名。
    
4. @Component does not need to be used with the @Configuration annotation whereas @Bean annotation has to be used within the class which is annotated with @Configuration.
    
    @Component不需要和@Configuration一起用，而@Bean需要用在有@Configuration的类里。
      
5. We cannot create a bean of a class using @Component, if the class is outside spring container whereas we can create a bean of a class using @Bean even if the class is present outside the spring container.
    
    如果一个类不在spring容器里，我们就没有办法用@Component，而@Bean可以。
    
6. @Component has different specializations like @Controller, @Repository and @Service whereas @Bean has no specializations.
    
    @Component可以按照功能细分，@Bean不能。
    
***
因为在以下几种情况，@Component不能用：
1. 类不在Spring Container中
2. 一个类中需要有多个beans
3. 需要实例化第三方的类时