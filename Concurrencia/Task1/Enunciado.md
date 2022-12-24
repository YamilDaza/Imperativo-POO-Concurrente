# Task 1 - CONCURRENCIA

## Productores y consumidores

Existen dos robots productores que recorren las avenidas 5 y 10 respectivamente, juntando todos los papeles de su avenida. A lo largo del recorrido, cada vez que juntan 5 papeles, los depositan en la esquina (50,50). Además existen dos robots consumidores que intentan tomar una cantidad aleatoria de papeles (entre 2 y 5) de la esquina (50,50) para depositarla en su esquina de origen. Si la esquina (50,50) no posee la cantidad de papeles requerida, vuelven a su esquina de origen sin tomar ningún papel. Si luego de 8 intentos seguidos detectan que la esquina (50,50) no
tiene papeles suficientes para juntar, entonces asumirán que los productores ya han completado su trabajo y por lo tanto terminarán su tarea también.
Los consumidores inician en las esquinas (11,1) y (12,1) respectivamente.