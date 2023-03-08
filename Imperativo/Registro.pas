program registro;
type
   alumno = record
      nombre: string;
      edad:integer;
      codigoAlumno:integer;
   end;

   procedure leerAlumno(var alu: alumno);
   begin
      write('- Ingrese el nombre: '); readln(alu.nombre);
      if(alu.nombre <> 'zzz')then begin
         write('- Edad: '); readln(alu.edad);
         write('- Codigo de Alumno: '); readln(alu.codigoAlumno);
         writeln();
      end
      else begin
         writeln();
         writeln('---- Hemos terminado la carga de alumnos ----');
         writeln();
      end;
   end;

   function esPar(codigo: integer):boolean;
   begin
      esPar:= (codigo MOD 2 = 0);
   end;

var
   alu:alumno;
   cantidadAlumnos,cantCodigoPar:integer;
begin
   cantidadAlumnos:= 0;
   cantCodigoPar:=0;

   leerAlumno(alu);
   while(alu.nombre <> 'zzz')do begin
      cantidadAlumnos:= cantidadAlumnos + 1; 
      if(esPar(alu.codigoAlumno))then  
         cantCodigoPar:= cantCodigoPar + 1;
      
      leerAlumno(alu);
   end;

   writeln();
   writeln('La cantidad de alumnos leidos es: ', cantidadAlumnos);
   writeln('La cantidad de alumnos con codigo Par es: ',cantCodigoPar);
   write('Presione enter para finalizar_'); readln();

end.