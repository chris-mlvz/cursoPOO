<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        require_once("Car.php");
        require_once("Account.php");
        $car = new Car("AMS234", new Account("Andres Herrera", "ANDA876"));
        $car->printDataCar();
    ?>
</body>
</html>