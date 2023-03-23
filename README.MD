# Patrón Abstract Factory
El patrón de diseño Abstract Factory busca agrupar un conjunto de clases que
tiene un funcionamiento en común, llamadas familias, las cuales son creadas
mediante un Factory. Este patrón es especialmente útil cuando requerimos tener
ciertas familias de clases para resolver un problema, sin embargo, puede que se
requieran crear implementaciones paralelas de estas clases para resolver el
mismo problema pero con una implementación distinta.

![img.png](imgs/img.png)

la diferencia entre entre Factory Method es que Abstract Factory se enfoca en
la creación de familias completas de objetos y el Factory Method se enfoca en la
creación individual de objetos.

![img_1.png](imgs/img_1.png)
![img_2.png](imgs/img_2.png)

# Cuándo utilizarlo:
 Cuando la creación directa de un objeto por medio del operador new
puede ser perjudicial.
 Cuando no se conoce en tiempo de diseño, la familia de clases que se
utilizará en ejecución.
 Cuando es necesario controlar la creación de objetos por medio de una
interface común.
 Cuando es necesario trabajar con distintas plataformas, manteniendo la
misma estructura y compatibilidad con todas ellas.
