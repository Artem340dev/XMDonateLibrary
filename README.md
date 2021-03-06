# XMDonateLibrary
Библиотека для работы с сервисом XMDonate.

## Зависимости
### Maven:

```xml
<dependencies>
    <dependency>
        <groupId>org.json</groupId>
        <artifactId>json</artifactId>
        <version>20211205</version>
    </dependency>
 </dependencies>
```

## Пример работы с библиотекой
```java
import org.xmdonate.xmdonatelibrary.XMDonateLibrary;
import org.xmdonate.xmdonatelibrary.RequestActor;

public class Main {
    private static final String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
    private static final String GROUP_ID = "YOUR GROUP ID";

    public static void main(String[] args) {
        RequestActor actor = new RequestActor(GROUP_ID, ACCESS_TOKEN); // Создание объекта с конфиденциальной информацией пользователя, необходим для отправки запросов на сервер.
        XMDonateLibrary library = new XMDonateLibrary(actor); // Создание экземпляра главного класса для работы с методами для отправки запросов на сервер.
        
        JSONObject response = library.methods().donates().sort("top").execute(); // Создаём новый запрос на сервер с методом donates, добавляем в запрос параметр sort и отправляем его на сервер методом execute.
        System.out.println(response.toString()); // Выводим структуру JSON, которую нам вернул сервер, на экран
    }
}
```
