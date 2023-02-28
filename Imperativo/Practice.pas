program Practice;
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
end.

