(* Realizar un programa que lea desde teclado la información de alumnos ingresantes a la carrera
Analista en TIC. De cada alumno se lee nombre y nota obtenida en el módulo EPA (la nota es un
número entre 1 y 10). La lectura finaliza cuando se lee el nombre “Zidane Zinedine“, que debe
procesarse. Al finalizar la lectura informar:
- La cantidad de alumnos aprobados (nota 8 o mayor) y
- la cantidad de alumnos que obtuvieron un 7 como nota *)

program task3;
const
   FIN = 'zzz';
type
   notas = 1..10;
var
   nombre:string;
   nota:notas;
   cantidadAlumnosNota8oMAs:integer;
   cantidadAlumnosNota7:integer;
begin
   cantidadAlumnosNota8oMAs:=0;
   cantidadAlumnosNota7:=0;

   repeat
      write('- Nombre: '); readln(nombre);
      write('- Nota: '); readln(nota);
      writeln();

      if(nota >= 8)then
         cantidadAlumnosNota8oMAs:= cantidadAlumnosNota8oMAs + 1;
      if(nota = 7)then
         cantidadAlumnosNota7:= cantidadAlumnosNota7 + 1;
   until (nombre = FIN);

   //Informar:
   writeln('La cantidad de alumnos con nota igual o mayor a 8 es: ',cantidadAlumnosNota8oMAs);
   writeln('La cantidad de alumnos con nota igual a 7 es: ',cantidadAlumnosNota7);

end.
