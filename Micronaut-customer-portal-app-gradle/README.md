
## Customer-Portal-App
The sample customer portal app using the following features:

    micronuat federation
    Netflix eureka
    Netflix hystrix
    hybernate JPA
    swagger
    Zipkin
    redis
    
    
    
## Services

### Account-management: 

        URL : http://localhost:11001/swagger-ui
        
        
### Customer-management: 

        URL : http://localhost:12001/swagger-ui
        

### Customer-account-management: 

        URL : http://localhost:13001/swagger-ui
        
        
### Eureka:


        URL : http://localhost:8761
        
### Zipkin:


        URL : http://localhost:9411

        
        
## Command to create the project

mn create-federation customer-portal-app-gradle --services com.dipsscor.account-management,com.dipsscor.customer-management,com.dipsscor.customer-account-management --features hibernate-jpa,discovery-eureka,netflix-hystrix,micrometer-prometheus,junit,swagger-java,tracing-zipkin,redis-lettuce
    
    
