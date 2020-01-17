# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.2.RELEASE/gradle-plugin/reference/html/)
* [Cloud Bootstrap](https://spring.io/projects/spring-cloud-commons)
* [Cloud LoadBalancer](https://cloud.spring.io/spring-cloud-static/spring-cloud-commons/current/reference/html/#spring-cloud-loadbalancer)

### Guides
The following guides illustrate how to use some features concretely:

* [Service Registration and Discovery](https://spring.io/guides/gs/service-registration-and-discovery/)
* [Routing and Filtering](https://spring.io/guides/gs/routing-and-filtering/)
* [Client-side load-balancing with Ribbon and Spring Cloud](https://spring.io/guides/gs/client-side-load-balancing/)
* [Using Spring Cloud Gateway](https://github.com/spring-cloud-samples/spring-cloud-gateway-sample)
* [Client-side load-balancing with Spring Cloud LoadBalancer](https://spring.io/guides/gs/spring-cloud-loadbalancer/)
* [Circuit Breaker](https://spring.io/guides/gs/circuit-breaker/)
* [Centralized Configuration](https://spring.io/guides/gs/centralized-configuration/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

# Spring Cloud Netflix Maintenance Mode

The dependencies listed below are in maintenance mode. We do not recommend adding them to
new projects:

*  Ribbon
*  Hystrix
*  Zuul
*  Hystrix Dashboard

The decision to move most of the Spring Cloud Netflix projects to maintenance mode was
a response to Netflix not continuing maintenance of many of the libraries that we provided
support for.

Please see [this blog entry](https://spring.io/blog/2018/12/12/spring-cloud-greenwich-rc1-available-now#spring-cloud-netflix-projects-entering-maintenance-mode)
for more information on maintenance mode and a list of suggested replacements for those
libraries.
