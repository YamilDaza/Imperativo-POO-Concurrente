(* Realizar un programa que lea información de 5 productos de un supermercado. De cada producto se lee código y precio (cada código es un número entre 1 y 200). Informar en pantalla:
- Los códigos de los dos productos más baratos. 
- La cantidad de productos de más de 16 pesos con código par. *)

program task5;
type
   codigos = 1..20;
var
   codigo:codigos;
   precio:real;
   i:integer;
   codigoMin1, codigoMin2:codigos;
   precioMin1, precioMin2:real;
   cantidadProductos:integer;
begin
   codigoMin1:= 1;
   codigoMin2:= 1;
   precioMin1:= 9999;
   precioMin2:= 9999;
   cantidadProductos:= 0;

   for i:=1 to 5 do begin
      write('- Codigo: '); readln(codigo);
      write('- Precio: '); readln(precio);

      if(precio < precioMin1)then begin
         precioMin1:= precio;
         codigoMin1:= codigo;
      end
      else if(precio < precioMin2)then begin
         precioMin2:= precio;
         codigoMin2:= codigo;
      end;

      if((precio > 16) AND (codigo MOD 2 = 0))then
         cantidadProductos:= cantidadProductos + 1;
   end;

   //Informar:
   writeln('La cantidad de productos con precio mayor a 16 y codigo par es ',cantidadProductos);
   writeln('Productos mas baratos: ');
   writeln('1- Codigo: ',codigoMin1, ' - Con precio de: $',precioMin1:2:2);
   writeln('2- Codigo: ',codigoMin2, ' - Con precio de: $',precioMin2:2:2);
   
   writeln();
   write('Presione enter para finalizar_'); readln();
end.

