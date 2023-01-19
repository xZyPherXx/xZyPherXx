
<?php

    function add($a , $b) {

        return $a + $b;
    }

    function subTract($a , $b = 50) {

        echo "Result Subtract : " . $a - $b . "<br>";
    }

    function multiply($a , $b , &$result) {

        $result = $a * $b;
    }

    $num1 = 20;
    $num2 = 10;
    $resultMul = 0;

    echo "Result Add : " . add($num1 , $num2) . "<br>";

    subTract($num1 , $num2);
    subTract($num1);

    multiply($num1, $num2, $resultMul);
    echo "Result Multiply : " . $resultMul . "<br>";
?>