# springWSSecurityOAuth2

Simple CRUD Back-End using Spring Boot, Security, Oauth2 and Data.

Execution Steps:

1 - execute "gradlew.bat"(Windows) or "gradlew"(Linux) 

2 - execute "gradlew clean build bootRun" on command line 

3 - Done!


Example: 

curl http://localhost:8080/rest/colaborador - ERROR!

curl -X POST -vu clientapp:springSecurity http://localhost:8080/oauth/token -H "Accept: application/json" -d "password=admin&username=admin&grant_type=password&scope=read%20write&client_id=clientapp" - Store the {acess_token}

curl http://localhost:8080/rest/collaborator -H "Authorization: Bearer 5df3253c-a221-4329-b5a1-cb637f2afd2d(Token stored)" - Access granted

