# spring-security-boot
Spring Boot + Spring Security Based Authetication + MySql

localhost:9092/

You have to generate password using SecurityConfiguration.java file.

password = "secret"

mysql> select * from user;
+----------+--------+----------------------------------------------------------------------------------+-----------+---------------+------------------+
| username | email  | password                                                                         | activated | activationkey | resetpasswordkey |
+----------+--------+----------------------------------------------------------------------------------+-----------+---------------+------------------+
| admin    | admin  | 43a4d912b0f692109e21c07d7e0f32da45a183636ee6dad9813e74c51d8eba028a71fac3fc83c49f |         0 | NULL          | NULL             |
| admin1   | admin1 | 43a4d912b0f692109e21c07d7e0f32da45a183636ee6dad9813e74c51d8eba028a71fac3fc83c49f |         0 | NULL          | NULL             |
+----------+--------+----------------------------------------------------------------------------------+-----------+---------------+------------------+

You can login with admin1 and secret.
