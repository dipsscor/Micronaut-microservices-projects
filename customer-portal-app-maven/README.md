
## Customer-Portal-App
The sample customer portal app using the following features:

    micronuat federation
    Netflix eureka
    Netflix ribbon
    Netflix hystrix
    hybernate JPA
    swagger
    Zipkin
    redis


## Command to create the project

mn create-federation customer-portal-app --build maven --services com.dipsscor.account-management,com.dipsscor.customer-management,com.dipsscor.customer-account-management --features hibernate-jpa,discovery-eureka,netflix-ribbon,netflix-hystrix,micrometer-prometheus,junit,swagger-java,tracing-zipkin,redis-lettuce
    
    
