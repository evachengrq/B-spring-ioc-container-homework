## Problem 2

分支：p2-starts-from-here

GreetingService 现在必须为 prototype scope，如何保证每次 GreetingController 的 greet() 方法被调用时都会创建新的 greetingService bean？

至少2种解决方法且GreetingController 仍为 singleton scope。

每种方案分别提交到单独的分支上，这些分支都需从 p2-starts-from-here 分出来，依次命名为 p2s1、p2s2即可。
 
附参考文章：https://www.baeldung.com/spring-inject-prototype-bean-into-singleton
