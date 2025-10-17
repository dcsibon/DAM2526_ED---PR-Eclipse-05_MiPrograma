
## **PRÁCTICA 5 – Análisis de mi programa**

### 🎯 **Objetivo de la práctica**

Comprender el funcionamiento de un programa Java existente **sin ejecutarlo directamente**, utilizando las **herramientas de depuración de Eclipse**.
El alumno deberá **analizar, comentar y documentar** el código a partir de su comportamiento observado durante la depuración.

---

### **Pasos a seguir**

#### 1️⃣ Crear un nuevo proyecto

1. Abre Eclipse y selecciona el **workspace** habitual.
2. Crea un nuevo proyecto:

   * Menú `File → New → Java Project`
   * Nombre del proyecto: **Practica5**
   * Desactiva la opción *Create module-info.java file*
   * Pulsa **Finish**

---

#### 2️⃣ Crear el paquete

1. En el panel **Package Explorer**, haz clic derecho sobre `src` → `New → Package`
2. Escribe como nombre del paquete:

   ```
   tema2_debug
   ```
3. Pulsa **Finish**

---

#### 3️⃣ Importar el archivo `MiPrograma.java`

1. Descarga el fichero `MiPrograma.java` que se encuentra en este repositorio.
2. Clic derecho sobre el paquete `tema2_debug` → `Import...`
3. En la ventana de importación, selecciona:

   ```
   General → File System → Next
   ```
4. En **From directory**, selecciona la carpeta:

   ```
   Descargas
   ```

   (donde se encuentra `MiPrograma.java`)
5. Marca el archivo `MiPrograma.java` y pulsa **Finish**.

💡 Ahora el archivo debe aparecer dentro del paquete `tema2_debug` en el panel **Package Explorer**.

---

#### 4️⃣ Depurar el programa

⚠️ **No ejecutes el programa directamente** con “Run As”.
En esta práctica **solo se permite depurar**.

1. Coloca **breakpoints** (doble clic en el margen izquierdo del editor) en las líneas clave del programa.
2. Inicia la depuración con el icono **🐞 Debug** o `Run → Debug As → Java Application`.
3. Observa detenidamente:

   * ¿Qué variables cambian de valor?.
   * ¿En qué condiciones se repite la ejecución?.
   * ¿Qué hace exactamente el bucle principal?.
4. Comprueba el valor de las variables en la vista **Variables**.
5. Utiliza las opciones:

   * **F5 (Step Into)**
   * **F6 (Step Over)**
   * **F8 (Resume)**
     para avanzar paso a paso.

📄 **Objetivo**: identificar la finalidad del programa sin necesidad de ejecutar el código completo.

---

#### 5️⃣ Análisis y descripción del programa

Una vez finalizada la depuración, escribe un breve comentario (5-6 líneas) en el propio archivo `MiPrograma.java` explicando:

* Qué hace el programa.
* Qué sucede si el usuario introduce un número fuera del rango.
* Qué papel cumple el bucle principal.
* Qué variables intervienen en el control del programa.

---

#### 6️⃣ Insertar comentarios en el código

Una vez que ya sabes de que va el programa... incluye los comentarios del fichero comentarios.txt en el código.

Debes **ubicar estos comentarios en las líneas del código correspondientes**, según lo que hayas observado en la depuración.

---

#### 7️⃣ Entrega

* NO TIENE ENTREGA, vamos a corregirlo entre todos en clase.

---

¿Quieres que te añada también el contenido del fichero `MiPrograma.java` que les vas a entregar (con los comentarios eliminados y preparado para depurar)?
Así te dejo todo el material completo de la práctica: PDF + código fuente para compartir.
