(* Realizar un programa que lea números enteros desde teclado. La lectura debe finalizar cuando se
ingrese el número 100, el cual debe procesarse. Informar en pantalla:
◦ El número máximo leído.
◦ El número mínimo leído.
◦ La suma total de los números leídos. *)

program task4;
const
   FIN = 100;
var
   num:integer;
   numMax, numMin, sumaTotal:integer;
begin
   numMax:= -1;
   numMin:= 9999;
   sumaTotal:= 0;

   repeat
      write('Ingresa un numero: '); readln(num);
      if(num > numMax)then
         numMax:= num
      else if(num < numMin)then
         numMin:= num;
      sumaTotal:= sumaTotal + num;
   until(num = FIN);

   writeln('La suma total de los numeros leidos es: ', sumaTotal);
   writeln('El numero maximo es: ',numMax);
   writeln('El numero minimo es: ',numMin);

end.



