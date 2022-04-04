# Spring/SpringBoot Notes
<hr>

## Project Structure
    project-root-directory
    └──src
    │  └──main
    │  │  └──java
    │  │    └── com
    │  │       └── codeup
    │  │         ├── controllers
    │  │         ├── repositories
    │  │         └── services
    │  └──resources
    │     └──static
    │     │   ├── css
    │     │   ├── img
    │     │   ├── js
    │     └──templates
    │         ├── partials
    │         ├── index.html
    │     ├──application.properties
    │     └──example.properties
    └── target
    ├── .gitignore
    ├── pom.xml
    ├── mvnw
    ├── mvnw.cmd
    ├── README.md
    └── system.properties
<hr>

## Controllers
The first step in building our application will be to define a controller and define what routes the controller responds to. Luckily, Spring gives us a very easy way to do this. The following code defines a controller that responds to requests for /hello:

    @Controller
    class HelloController {
    
        @GetMapping("/hello")
        @ResponseBody
        public String hello() {
            return "Hello from Spring!";
        }
    }

### Annotations
Spring can be configured in a number of ways, and one of the easiest and most modern ways to do this is with annotations. We will be using annotations fairly extensively to configure our application, as opposed to the more traditional (and verbose) approach of XML-based configuration.

    @Controller: defines that our class is a controller
    @GetMapping: defines a method that should be invoked when a GET request is received for the specified URI
    @ResponseBody: tells Spring that whatever is returned from this method should be the body of our response

### Path Variables
Variables that are part of the URI of a request, as opposed to being passed as a query string, or as part of the request body. A URI is a uniform resource identifier while a URL is a uniform resource locator. Hence, every URL is a URI, abstractly speaking, but not every URI is a URL. Here is an example of a method that uses a path variable:

    @GetMapping("/hello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + "!";
    }
Notice that we can also use annotations in the definition of method parameters.

If the path variable we are looking for is not a string, we can simply define the parameter with a different type.

    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number + " plus one is " + (number + 1) + "!";
    }

Notice in the above example we also used the @RequestMapping annotation, which is just the longer version of @GetMapping. There, of course, also exists a @PostMapping annotation that tells the controller to respond to POST requests.