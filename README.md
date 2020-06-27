项目启动时多环境配置的几种配置方式
1.通过修改配置文件中的profiles.active
2.通过命令行方式启动项目时指定运行环境：
 1) 测试过程中可通过修改ide中的启动参数：Program arguments：--spring.profiles.active=dev
 2) 打包后在服务器上启动项目时 ## java -jar spring-boot-test01-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev
3.虚拟机参数：
  VM options：-Dspring.profiles.active=dev
