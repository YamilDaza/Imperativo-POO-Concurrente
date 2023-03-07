(* program Practice;
var
   numOne:integer;
   numTwo:integer;
begin
   write('Enter the value of numOne: '); readln(numOne);
   write('Enter the value of numTwo: '); readln(numTwo);

   if(numOne = numTwo)then
      writeln('Los numeros leidos son iguales')
   else if(numOne > numTwo)then
      writeln('El numero ',numOne,' es mayor a ',numTwo)
   else
      writeln('El numero ',numTwo,' es mayor a ',numOne);
end. *)



program Ejercicio3;
   procedure suma(num1: integer; var num2:integer);
   begin
      num2 := num1 + num2;
      num1 := 0;
   end;
var
   i, x : integer;
begin
   read(x); { leo la variable x }
   for i:= 1 to 5 do
      suma(i,x);
   write(x); { imprimo las variable x }
end.

