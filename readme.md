# LOGIN JAVA

## Funcionamiento

1. Ejecutar el programa desde el Main
2. Ejecuta una jframe con un botón seleccionar archivo
3. Permite escoger un archivo en el cual están los usuarios con su contraseña
4. Una vez seleccionado abre el inicio de sesión
5. Permite ingresar el usuario y la contraseña
6. Una vez ingresado el usuario y la contraseña de forma correcta se inicia el menú

## Consideraciones
1. El archivo de deber llamarse usuarios y tener extensión txt, de lo contrario el programa finalizará
2. El txt debe tener un usuario y contraseña separados por un espacio, de lo contrario el archivo no se aceptará y finalizará el programa.
3. La contraseña debe estar ya encriptada en el txt
4. Si se ingresa un usario que no existe el programa avisará
5. Al ingresar una contraseña incorrecta tres veces en un usuario, dicho usuario se bloqueará por 20 segundos y no podrá acceder al menú incluso ingresando la contraseña correcta.
6. Una vez ingresando el usuario y la contraseña correcta, el menú se iniciará.

## Diagrama de clases
[![Class-Diagram0.png](https://i.postimg.cc/zDFNCVD8/Class-Diagram0.png)](https://postimg.cc/grj1dc6T)