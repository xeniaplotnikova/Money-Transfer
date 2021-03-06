**КРАТКОЕ ОПИСАНИЕ**

01.04.2020 - 01.04.2020 было проведено ручное тестирование приложения Money Transfer.

На тестирование затрачено: 00:10:00

***В результате тестирования выявлены следующие дефекты:***

Ошибка при пополнении счета клиента, вероятно потому, что сумма на счету после перевода превышает значение 2_147_483_647, что не может обслуживаться типом данных int. 

Отрицательная сумма счета в результате пополнения счета клиента

Ссылка на описание ошибки:

https://github.com/xeniaplotnikova/Money-Transfer/issues/1


**ОПИСАНИЕ ПРОЦЕСА ТЕСТИРОВАНИЯ**

В процессе тестирования использовались следующие артефакты:

1. Входные данные

  - Текущий баланс счёта клиента - переменная типа int, значение - 2_000_000_000 (два миллиарда рублей)*
  - Сумма перевода - переменная типа int, значение - 500_000_000 (пятьсот миллионов рублей)
  - Переменная для хранения итогового значения - тип int

2. IntelliJ IDEA - интегрированная среда разработки ПО

***В качестве тестовых данных использовались данные:***

Информация об исходной сумме на проверяемом счете (2 000 000 000 - два миллиарда рублей)
Информация о сумме для перевода на проверяемый счет (500 000 000 - пятьсот миллионов рублей)

Источник: https://github.com/netology-code/javaqa-homeworks/tree/master/programming

***Тестирование производилось в следующем окружении:***

Windows 10 Pro, версия 1903; Firefox 73.0.1 (32-битный), последняя версия
IntelliJ IDEA 2019.3.4
GitBush, Git version 2.26.0

