**Partimos de la hipótesis que el proceso de cálculo de medias tarda 5 segundos en calcular el dato al recibir un intento
  y que este cálculo no se puede optimizar más. ¿Qué estrategia se podría seguir para que, si se reciben 1000 intentos del mismo
  usuario en la misma actividad en un periodo de 10 segundos, haga la mínima cantidad de cálculos posible?**

*Respuesta.*

Partiendo de que 1000 intentos en 10 segundos de un mismo usuario en una o más actividades es prácticamente imposible podemos plantear varias soluciones:
- Sacar la media a partir del 10% de los intentos bajo demanda del propio usuario (algo no muy preciso, pero con un algoritmo de divide y vencerás podría tener algo de sentido).
- Otra estrategia sería tener un procedimiento en segundo plano que fuera calculando cada X segundos (u otra unidad de tiempo) la media en base a los intentos y las notas acumuladas en ese preciso momento.
