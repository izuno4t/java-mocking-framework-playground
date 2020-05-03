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

- [4.1 Running tests from Maven](https://jmockit.github.io/tutorial/Introduction.html#runningTests)

## Visual Studio Code

`settings.json` にテスト実行の設定を追記

```json
"java.test.config": {
    "vmargs": [ "-javaagent:/Users/izuno/develop/java/jmockit-1.49.jar"]
},
```

## リファレンス

- [JMockit](https://jmockit.github.io/index.html)
- [日本語訳](https://jmockit-ja.nyamikan.net/)
- [JMockit はじめの一歩](https://qiita.com/hitomatagi/items/95ba1bc6a630bac16f9e)
- [JMockit使い方メモ](https://qiita.com/opengl-8080/items/a49d4dae9067413ccdd6)
- [jmockit 1.48を使ってみる](https://qiita.com/mima_ita/items/4e48a24561960851e3fa)
- [JMockit と共に生きる者ためのメモ](https://qiita.com/tonluqclml/items/5111ef8985c450bce4ca)
- [JMockit 101](https://www.baeldung.com/jmockit-101)
- [JMockit Advanced Usage](https://www.baeldung.com/jmockit-advanced-usage)
- [JMockitのバージョンによるメソッド呼び出し確認方法の違い](https://www.dcom-web.co.jp/lab/java/difference_in_method_call_confirmation_by_the_jmockit_version)
- [JMockit - ユニットテストモックフレームワーク](http://itref.fc2web.com/java/jmockit/)
- [モックライブラリJMockitの初歩的な使い方](https://wiki.y-kurose.com/%E3%83%97%E3%83%AD%E3%82%B0%E3%83%A9%E3%83%9F%E3%83%B3%E3%82%B0/java/jmockit/%E3%83%A2%E3%83%83%E3%82%AF%E3%83%A9%E3%82%A4%E3%83%96%E3%83%A9%E3%83%AAjmockit%E3%81%AE%E5%88%9D%E6%AD%A9%E7%9A%84%E3%81%AA%E4%BD%BF%E3%81%84%E6%96%B9)
