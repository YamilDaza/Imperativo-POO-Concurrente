program task7;
   function isDouble(num1:integer; num2:integer):boolean;
   begin
      isDouble:= (num2 = (num1 * 2));
   end;
var
   num1, num2: integer;
   amount, amountDouble: integer;
begin
   amount:= 0;
   amountDouble:=0;
   write('Primer dato: '); readln(num1);
   write('Segundo dato: '); readln(num2);
   
   while((num1 <> 0) AND (num2 <> 0))do begin
      amount:= amount + 1;
      if(isDouble(num1, num2))then
         amountDouble:= amountDouble + 1;

      writeln();
      write('Primer dato: '); readln(num1);
      write('Segundo dato: '); readln(num2);
   end;

   writeln('The amount of reading number is: ',amount);
   writeln('The amount of reading number is double: ',amountDouble);
end.

(* 
a. Realizar un módulo que reciba un par de números (numA,numB) y retorne si numB es el doble de numA.
b. Utilizando el módulo realizado en el inciso a., realizar un programa que lea secuencias de pares de
números hasta encontrar el par (0,0), e informe la cantidad total de pares de números leídos y la cantidad de
pares en las que numB es el doble de numA.
Ejemplo: si se lee la siguiente secuencia: (1,2) (3,4) (9,3) (7,14) (0,0) el programa debe informar los valores 4 (cantidad de pares leídos) Y (cantidad de pares en los que numB es el doble de numA). *).
