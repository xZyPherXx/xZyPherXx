<html>

<head>
    <TITLE>Show Data Book</TITLE>
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

        mysqli_query($conn, "SET character_set_results=tis620");
        mysqli_query($conn, "SET character_set_client=tis620");
        mysqli_query($conn, "SET character_set_connection=tis620");

        $id = $_REQUEST['id'];
        $sql = "select * from book where BookID = $id";
        $result = mysqli_query($conn, $sql);
        $data = mysqli_fetch_array($result);
        $Path = "pictures/";
        $image = "<img src=$Path$data[Picture] valign=middle align = center width=\"80\" height = \"100\">";

        echo "<table border=1 align =center bgcolor=#FFCCCC>";
        echo "<tr><td align=center colspan = 2 bgcolor =#FF99CC><B>แสดงรายละเอียดหนังสือ</B></td></tr>";
        echo "<tr><td> รหัสหนังสือ : </td><td>" . $data["BookID"] . "</td></tr>";
        echo "<tr><td> ชื่อหนังสือ : </td><td>" . $data["BookName"] . "</td></tr>";
        echo "<tr><td> ประเภทหนังสือ : </td><td>" . $data["TypeID"] . "</td></tr>";
        echo "<tr><td> สถานะหนังสือ : </td><td>" . $data["StatusID"] . "</td></tr>";
        echo "<tr><td> สำนักพิมพ์ : </td><td>" . $data["Publish"] . "</td></tr>";
        echo "<tr><td> ราคาซื้อ : </td><td>" . $data["UnitPrice"] . "</td></tr>";
        echo "<tr><td> ราคาเช่า : </td><td>" . $data["UnitRent"] . "</td></tr>";
        echo "<tr><td> รูปภาพ : </td><td>" . $image . "</td></tr>";
        echo "<tr><td>จำนวนวันที่ยืมได้ : </td><td>" . $data["DayAmount"] . "</td></tr>";
        echo "<tr><td> วันที่จัดเก็บหนังสือ : </td><td>" . $data["BookDate"] . "</td></tr></table>";
    
    ?>
    <br><div align="center"> <A HREF="listofbook.php">กลับหน้าหลัก</A></div><BR>

</body>

</html>