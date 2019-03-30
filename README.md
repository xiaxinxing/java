# springboot Study


最近在学习spring boot和springcloud相关知识

找寻网上一些资料 配置的是springboot2.1.1和springcloud微服务之间的调用  学习学习








#win下启动 apache rocketMQ      


1，下载rocketmq 
http://rocketmq.apache.org/release_notes/release-notes-4.3.0/


2，安装解压


3.配置ROCKETMQ_HOME环境变量


4.配置jvm大小   mqnameserver.cmd        mqbroker.cmd   修改jvm 大小

5启动  start nameserver.cmd         start mqbroker.cmd -n 127.0.0.1:9876 autoCreateTopicEnable=true     端口跟  是否能够创建主题

几种常见错误

问题1 （1）Invalid maximum direct memory size: -XX:MaxDirectMemorySize=15g
修改15g的大小,改为小点的   

问题2 （2）找不到或无法加载主类   将上面 cmd里 配置     set "JAVA_OPT=%JAVA_OPT% -cp %CLASSPATH%" 

问题3 闪退回命令行    删除C:\Users\”当前系统用户名”\store下的所有文件。

