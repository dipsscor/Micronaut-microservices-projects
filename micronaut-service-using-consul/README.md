
## Micronaut Service using Consul
The sample service showing the Hashicorp Consul's Service Discovery and externalization of configuration capability through micronaut.
 

## Steps:

### spinning up the containers

    docker-compose up
    
### Check the service discovery on consul

    http://localhost:8500
    
### Run the Service API:

    http://localhost:11001/API/hello -- > Result : local-hello This is a Test API
    
The response has "Local-Hello" , since no key/values have been set in Consul key/value store


### create the key/values in Consul:

    1. Go to key/value
    2. Create folder /config # this is where micronaut looks for configurations
    3. Create folder /config/[service-name] --> /config/micronaut-service-using-consul.
    4. Create key/value -->test.key=Consul-Hello

### Restart the "micronaut-service-using-consul" service

### Run the Service API:

    http://localhost:11001/API/hello -- > Result : Consul-hello This is a Test API

## Command to create the app:
    mn create-app com.dipsscor.micronaut-service-using-consul --features config-consul,discovery-consul

    
    
