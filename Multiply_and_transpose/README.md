# Умножай и транспонируй!

Школьники из объединения КРОШ (Клуб Решателей Олимпиад Школьников) готовятся к участию в треке ML. 
Начать подготовку они решили с изучения линейной алгебры. 
Выяснилось, что существует две интересные операции над матрицами - умножение и траспонирование. 
Они составили много примеров и решают их на листике, однако им нужна помощь в проверке результатов. 
Напишите программу, которая по заданным матрицам A и B вычисляет:
(A × B)^T,где A — матрица размером n×m, а B — матрица размером m×k.

## Формат ввода:
В первой строке вводятся 3 числа n, m, k(1 <= n, m, k <= 100).
Далее следует n строк по m чисел - элеметы матрицы А.
Затем вводятся m строк по k чисел в каждой - элементы матрицы B.

## Формат вывода:
Выведите матрицу результата операции (A × B)^T