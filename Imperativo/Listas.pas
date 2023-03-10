program listas;
type
   puntero = ^integer;
var
   p:puntero;
begin
   new(p);
   p^ := 123;
   p := nil;
   writeln('Mostrando mi puntero: ',p^);
end.