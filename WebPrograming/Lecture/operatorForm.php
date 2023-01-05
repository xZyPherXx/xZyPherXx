
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Operator </title>
</head>
<body>

    <form method="post" action="calculateOperator.php">
        <table border="1" align="center" width="500">
            <tr>
                <td colspan="2" align="center"> <big> Test Arithmatic Operator </big> </td>
            <tr>
            <tr>
                <td> Enter Number 1 : </td>
                <td><input type="text" name="x" size="15" value=""/></td>
            </tr>
                <td> Enter Number 2 : </td>
                <td><input type="text" name="y" size="15" value=""/></td>
            </tr>
            <tr>
                <td> Operator : </td>
                <td align="center">
                    <input type="radio" name="operator" value="+"> + <br>
                    <input type="radio" name="operator" value="-"> - <br>
                    <input type="radio" name="operator" value="*"> * <br>
                    <input type="radio" name="operator" value="/"> / <br>
                    <input type="radio" name="operator" value="%"> % <br>
                </td>
            <tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" name="submit" value="Confirm"/>
                    <input type="reset" name="reset" value="Clear"/>
                </td>
            </tr>
        </table>
    </form>

</body>
</html>