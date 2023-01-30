Java Maven Wrapper Demo
=====================

由于当前的maven 3.8.1之后屏蔽了http协议的repo，有时候不方便。

我们可以通过生成一个wrapper来指定旧版本的maven，比如`3.6.3`。

```
brew install maven
mvn wrapper:wrapper -Dmaven=3.6.3
```

将会在当前目录下生成`mvnw`与`mvnw.cmd`供使用。

```
./mvnw clean package
```

将会下载并使用3.6.3的maven

## 注意：
maven太瞎搞了！！！

- 3.6.3访问不了一些repo，因为它们使用的是http，但有些repo会自动屏幕这样的请求：
http://bits.netbeans.org/nexus/content/groups/netbeans/javax/xml/bind/jaxb-api/2.3.0-b161121.1438/jaxb-api-2.3.0-b161121.1438.pom
- 升级到3.8.1又会访问不了一些旧的http的repo
