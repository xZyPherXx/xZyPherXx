
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Create Function </title>
</head>
<body>

        <?php
        function say_Hello() {
        
            echo "Hello PHP<br>";
        }
        ?>

        <h2> การเรียกฟังก์ชั่นครั้งที่ 1 : </h2>
        <?php
            say_Hello();
        ?>
    
        <hr/>
        <h2> การเรียกฟังก์ชั่นครั้งที่ 2 : </h2>
        <?php
            Say_Hello();
        ?>

        <hr/>
        <h2> การเรียกฟังก์ชั่นครั้งที่ 3 : </h2>
        <?php
            Say_hello();
        ?>

</body>
</html>