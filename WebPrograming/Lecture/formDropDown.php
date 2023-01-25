
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Drop Down Form </title>
</head>
<body>

    <h2> Drop Down Form </h2>

    <?php

        if (isset($_POST['confirm'])) {

            echo ' Personal ID : ' . $_POST['personalID'];
            echo '<br> Full Name : ' . $_POST['user'];
            echo '<br> Gender : ' . $_POST['sex'];
            echo '<br> Hobby : ' ;
            if (!empty($_POST['hobby'])) echo $_POST['hobby'];
            else echo 'Hobby not chosen.';

            echo '<br><a href="oneFormDropDown.php"> <input type="submit" value="Back To Form"> </a>';
        }
        else {

    ?>

        <form action="" method="post" name="dropDownForm" id="dropDownForm">

            Personal ID : <input type="text" name="personalID" maxlength="13" placeholder="Personal ID" required/><br/>
            Full Name : <input type="text" name="user" size="21" placeholder="Personal Name" required/><br/>
            Sex : 
            <select name="sex" >
                <option value="Male"/> Male 
                <option value="Female"/> Female 
            </select><br/>
            Hobby : <br>
            <select name="hobby" size="3" multiple>
                <option value="Play Game"/> Play Game 
                <option value="Hang Out"/> Hang Out 
                <option value="Read"/> Read
            </select><br/>
            <input type="submit" name="confirm" value="Confirm"/>
            <input type="reset" name="clear" value="Reset Data"/>

        </form>
    
    <?php

        }
    ?>

</body>
</html>