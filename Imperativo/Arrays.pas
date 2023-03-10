program arrays;
const 
   dimF = 10;
type
   rangoVector = 1..dimF;
   str = string[20];
   empleado = record
      codigo: integer;
      nombre: str;
      oficio: str;
   end;

   vectorEmpleados = array [rangoVector] of empleado;

   //PROCESO 1.A
   procedure leerEmpleado(var emp:empleado);
   begin
      write('- Codigo del empleado: '); readln(emp.codigo);
      if(emp.codigo <> 0)then begin
         write('- Nombre: '); readln(emp.nombre);
         write('- Oficio: '); readln(emp.oficio);
         writeln(); 
      end;
   end;

   //PROCESO 1
   procedure cargarVector(var ve:vectorEmpleados; var dimL:integer);
   var
      i:integer;
      emp:empleado;
   begin
      dimL:=0;
      leerEmpleado(emp); //PROCESO 1.A
      while((dimL < dimF) AND (emp.codigo <> 0))do begin
         dimL:= dimL +1;
         ve[dimL] := emp;
         leerEmpleado(emp); //PROCESO 1.A
      end;
   end;

   //PROCESO 2
   procedure mostrarDatosVector(ve:vectorEmpleados; dimL:integer);
   var
      i:integer;
   begin
      writeln('.... DATOS DE EMPLEADOS .... ');   
      for i := 1 to dimL do begin
         writeln('- Empleado nro',i,': ');
         writeln('     * Codigo: ',ve[i].codigo);
         writeln('     * Nombre: ',ve[i].nombre);
         writeln('     * Oficio: ',ve[i].oficio);
         writeln('');
      end;
   end;

var
   ve: vectorEmpleados;
   dimL:integer;
begin
   cargarVector(ve,dimL); //PROCESO 1
   mostrarDatosVector(ve,dimL); //PROCESO 2
   agregarEmpleado(ve,dimL); //PROCESO 3
end.


