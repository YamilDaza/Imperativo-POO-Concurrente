Program uno;
Type 
   listaE= ^datosEnteros; 
   datosEnteros= record
      elem:integer;
      sig:listaE;
   end;
Var 
   pri: listaE; {Memoria estática reservada}
Begin
   pri:= nil;
End.

