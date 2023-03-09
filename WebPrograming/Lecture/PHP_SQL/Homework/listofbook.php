
<html>

    <head>

        <title>Update Table Book</title>

    </head>

    <body>

        <?php

            $hostname = "localhost";
            $username = "root";
            $password = "";
            $dbname = "bookstoreeiei";
            $conn = mysqli_connect($hostname, $username, $password, $dbname);

            if (!$conn) die("ไม่สามารถติดต่อกับ MySQL ได้");

            if ($conn->connect_error) die("Connection failed: " . $conn->connect_error);

            mysqli_query($conn,"SET character_set_results=tis620");
            mysqli_query($conn,"SET character_set_client=tis620");
            mysqli_query($conn,"SET character_set_connection=tis620");
    
            $text = "SELECT * FROM book order by BookID";
            $result = mysqli_query($conn, $text);

            echo "<CENTER><H3>รายชื่อหนังสือ</H3></CENTER>";
            echo "<table width=\"400\" border=\"0\" bordercolor=\"D1D7DA\" ";
            echo "align = \"center\" valign = \"top\" >";
            echo " <br><b><tr align=\"center\" bgcolor=\"#ffff\">";
            echo "<td width =\"30\" align=\"center\">ลำดับ</font></td>";
            echo "<td width =\"100\" align=\"center\" >รหัสหนังสือ</td>";
            echo "<td align=\"center\" width = \"200\">ชื่อหนังสือ</td>";
            echo "<td align=\"center\" width =\"80\" >ลบ</a></font></td>\n</b>";
            $a = 1;

            while ($rs = mysqli_fetch_array($result)) {
                echo "<tr align=\"center\" bgcolor=\"#AAAAAA\">";
                echo "<td align=\"center\" bgcolor =\"#dfdfdf\">$a</td>";
                echo "<td align=\"center\"> ";
                echo "<a href=\"detailbook.php?id=$rs[0]\">$rs[0]</a></td>";
                echo "<td align=\"center\">$rs[1]</td>";
                echo "<td align=\"center\"> <a href=\"deletebook.php?id=$rs[0]\" ";
                echo "onclick=\"return confirm(' ยืนยันการลบข้อมูลหนังสือ $rs[1] ')\">[ลบ] ";
                echo "</a></font></td>\n";
                $a++;
            }
            ?>
    
            </tr>
            </table><BR><BR>

            <div align="center"> <A HREF="addbook.php">เพิ่มรายการหนังสือ</A></div><br><br><br>

            <?php

                mysqli_close($conn);

            ?>

    </body>

</html>