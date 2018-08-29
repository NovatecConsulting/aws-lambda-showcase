# Welcome to our AWS Lambda showcase

---

# Agenda

-   Why serverless?
-   Create a simple function
-   Upload it manually
-   Provide API gateway
-   Setup a Travis CI pipeline
-   Make Travis upload the function
-   Add a path parameter to the function
-   Lessons learned

---

# Why serverless?

-   Speed
-   Don't have to do ops yourself
-   Cheaper (if you do it right)

---

# Create function code

---

## Create your function

-   package novatec
-   class Hello
-   function handleRequest(): String
    
For now, we will just return "Hello World!"
    
---

## Create Lambda function

-   We'll use the [Lambda Management Console](https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=1&cad=rja&uact=8&ved=2ahUKEwjgvJPZ6PPcAhUI2aQKHbnmB0EQFjAAegQICRAB&url=https%3A%2F%2Fconsole.aws.amazon.com%2Flambda%2Fhome&usg=AOvVaw2yrycDp_6fjYDa-4E9Hytx)
-   you can also use the [AWS CLI](https://docs.aws.amazon.com/cli/latest/reference/lambda/create-function.html)

---

# Upload the function manually

---

## Package the project in a fat jar/uberjar

-   A fat jar is necessary if you use external libraries,
    like the Kotlin runtime.
-   We use the Shadow plugin to run the shadowJar task.

---

## Upload the jar to AWS


---

## Set the code handler path

In our case: `novatec.Hello::handleRequest`

---

## Test it!

---

# Make it accessible to the rest of the world

---

## Create an API gateway

---

## Configure it for a plaintext response

---

### Just follow these easy steps
-   In "Integration Request": Uncheck "Use Lambda Proxy integration"
-   In "Method Response":
    -   Add Header "Content-Type"
    -   Add Response Model with Content type "text/plain" and Model "empty"

---

### ... and these
-   In "Integration Response":
    -   Add Mapping Value " 'text/plain' " to the Response Header "Content-Type"

        Note the single quotes!
    -   Change the Content-Type Mapping Template to "text/plain"
-   Don't worry, this was the annoying part.

---

## Test the API

---

## Deploy the API


---

## Call the API


---

# Set up Travis CI


---

## Use aws lambda CLI tool to update the function code


---

## Create a shell script to update the function code

---

## Run this shell script from our travis script

To make aws cli available:

    before_install:
     - pip install --user awscli
     - export PATH=$PATH:$HOME/.local/bin


---

## Set the AWS credentials for travis

---

## Make travis do the work for us

---

## The Hello World function is working!

What's next?

---

# Add an argument to the lambda function

---

## Modify the function code

---

## Configure the API gateway

---

## Another few easy steps...

-   Create a new resource that takes a path param
-   Note: Integration Request Mapping Template always receives JSON!
    To pass the parameter `name` to our function, we need the template:
    `"$input.params('name')"`

---

## Test the API

---

## Deploy the API


---

## Call the API


---

# Lessons learned


---

## It's fast

The development speed, at least.

When called at least every few minutes, it's also performant.

---

## It's hard to get started with the config

And there's a lot of config!


---

## There are fewer use cases than you might think


---

# Thanks!

# TODO 

-   Terminal light theme
-   org-mode -> reveal.js
-   2nd project to switch at the AWS credentials step
    -   That

