# SpringSecurity
SpringSecurity

User Authentication and Authorization on Spring Boot
To support both authentication and authorization in our application, we are going to:

1. implement an authentication filter to issue JWTS to users sending credentials,
2. implement an authorization filter to validate requests containing JWTS,
3. create a custom implementation of UserDetailsService to help Spring Security loading user-specific data in the framework,
4. and extend the WebSecurityConfigurerAdapter class to customize the security framework to our needs.


post localhost:9801/tasks

{
    "description": "Task 2"
}

post http://localhost:9801/users/sign-up

{
    "username": "sai",
    "password": "welcome1"
}

post http://localhost:9801/login
{
    "username": "sai",
    "password": "welcome1"
}
Bearer token is present in header

app start up
 #### In configure AuthenticationManagerBuilder
 #### end configure AuthenticationManagerBuilder
 #### In configure httpsecurity
 #### end configure httpsecurity
 #### In CorsConfigurationSource
 #### end CorsConfigurationSource
 
get /tasks 
 #### in doFilterInternal
 #### in getAuthentication
 #### end getAuthentication
 #### end doFilterInternal
 
 /login
  #### In attemptAuthentication
 #### end attemptAuthentication
 #### in loadUserByUsername
 #### end loadUserByUsername
 #### in successfulAuthentication
 #### end successfulAuthentication