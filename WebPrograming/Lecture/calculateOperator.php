
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Calculate Form </title>
</head>
<body>

    <?php
        $number1 = $_POST['x'];
        $number2 = $_POST['y'];
        $operator = $_POST['operator'];

        echo "<p>";
        echo "<b> User Input </b><br />";
        echo "Number 1 : <i> $number1 </i> <br/>";
        echo "Number 2 : <i> $number2 </i> <br/>";
        echo "Operator : <i> $operator </i> <br/>";
        echo "Result : <i> ";

        if ($operator == "+") echo ($number1 + $number2) . " </i> <br/>";
        if ($operator == "-") echo ($number1 - $number2) . " </i> <br/>";
        if ($operator == "*") echo ($number1 * $number2) . " </i> <br/>";
        if ($operator == "/") echo ($number1 / $number2) . " </i> <br/>";
        if ($operator == "%") echo ($number1 % $number2) . " </i> <br/>";
    ?>
    
</body>
</html>