
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

        $a = 76; $b = 16; $c = 56;
        $max = 0;
        if ($a > $b) {

            if ($a > $c) $max = $a;
            else $max = $c;
        }
        else {

            if ($b > $c) $max = $b;
            else $max = $c;
        }
        echo "Three Number : <b>$a, $b, $c </b><br/>";
        echo "Max value : <b>$max </b><br/>";

    ?>
    
</body>
</html>