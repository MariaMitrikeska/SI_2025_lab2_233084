# SI_2025_lab2_233084

Име: Maria
Презиме: Mitrikeska
Индекс: 233084

# 1. Control Flow Graph (CFG)

# 2. Цикломатска комплексност
Цикломатска комплексност = број на предикатни јазли (P) + 1 = 6 + 1 = 7

# 3. Тест случаи според Every Statement критериумот
Минимален број на тестови: 2
Тест случаи:
1: Листа: (пример за тест случај - Item("Milk", 1, 100, 0), Картичка: "1234567812345678" ) Се поминуваат сите, освен "if (allItems == null)"
2: Листа: (пример за тест случај - null, Картичка: било што ) - Се активира if (allItems == null) и фрла исклучок RuntimeException: allItems list can't be null!

# 5. Тест случаи според Multiple Condition критериумот
Минимален број на тест случаи е 4.
A: price>300	B: discount>0	C: quantity>10	Услов  	Објаснување
1	false        	false        	false	        false  	Ниту еден услов не важи
2	true	        false	        false       	true	  Само price > 300 е точно
3	false       	true	        false	        true   	Само discount > 0 е точно
4	false	        false	        true	        true  	Само quantity > 10 е точно

бидејќи е || (или) треба да се тестира секоја комбинација каде секој услов е True и False барем еднаш, така што се доволни 4 тест случаи.


