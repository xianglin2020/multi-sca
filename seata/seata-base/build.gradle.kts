plugins {
    id("multi.sca.java-library-conventions")
}

dependencies {
    api("com.alibaba.cloud:spring-cloud-starter-alibaba-seata")
    api("com.alibaba.cloud:spring-cloud-starter-alibaba-nacos-config")
    api("org.springframework.boot:spring-boot-starter-jdbc")
    api("com.mysql:mysql-connector-j:8.1.0")
}