program buscarDoble;
var
   numX:integer;
   numInicial:integer;
begin
   write('Enter your value: '); readln(numInicial);

   write('Enter your value: '); readln(numX);
   while(numX <> (numInicial * 2))do begin
      write('Enter your value: '); readln(numX);
   end;

   if(numX = (numInicial * 2))then
      writeln('Type the number ',numX,' what is double of ',numInicial)

end.
