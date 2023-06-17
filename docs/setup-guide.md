# Guía de configuración

## Configuración de Java

Una vez descargado el código del repo, lo más importante es descargar en IntelliJ la versión 17 de java y dejarla
configurada en el proyecto dentro del IDE.

Para ello, vamos a **File > Project Structure** y hacemos click en **SDK - Add SDK > Download JDK**. Seleccionamos
**Version 17, Amazon Coretto 17.0.7** y le damos a download.

En la ventana anterior (**Project Structure**) marcamos el **language level** a 17 (para que no muestre errores el IDE) 
si no se marca por defecto.

## Uso de Maven

Si no sabes encontrar dónde instala IntelliJ Maven o cómo configurarlo como variable de entorno, lo más fácil es que
uses la ventana de Maven de IntelliJ para ejecutar los comandos. Lo único a tener en cuenta es que hay que cambiar las
comillas de los comandos Por ejemplo, el comando:

```bash
mvn clean compile exec:java -Dexec.mainClass="es.uniovi.dlp.commandline.CLI" -Dexec.args="examples/codegeneration/offsets/simple.xana --introspector"
```

**Se ejecutaría de la siguiente manera**:

```bash
mvn clean compile exec:java -Dexec.mainClass=es.uniovi.dlp.commandline.CLI "-Dexec.args=examples/codegeneration/offsets/simple.xana --introspector"
```

Fijarse en que ``-Dexec.mainClass`` no lleva comillas y que las comillas del otro argumento empiezan antes.