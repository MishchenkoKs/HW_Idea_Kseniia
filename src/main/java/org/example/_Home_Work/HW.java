package org.example._Home_Work;

public class HW {
    public static void main(String[] args) {
       // 1. Приведите десять типовых бизнес -процессов для предметной области ВИДЕО -ХОСТИНГ(Youtube),
               // а также их соответствие по CRUD.
        1. Добавление видео:Create
        2. Редактирование видео:Update
        3. Удаление видео:Delete
        4. Просмотр видео:Read
        5. Добавление комментария к видео:Create
        6. Редактирование комментария к видео:Update
        7. Удаление комментария к видео:Delete
        8. Просмотр списка подписчиков канала:Read
        9. Подписка на канал:Create
        10. Отписка от канала:Delete

       // Вывести название и стоимость товаров от 20 до 150 EUR:
        SELECT
        ProductName, Price
        FROM Products
        WHERE
        Price >= 20
        AND
        Price <= 150;

// Вывести телефоны поставщиков из Japan и Spain.

        SELECT
        Phone
        FROM Suppliers
        WHERE
                Country = 'Japan'
        OR
                Country = 'Spain';

// Вывести название и стоимость товаров от всех поставщиков, кроме поставщика 1.

        SELECT
        ProductName, Price
        FROM Products
        WHERE
        NOT SupplierID = 1;

// Вывести контактные имена клиентов, кроме тех, что из Germany и Brazil.

        SELECT
        ContactName
        FROM Customers
        WHERE
        Country NOT IN ('Germany' , 'Brazil');
    }
}
