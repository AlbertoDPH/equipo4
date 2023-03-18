1 - Crear clase Serie con atributos: titulo, no. temporadas, entregado, genero y creador
- Por defecto, temporadas = 3, entregado = false
- El resto de atributos seran valores por defecto segun su tipo  de atributo ("hola" como titulo por defecto, por ejemplo)
- Generar constructor por defecto, constructor con titulo y creador, y constructor con todos los campos excepto entregado
- Generar getters, setters y toString, excepto del atributo entregado

2 - Crear clase Videojuego con atributos: titulo, horas estimadas, entregado, genero y compañia
- Por defecto, horas estimadas = 10, entregado = false
- El resto de atributos seran valores por defecto segun su tipo de atributo ("hola" como titulo por defecto, por ejemplo)
- Generar constructor por defecto, constructor con titulo y horas estimadas, y constructor con todos los campos excepto entregado
- Generar getters, setters y toString, excepto del atributo entregado

3 - Crear interfaz Entregable con los metodos siguientes
- entregar
- devolver
- isEntregado
- compareTo (Objeto a) (compara las horas estimadas entre videojuegos, y el numero de temporadas entre series)

4 - Main
- Crear 2 arrays, uno con 5 videojuegos y uno con 5 series
- Llenalos con sus objetos respectivos usando los diferentes constructores
- Entrega algunos videojuegos y series
- Cuenta cuantos videojuegos y series han sido entregados y devuelvelos al contarlos
- Encuentra el videojuego con mas horas estimadas y la serie con mas temporadas, y muestralos por pantalla con el metodo tostring
