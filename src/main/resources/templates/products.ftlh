<!DOCTYPE html>
<html>
<head>
    <title>cliffMarket.com</title>
</head>
<body>
<h1>CliffMarket</h1>
<h4>Товары со всей России!</h4>
<#list products as product>
    <div>
        <p><b>${product.title}</b></p><br>
        <p>${product.price}</p><br>
        <a href="/products/${product.id}">Подробнее</a>
    </div>
</#list>
<hr>
<h3>Создать новый товар</h3>
<form action="/products/create" method="post">
    Название объявления: <input type="text" name="title"/><br><br>
    Описание: <input type="text" name="description"/><br><br>
    Город: <input type="text" name="city"/><br><br>
    Имя: <input type="text" name="author"/><br><br>
    Цена: <input type="text" name="price"/><br><br>
    <input type="submit" value="Добавить товар"/>
</form>
</body>
</html>