# XMDonateLibrary
Библиотека для работы с сервисом XMDonate.

# Зависимости
- org.json.json v20211205

# Пример работы с библиотекой

«`{Java} {
import org.xmdonate.xmdonatelibrary.XMDonateLibrary;
import org.xmdonate.xmdonatelibrary.RequestActor;

import org.json.JSONObject;

public class MainApplication {
	private static final String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
	private static final String GROUP_ID = "YOUR GROUP ID";

    public static void main(String[] args) {
        RequestActor actor = new RequestActor(GROUP_ID, ACCESS_TOKEN); // Создание объекта с конфиденциальной информацией пользователя
		XMDonateLibrary library = new XMDonateLibrary(actor); // Создание экземпляра главного класса для работы с библиотекой
		JSONObject response = library.methods().donates().sort("top").execute() // Получаем список API-методов, выбираем donates, устанавливаем параметр sort, отправляем
		запрос методом execute
		
		System.out.println(response.toString()); // Выводим наш JSON на экран
    }
}
}«`
