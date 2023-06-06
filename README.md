# Prueba de Automatización Front-end y API

Este repositorio contiene una solución para la automatización de pruebas front-end y API utilizando Java, Gradle, Screenplay, Serenity y Rest Assured. Se incluyen scripts de prueba automatizados para una página web y una API específicas.

# Problema 1 - Prueba de Automatización Front-end
 Descripción del escenario
 El script de prueba automatizado realiza las siguientes acciones en la página web https://demo.applitools.com/hackathonV2.html:

* Ingresa el nombre de usuario "testuser" en el campo de nombre de usuario.
* Ingresa la contraseña "testpassword" en el campo de contraseña.
* Hace clic en el botón "Iniciar sesión".
* Verifica que la página de inicio de sesión redirige a la página de la tabla de gastos https://demo.applitools.com/hackathonAppV2.html.
* Verifica que haya exactamente 6 transacciones en la tabla de gastos.
* Verifica el saldo total sea 350.
* Verifica el crédito disponible sea 17,800.
* Verifica que los valores positivos estén en verde.
* Verifica que los valores negativos estén en rojo.


# Problema 2 - Prueba de Automatización de API
Descripción del escenario
El script de prueba automatizado realiza las siguientes acciones en la API https://reqres.in/api/:

* Realiza una solicitud POST al endpoint "/users".
* Envía los siguientes datos en el cuerpo de la solicitud en formato JSON:
{
  "name": "Test User",
  "job": "Automation Engineer"
}

* Verifica que la respuesta tenga un código de estado HTTP 201.
* Extrae el ID del usuario recién creado de la respuesta y realiza una solicitud GET al endpoint "/users/{id}", donde "{id}" es el ID del usuario recién creado.
* Verifica que el código de estado HTTP de la respuesta sea 200 y que el nombre y el trabajo del usuario sean los mismos que los enviados en la solicitud POST.
* Genera pruebas de contrato.


# Para ejecutar la prueba de automatización front-end, sigue estos pasos:

* Clona este repositorio en tu máquina local.
* Asegúrate de tener GekoDriver instalado y actualizados.
* Asegúrate de tener Java JDK instalado.
* Abre una terminal o línea de comandos y navega hasta el directorio raíz del repositorio.
* Ejecuta el siguiente comando para ejecutar las pruebas:

