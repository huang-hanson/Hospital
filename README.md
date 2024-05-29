# Hospital
# 项目简介

尚医通即为网上预约挂号系统，网上预约挂号是近年来开展的一项便民就医服务，旨在缓解看病难、挂号难的就医难题，许多患者为看一次病要跑很多次医院，最终还不一定能保证看得上医生。网上预约挂号全面提供的预约挂号业务从根本上解决了这一就医难题。随时随地轻松挂号！不用排长队！

# 技术栈

## 后端技术

- SpringBoot：简化新Spring应用的初始搭建以及开发过程
- SpringCloud：基于Spring Boot实现的云原生应用开发工具，SpringCloud使用的技术：
  - Nacos注册中心
  - Feign
  - GateWay
- MyBatis-Plus：持久层框架
- Redis：内存缓存
  - 使用Redis作为缓存
  - 验证码有效时间、支付二维码有效时间
- RabbitMQ：消息中间件
  - 订单相关操作，发送mq消息 
- HTTPClient: Http协议客户端
- Swagger2：Api接口文档工具
- Nginx：负载均衡
- Lombok
- Mysql：关系型数据库
- MongoDB：面向文档的NoSQL数据库
  - 使用MongoDB存储 医院相关数据
- EasyExcel
  - 操作excel表格，进行读和写操作
 - 阿里云OSS
 - 阿里云短信服务
 - 微信登录/支付
 - 定时任务


## 前端技术

- Vue.js：web 界面的渐进式框架
- Node.js： JavaScript 运行环境
- Axios：Axios 是一个基于 promise 的 HTTP 库
- NPM：包管理器
- Babel：转码器
- Webpack：打包工具

## 其他

- Docker ：容器技术
- Git：代码管理工具

# 业务流程

![业务流程](https://user-images.githubusercontent.com/62464956/110754494-dc668e00-8282-11eb-8796-bafe40e99330.png)


# 服务架构

![服务架构](https://user-images.githubusercontent.com/62464956/110754536-e9837d00-8282-11eb-9b99-8ddbd87d1a14.png)
