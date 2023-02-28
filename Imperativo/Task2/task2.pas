(* Realizar un programa que lea el número de legajo y el promedio de cada alumno de la facultad. La
lectura finaliza cuando se ingresa el legajo -1, que no debe procesarse.
- Al finalizar la lectura, informar:
○ La cantidad de alumnos leída (en el ejemplo anterior, se debería informar 2)
○ La cantidad de alumnos cuyo promedio supera 6.5 (en el ejemplo anterior, se debería informar 1)
○ El porcentaje de alumnos destacados (alumnos con promedio mayor a 8.5) cuyo legajo sean
menor al valor 2500 (en el ejemplo anterior se debería informar 0%).  *)

program task2;
var 
   legajo:integer;
   promedio:real;
   nombre:string;
   cantidadAlumnosLeidos:integer;
   cantidadAlumnosPromedio:integer;
   cantidadAlumnosDestacados:integer;
   porcentajeAlumnosDestacados:real;
begin
   cantidadAlumnosLeidos:=0;
   cantidadAlumnosPromedio:=0;
   cantidadAlumnosDestacados:=0;
   porcentajeAlumnosDestacados:=0;

   
   write('- Legajo: '); readln(legajo);
   if(legajo = -1)then
      writeln('No se ingreso ningun alumno...')
   else begin
      while(legajo <> -1)do begin
         //Si legajo es indistinto de -1, leimos un alumno
         cantidadAlumnosLeidos:= cantidadAlumnosLeidos + 1;

         write('- Nombre: '); readln(nombre);
         write('- Promedio: '); readln(promedio);

         //Alumnos que superan el promedio de 6.5:
         if(promedio > 6.5)then
            cantidadAlumnosPromedio:= cantidadAlumnosPromedio + 1;

         //Alumnos destacados:
         if((promedio > 8.5) AND (legajo < 200))then
            cantidadAlumnosDestacados:= cantidadAlumnosDestacados + 1;

         writeln();
         write('- Legajo: '); readln(legajo);
      end;

      //Porcentaje de alumnos destacados:
      porcentajeAlumnosDestacados:= cantidadAlumnosLeidos / cantidadAlumnosDestacados;
      writeln();
      
      //Informar:
      writeln('La cantidad de alumnos leidos es: ', cantidadAlumnosLeidos);
      writeln('La cantidad de alumnos que superan el promedio de 6.5, es: ', cantidadAlumnosPromedio);
      writeln('El porcentaje de alumnos destacados es: ', porcentajeAlumnosDestacados:1:1,'%');

   end;    

end.