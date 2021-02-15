<?php
require_once("Car.php");
require_once("UberX.php");
require_once("UberPool.php");
require_once("Account.php");

$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND56"), "Chevrolet", "Spark");
$uberX->PrintDataCar();

$uberPool = new UberPool("CVB123", new Account("Andrea Ferran", "AND765"), "Dodge", "Attitude");
$uberPool->PrintDataCar();
?>

