
## Micronaut Service Api versioned
The sample service showing the API versioning capability through micronaut.
 
    micronaut:
      router:
        versioning:
          enabled: true
          default-version: 3 ## Default version of the API
          parameter:         ## Enables API version to be sent as request param
            enabled: true
            names:           ## Names that can be used as request params like "v","api-version"(default)
            - 'v'
            - 'api-version'
          header:            ## Enables API version to be sent as request header
            enabled: true
            names:           ## Names that can be used as header params.
            - 'X-API-VERSION'
            - 'Accept-Version'
            
            
By default Micronaut has 2 out-of-the-box strategies for resolving the version that are based on an HTTP header named X-API-VERSION or a request parameter named api-version, however this is configurable. A full configuration example can be seen below:

    
    
