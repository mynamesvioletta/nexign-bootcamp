# nexign-bootcamp 

## Test cases | [tests.md](brt/src/test/test.md)

1. Авторизация

| Given | When | Then | Описание |
| :---- | :--- | :--- | :------- |
| Клиент с номером телефона и балансом 1 руб. | При авторизации клиента по номеру телефона | Сообщение о регистрации в кафку с последующей проверкой. | Когда вызывается метод authorizeClient из BrtService с определнными номерами телефонов Ожидается, что из базы данных будет взят соответствующий клиент. Для каждого пользователя с балансом больше 0 отправаляется запрос в hrs по кафке, тест проверяет, что запрос в кафку ушел по пользователю с номером телефона из запроса |

![image](https://user-images.githubusercontent.com/80278437/234098402-2b02d8f3-d610-46de-9ec3-723af8a4e8d2.png)

![image](https://user-images.githubusercontent.com/80278437/234099750-f6dfd03e-100e-49d4-934c-84f4d97ac9c3.png)
