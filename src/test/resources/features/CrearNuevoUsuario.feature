#language: es

@Historia
Característica: Crear un nuevo usuario en pagina utest.com
  como usuario quiero ingresar a la pagina utest.com
  para crear un nuevo usuario correcto

  Esquema del escenario: Crear un nuevo usuario de manera exitosa
    Dado que el usuario abre la url en el navegador
      | url   |
      | <url> |
    Cuando da clic en la opcion de registro
    Y diligencia el formulario de un nuevo usuario
      | nombre   | apellido   | correo   | mes   | dia   | ano   | ciudad   | codigoPostal   | pais   | sistemaoPerativo   | versionSistema   | lenguaje   | contrasena   | contrasen   |
      | <nombre> | <apellido> | <correo> | <mes> | <dia> | <ano> | <ciudad> | <codigoPostal> | <pais> | <sistemaoPerativo> | <versionSistema> | <lenguaje> | <contrasena> | <contrasen> |

    Entonces El usuario visualizara un mensaje de bienvenida
    Ejemplos:
      | url                    | nombre | apellido | correo              | mes   | dia | ano  | ciudad   | codigoPostal | pais     | sistemaoPerativo | versionSistema | lenguaje | contrasena | contrasen  |
      | https://www.utest.com/ | Carlos | Morales  | carlosm25@gmail.com | April | 20  | 1995 | Caucasia | 052410       | Colombia | Windows          | Windows 10     | Spanish  | Mario.1425 | Mario.1425 |