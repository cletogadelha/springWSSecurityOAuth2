# springWSSecurityOAuth2

Passos para execução:

1 - executar o "gradlew.bat" 

2 - digitar "gradlew clean build bootRun" 

3 - Done!



curl http://localhost:8080/rest/colaborador - ERRO!

curl -X POST -vu clientapp:springSecurity http://localhost:8080/oauth/token -H "Accept: application/json" -d "password=admin&username=admin&grant_type=password&scope=read%20write&client_id=clientapp" - Recuperar o {acess_token}

curl http://localhost:8080/rest/colaborador -H "Authorization: Bearer 5df3253c-a221-4329-b5a1-cb637f2afd2d(TOKEN_RECUPERADO)" - Acesso permitido

