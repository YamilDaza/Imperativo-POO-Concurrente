//Puntero
program puntero;
type
   cadena = string[20];
   puntero_cadena = ^cadena;
var
   pc:puntero_cadena;
begin
   new(pc);
   pc^:= 'un nuevo nombre';
   writeln(pc^);
   pc^:= 'otro nuevo nombre';
   writeln(pc^);
   dispose(pc);
end.