# Java UnitTest Example with JMockit

Playground JUnite testing with JMockit

- Java 11
- Maven 3
- JMockit 1.49
- Visual Studio Code

## JMockit を利用するための設定

### Maven

POMの `build > plugin` に `maven-surefire-plugin` を追加

```xml
<properties>
    <jmockit.version>1.49</jmockit.version>
</properties>
･･･
<plugin>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>2.22.2</version>
    <configuration>
        <argLine>
            -javaagent:"${settings.localRepository}"/org/jmockit/jmockit/${jmockit.version}/jmockit-${jmockit.version}.jar
        </argLine>
    </configuration>
</plugin>
```

## Visual Studio Code

`settings.json` にテスト実行の設定を追記

```json
"java.test.config": {
    "vmargs": [ "-javaagent:/Users/izuno/develop/java/jmockit-1.49.jar"]
},
```
