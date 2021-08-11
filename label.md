В продолжение вчерашнего. Теперь у нас есть вот такие метки.

![наши метки](https://i.ibb.co/311h0wg/Screenshot-from-2021-08-03-14-26-07.png)

Метки к PullRequests указывать **обязательно**, если метка не указана, то слияние будет заблокировано.
Метки делятся на 5 категорий:
 * `bug` - если вы нашли баг или обрабатываете его, то вы ставите эту метку. Когда обработали, эту метку убираете и ставите метку `fix`;
 * `feature` - если вы добавляете новую фичу, то вы ставите эту метку;
 * `fix` - фиксили фиксили и наконец пофиксили, тыкаем эту метку;
 * `tests` - при написании новых тестов тыкаем эту метку;
 * `skip-changelog` - если вы не хотите, чтоб данный ПР попал в ченжлог версии, тыкаем эту метку.

Комбинировать метки **нельзя**. Если вы писали новую фичу и написали к ней юнит тесты то вы молодец, ставим метку `feature`. Метку `tests` можно ставить, только если тесты идут отдельным ПРом.

Теперь просьба, все свои уже заапрувленные ПРы и те которые сейчас висят на ревью, оформить метками, мб скоро релиз выкатим. Метки выбираютсялибо как на скрине, либо при создании.

![тут](https://i.ibb.co/Xxwpfns/Sva-LX4-JWV80.jpg)

Ах да, чуть не забыл, все вышеперечисленное относится только к репозиториям `projector-client` и `projector-server`.
