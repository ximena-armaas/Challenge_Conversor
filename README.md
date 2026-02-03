# Challenge_Conversor
Claro ✨ Aquí tienes un **README** claro, ordenado y listo para GitHub, escrito en **Markdown**:

---

# 💱 Conversor de Monedas en Java

Este proyecto es un **conversor de monedas** desarrollado en **Java**, que utiliza la API de **ExchangeRate API** para obtener tasas de cambio actualizadas entre distintas divisas.
El usuario puede seleccionar una moneda base, una moneda destino e ingresar un monto para realizar la conversión de manera sencilla y segura.

## 🚀 Funcionalidades

* Conversión entre múltiples monedas soportadas por la API.
* Entrada de datos personalizada:

  * Moneda base
  * Moneda a convertir
  * Monto a convertir
* Validaciones para manejar:

  * Monedas no válidas
  * Entradas vacías o incorrectas
  * Montos inválidos
* Consumo de API externa para tasas de cambio actualizadas.
* Almacenamiento del historial de conversiones en un archivo **JSON**.
* Manejo de datos JSON utilizando la librería **Gson**.

## 🛠️ Tecnologías utilizadas

* **Java**
* **ExchangeRate API**
  👉 [https://www.exchangerate-api.com/docs/supported-currencies](https://www.exchangerate-api.com/docs/supported-currencies)
* **Gson** (para parseo y manejo de JSON)
* **JSON** (almacenamiento de conversiones)

## 📦 Instalación y configuración

1. Clona este repositorio:

   ```bash
   git clone https://github.com/tu-usuario/tu-repositorio.git
   ```
2. Abre el proyecto en tu IDE favorito (IntelliJ, Eclipse, VS Code, etc.).
3. Asegúrate de tener configurado **Java JDK**.
4. Agrega la librería **Gson** al proyecto (si no está incluida).
5. Configura tu **API Key** de ExchangeRate API en el proyecto.

## ▶️ Uso

1. Ejecuta la aplicación.
2. Ingresa:

   * La moneda base (ej. `USD`)
   * La moneda destino (ej. `MXN`)
   * El monto a convertir
3. El sistema mostrará el resultado de la conversión.
4. La conversión se guardará automáticamente en un archivo JSON.

## ✅ Validaciones implementadas

* Verificación de monedas soportadas por la API.
* Control de errores en entradas del usuario.
* Manejo de respuestas inválidas o fallidas de la API.

## 📁 Almacenamiento de datos

Las conversiones realizadas se guardan en un archivo **JSON**, permitiendo llevar un registro histórico de las operaciones realizadas por el usuario.

## 📚 API utilizada

* **ExchangeRate API**
* Documentación oficial:
  [https://www.exchangerate-api.com/docs/supported-currencies](https://www.exchangerate-api.com/docs/supported-currencies)

## 📄 Licencia

Este proyecto es de uso educativo y puede ser modificado libremente.


Solo dime 😉
