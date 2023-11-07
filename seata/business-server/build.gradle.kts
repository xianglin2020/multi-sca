plugins {
    id("multi.sca.java-common-conventions")
}

dependencies {
    implementation(project(":seata:seata-base"))
    implementation("org.springframework.cloud:spring-cloud-starter-loadbalancer")
    implementation("org.springframework.cloud:spring-cloud-starter-openfeign")
    implementation("org.springframework:spring-tx")
}