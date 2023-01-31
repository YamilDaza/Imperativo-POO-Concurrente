# Task3 - Concurrencia - Facultad de Informatica UNLP

## Enunciado:
- Realice un programa en el que 4 robots juegan una carrera por avenidas diferentes: 4, 6,
8 y 10 respectivamente. Todos los robots inician en la calle 1.
Para poder avanzar, cada robot debe juntar un papel de una fuente de papeles localizada
en la esquina (11,11), colocarlo en la esquina actual de su avenida y avanzar un paso.
Cuando la esquina fuente ya no tiene más papeles, o cuando se haya completado la
avenida, deberán avisar al robot coordinador y este determinará el robot que llegó más
lejos.

*analysis:*
   - 4 robots, inician una carrera. Todos empiezan por la calle 1. R1 avenida 4; R2 avenida 6; R3 avenida 8; R4 avenida 10;
   - Para poder avanzar, cada robot debe juntar UN papel en la esquina 11,11. Colocarlo en la esquina actual y avanzar un paso.
   - Condición de corte: La esquina de fuente de papeles se termine o se llegue a la ultima esquina de la avenida correspondiente


