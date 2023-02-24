program Practice;
   procedure recursion(x:integer);
   begin
      if(x < 5)then begin
         x:=x-1;
         recursion(x);
      end;
   end;

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
   recursion(1)
end.

