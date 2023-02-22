program Practice;
   procedure imprimir(x:integer);
   begin
      if(x > 0)then begin
         writeln('Valor de X ' ,x);
         x:=x - 1;
         imprimir(x);
      end;
   end;
var
   x:integer;
begin
   x:=5;
   imprimir(x);
end.

