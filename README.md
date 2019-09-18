### AKKA
本项目主要记录、学习akka相关知识.
项目主要是用的gradle进行构建
#### 以下列出学习本项目的注意点，方便更好的理解与测试
* 每个大模块下都会有Launcher启动类，进行测试等

#### Quick Start
添加依赖
```
dependencies {
  compile group: 'com.typesafe.akka', name: 'akka-actor_2.12', version: '2.5.25'
}
```