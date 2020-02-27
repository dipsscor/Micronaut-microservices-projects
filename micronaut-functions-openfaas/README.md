
# Micronaut functions on openFaas
OpenFaas is opensource project which allows you to run serverless functions on PAAS / CAAS platforms like docker Swarm, K8s , Openshift etc. It is similar to AWS Lambda functions.
 
For this project we will be using docker swarm.

# Setup:

## Initiate docker swarm
For single node /local m/c use docker swarm in single mode only.

    docker swarm init

For cluster Add nodes using join-nodes and token

## Initiate OpenFaas on Docker Swarm (without authorization)

    cd open-faas && ./deploy_stack.sh --no-auth

OpenFaas will be available at:

    http://localhost:8080/ui
    
    
## Create docker image of the functions

    $ cd add-number-function
    $ docker build -t add-number-function .
    
    $ cd substract-number-function
    $ docker build -t substract-number-function .
    
    $ cd multiply-number-function
    $ docker build -t multiply-number-function .

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

    docker stack rm func && docker secret rm basic-auth-user && docker secret rm basic-auth-password
    
    
## Bring down from Docker Swarm

    docker swarm leave --force  
    


## Command to create the apps:
    mn create-function com.dipsscor.substract-number-function --features openfaas
    
    mn create-function com.dipsscor.add-number-function --features openfaas
    
    mn create-function com.dipsscor.multiply-number-function --features openfaas

    
    
