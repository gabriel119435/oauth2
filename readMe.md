<h1>Oauth2</h1>

Here we're using the same controller as in my previous [http basic project](https://github.com/gabriel119435/httpBasic/blob/master/src/main/java/httpBasic/GeneralController.java)

adding just this dependency:

	<dependency>
		<groupId>org.springframework.security.oauth.boot</groupId>
		<artifactId>spring-security-oauth2-autoconfigure</artifactId>
		<version>2.1.3.RELEASE</version>
	</dependency>

And we need to add this to the `application.yml`:

    security:
      oauth2:
        client:
          client-id: client
          client-secret: 123
          scope: anyScopeIWant

And with this we can access protected resources as shown below:

![oauth2 succeeded](https://i.imgur.com/ILrzEsI.gif)

