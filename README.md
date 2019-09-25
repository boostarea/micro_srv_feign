1. 不启用Ribbon负载均衡 (zuul -> hello server)
```
http://localhost:8079/api/server/rest/hello/server
```

2. 启用Ribbon负载均衡，(zuul/ribbon -> hello client/ribbon -> hello server)
```
http://localhost:8079/api/client/rest/hello/client
```