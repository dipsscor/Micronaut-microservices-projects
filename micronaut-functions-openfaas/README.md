
# Micronaut functions on openFaas
OpenFaas is opensource project which allows you to run serverless functions on PAAS / CAAS platforms like docker Swarm, K8s , Openshift etc. It is similar to AWS Lambda functions.
 
For this project we will be using docker swarm.

# Setup:

## Initiate OpenFAAS on Docker swarm:
Start OpenFAAS following the documnetation of OpenFAAS repository:

    https://github.com/dipsscor/OpenFaas-Serverless-Framework
    
    
## Build the images:

    docker build -t <function-name> .
    
    
## Note:
Since Log4j is shipped with micronaut and has a compatibility issue with JDK 11 , therefore 'Multi-Release': true has been enabled in build file.

    jar {
        manifest {
            attributes 'Main-Class': mainClassName
            attributes 'Multi-Release': true

## Deploy images on OpenFaas:

    1. Open OpenFaas --> Deploy new function --> custom
    2. Add the docker image name . e.g "add-number-function:latest"
    3. Add the function name . e.g "add-number-function"
    4. click deploy.
    5. The functions are available at :
    
            http://<openfaas-url>/function/<function-name>
            
            e.g "http://localhost:8080/function/add-number-function"
    
## Test the function:

    1. Click the function on Openfaas.
    2. add the test data in the JSON tab like --> {"first_number":123,"second_number":23}
    3. invoke the function and see result.
    
    

# Teardown:

## Bring down from OpenFaas

    https://github.com/dipsscor/OpenFaas-Serverless-Framework
    


## Command to create the apps:
    mn create-function com.dipsscor.substract-number-function --features openfaas
    
    mn create-function com.dipsscor.add-number-function --features openfaas
    
    mn create-function com.dipsscor.multiply-number-function --features openfaas

    
    
