
<html>
<head><title> Reference Assignment </title></head>
<body>
    <?php
        $x = 123;
        $y = "abc";
        echo "$ x = "; echo $x; echo "<br />";
        echo "$ y = "; echo $y; echo "<br />";
        $x = &$y;
        echo "$ x = &$ y <br />";
        echo "$ x = "; echo $x; echo "<br />";
        echo "New value $ x<br />";
        $x = "php";
        echo "$ x = "; echo $x; echo "<br />";
        echo "$ y = "; echo $y; echo "<br />";
        echo "New value $ y<br />";
        $y = 100;
        echo "$ x = "; echo $x; echo "<br />";
        echo "$ y = "; echo $y; echo "<br />";
    ?>
</body>
</html>