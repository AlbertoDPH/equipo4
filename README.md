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
