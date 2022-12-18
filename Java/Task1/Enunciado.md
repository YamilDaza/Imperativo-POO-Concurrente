# POO - Analista Programador Universitario

Representar funciones de teatro. Una función tiene un titulo, feceha, hora y mantiene una estructura que representa la sala( N filas y M butacas por fila) que almacenará la informacioón de cada butaca que comprende un descriptor(String), el precio y su estado(si esta ocupado o no).
1- Genere las clases necesarias. Provea los constructores necesarios. La función debe iniciarse a partir de un titulo, una fecha, una hora y las dimensiones de la sala (N Y M). Inicialmente cada butaca debe estar desocupada, tener un precio que surge de la formula(800+100*nro_fila_de_la_butaca y un descriptor 'Butaca i.j donde i es el nro de fila y j es el nro de butaca dentro de su fila').
2- Implemente los métodos necesarios en las clases que corresponda, para:
   - Ocupar la butaca numero B de la gila F y retonrar su precio. Asuma que F y B estan en el rango. 
   - Desocupar todas las butacas de la fila numero F y de la función. Asuma que F esta en el rango.
   - Obtener un String con todas las representaciones de las butacas numero B de la funcion. La representación
 de cada butaca es del estilo('descriptor, precio, estado').
   - Obtener un string que represente la función, que contenga: titulo, fecha, hora, y la representación de cada butaca('descriptor, precio, estadio').

3- Realice un programa que instancie una función de teatro. Ocupe distintas butacas. Compruebe el correcto funcionamiento de los métodos implementados