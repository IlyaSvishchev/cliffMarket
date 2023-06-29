<!DOCTYPE html>
<html>
<head>
    <title>cliffMarket.com</title>
</head>
<body>
<h1>CliffMarket</h1>
<h4>Подробная информация</h4>
    <div>
        <p>Название товара: <b>${product.title}</b></p><br>
        <p>Описание товара: <b>${product.description}</b></p><br>
        <p>Цена: <b>${product.price}</b></p><br>
        <p>Город: <b>${product.city}</b></p><br>
        <p>Автор: <b>${product.author}</b></p><br>

    </div>
<hr>
<h3>Создать новый товар</h3>
<form action="/products/delete/{product.id}" method="post">
    <input type="submit" value="Удалить товар"/>
</form>
</body>
</html>