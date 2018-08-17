https://dzone.com/articles/how-use-spring-resttemplate-0

rest endpoint and command line client in the same application.

step to test.
1. run server in tomcat: helloworld page pop

2. invoke curl: $> curl -X POST -H "Content-Type: application/json" -d '{ "user": "abc21", "name": "Justin" }' "http://localhost:8086/api/mcf8uy75"
received> {"name":"David Spale","user":"mcf8uy75"}
comment: working

3. Rightclick Main.java; run as java application. Invokes the 2 lines of code below: 
String url = "http://localhost:8086/api/INDIC"; //path variable  a/b/
User retObj = restTemplate.postForObject(url, reqObj, User.class);

4. switch to server console log
INFO : com.subra.rest.JsonController - Inside updateCustomer( ) and id = mcf8uy75
INFO : com.subra.rest.JsonController - Inside updateCustomer( )  data u1=User [user=abc21, name=Justin]

5. switch to client console log
INFO : com.subra.rest.client.Main - returned user=User [user=INDIC, name=David Spale]
client console: INFO : com.subra.rest.client.Main - returned user=User [user=INDIC, name=David Spale]
comments: working.
done
---------------------------
try to do other end points on this tutorial later. 


see spring integration example next.