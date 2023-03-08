program registros;
type
   str = string[20];
   alumno = record
      codigo: integer;
      nombre: str;
      promedio: real;
   end;

   //PROCESO 1
   procedure leerAlumno(var alu: alumno);
   begin
      write('- Ingrese el codigo del alumno: '); readln(alu.codigo);
      if(alu.codigo <> 0)then begin
         write('- Nombre del alumno: '); readln(alu.nombre);
         write('- Promedio del alumno: '); readln(alu.promedio);
         writeln();
      end;
      writeln();
   end;

   //PROCESO 2
   procedure verificarPromedio(alu:alumno; var alumnoConMejorPromedio:string; var mejorPromedio:real);
   begin
      if(alu.promedio > mejorPromedio)then begin
         alumnoConMejorPromedio:= alu.nombre;
         mejorPromedio:= alu.promedio;
      end;
   end;

var
   alu:alumno;
   alumnoConMejorPromedio: string;
   mejorPromedio: real;
   cantidadAlumnosLeidos: integer;
begin
   cantidadAlumnosLeidos:= 0;
   mejorPromedio:= -1;
   
   leerAlumno(alu); //PROCESO 1
   while(alu.codigo <> 0)do begin
      cantidadAlumnosLeidos:= cantidadAlumnosLeidos + 1;
      verificarPromedio(alu, alumnoConMejorPromedio, mejorPromedio); //PROCESO 2
      leerAlumno(alu); //PROCESO 1
   end;
   writeln('INFORMACION...');
   writeln('El alumnon ',alumnoConMejorPromedio, ' Tiene el mejor promedio con ',mejorPromedio:2:2);
end.