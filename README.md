# About
This is an example project that illustrates creating a RESTful API has Security (OAuth 2.0) in Spring Boot. However, Security is not completed yet.

# Runnning this project
<code>mvn spring-boot:run</code>

# Get token
<code>curl -X POST --user 'kayroc:secret' -d 'grant_type=password&username=jim@domain.com&password=password' http://localhost:8080/oauth/token</code>

# Example commands
<p>Getting specific item by itemId:</p>
<p>GET: /api/item/{id}</p>

<code>curl -X GET -H "Authorization: Basic amltQGRvbWFpbi5jb206cGFzc3dvcmQ=" -H "Cache-Control: no-cache" -H "Postman-Token: 37ad3b1c-c257-12ff-e1a1-180d1c27e92c" "http://localhost:8080/api/item/1?access_token=60962f09-7866-4857-b998-a0b82b2cffe5"</code>

<p>Getting all items:</p>
<p>GET: /api/item/</p>

<code>curl -X GET -H "Authorization: Basic amltQGRvbWFpbi5jb206cGFzc3dvcmQ=" -H "Cache-Control: no-cache" -H "Postman-Token: b2cd4765-8edb-aeb4-d7f5-45b17721e03b" "http://localhost:8080/api/item?access_token=60962f09-7866-4857-b998-a0b82b2cffe5"</code>

<p>Ordering an item by passed json obj:</p>
<p>POST: /api/item/order/</p>

<code>curl -X POST -H "Content-Type: application/json" -H "Authorization: Basic amltQGRvbWFpbi5jb206cGFzc3dvcmQ=" -H "Cache-Control: no-cache" -H "Postman-Token: aab5f79e-ed12-6e9e-cbed-4efa22c657b6" -d '{
	 "userName" : "Ekrem",
	 "itemId": 1,
	 "numberOfItems": 3
   }' "http://localhost:8080/api/item/order?access_token=60962f09-7866-4857-b998-a0b82b2cffe5"</code>
