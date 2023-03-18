Ejercicio UD09_04_Raices
Representanción de los valores de una ecuaciión de 2º grados.

Tendremos los 3 coeficientes como atributos a, b y c.

Hay que insertar estos 3 valores para construir el objeto.

Las operaciones que se podrán hacer son las siguientes:

1.  getDiscriminante(): devuelve el valor del discriminante (double), el discriminante
    tiene la siguiente formula, (b^2)-4*a*c

2.  tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que
    esto ocurra, el discriminante debe ser mayor o igual que 0.

3.  tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que
    esto ocurra, el discriminante debe ser igual que 0.

4.  calcular(): mostrara por consola las posibles soluciones que tiene nuestra ecuación,
    en caso de no existir solución, mostrarlo también.

5.  obtenerRaices(): imprime las 2 posibles soluciones

6.  obtenerRaiz(): imprime única raíz, que será cuando solo tenga una solución
    posible.

Formula ecuación 29 grado: (-b±√((b^2)-(4*a*c))/(2*a)

Solo varia el signo delante de -b

Ejercicio UD09_05 Aula estudiantes y profesores

Representar con programación orientada a objetos, un aula con
estudiantes y un profesor.

1.  Tanto de los estudiantes como de los profesores necesitamos saber su nombre, edad y
    sexo. De los estudiantes, queremos saber también su calificación actual (entre 0 y 10)
    y del profesor que materia da

2.  Las meterías disponibles son matemáticas, filosofía y física.

3.  Los estudiantes tendrán un 50% de hacer novillos, por lo que si hacen novillos no van
    a clase pero aunque no vayan quedara registrado en el aula (como que cada uno tiene
    su sitio).

4.  El profesor tiene un 20% de no encontrarse disponible (reuniones, baja, etc.)

    Las dos operaciones anteriores deben llamarse igual en Estudiante y Profesor
    (polimorfismo).

5.  El aula debe tener un identificador numérico, el número máximo de estudiantes y
    para que esta destinada (mateméticas, filosofía o física). Piensa que más atributos
    necesita.

6.  Un aula para que se pueda dar clase necesita que el profesor esté disponible, que el
    profesor de la materia correspondiente en el aula correspondiente (un profesor de
    filosofía no puede dar en un aula de mateméticas) y que haya más del 50% de
    alumnos.

7.  El objetivo es crear un aula de alumnos y un profesor y determinar si puede darse
    clase, teniendo en cuenta las condiciones antes dichas.

8.  Si se puede dar clase mostrar cuantos alumnos y alumnas (por separado) están
    aprobados de momento (imaginad que les están entregando las notas).

NOTA: Los datos pueden ser aleatorios (nombres, edad, calificaciones, etc.) siempre y
cuando tengan sentido (edad no puede ser 80 en un estudiante o calificación ser 12).

