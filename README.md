# EstructurasDeDatos
Apuntes y algoritmos

# LISTAS
  ## Definición
  Es una **estructura de datos** en donde los objetos están ubicados en forma secuencial. A diferencia de la *Pila*  y la *Cola*, en una **Lista** se puede *agregar* y *eliminar* en cualquier posición. 
  Puede estar **ordenada**  o **desordenada**. 
  
    > Ordenada: los elementos se ubican siguiendo el orden de las claves almacenadas en la lista.
    > Desordenada:  los elementos pueden aparecer en cualquier orden.
    
# ÁRBOLES
## Conceptos:
   •	Hoja:  es un nodo que no tiene ningún hijo. <br>
•	Hermanos: son los nodos que tienen el mismo nodo padre. <br>
•	Camino: desde N1 hasta Nk, es una secuencia de nodos N1, N2, ….,Nk tal que ni es el padre de Ni+1, para 1 ≤ i < K. <br>
	> La longitud del camino es el número de aristas, es decir k-1. <br>
	> Existe un camino de longitud cero desde cada nodo a sí mismo. <br>
	> Existe un único camino desde la raíz a cada nodo. <br>
•	Profundidad: es la longitud del único camino desde la raíz hasta un nodo. <br>
	>La raíz tiene profundidad cero. <br>
•	Grado: es el número de hijos de un nodo. <br> 
•	Altura: es la longitud del camino más largo desde un nodo hasta una hoja. <br>
	> Las hojas tienen altura cero. <br>
	> La altura de un árbol es la altura del nodo raíz. <br> 
•	Ancestro/Descendiente: si existe un camino desde n1 a n2, se dice que n1 es ancestro de n2 y este descendiente de n1. <br>


# ÁRBOLES BINARIOS
Es una colección de nodos, tal que: <br>
	•	Puede estar vacía. <br>
	•	Puede estar formada por un nodo distinguido R, llamado raíz y dos sub-árboles T1 y T2, donde la raíz de cada subárbol Ti  esta conectado a R por medio de una arista. <br>
	
## Características	
	•Cada nodo puede tener a lo sumo dos nodos hijos.
	•No hay relación entre la altura y la cantidad de nodos excepto si el árbol es lleno.
	#total de nodos = 2^(h+1)-1
	•Hay 2  tipos de recorridos
	>En profundidad
	>Por niveles

# ÁRBOL BINARIO DE BÚSQUEDA (ABB)
## Definición
Es una colección de nodos contenido en claves que debe cumplir con una propiedad estructural y una de  orden.
	La propiedad estructural: es un árbol binario.
	La propiedad de orden: para cada nodo N del árbol se cumple que todos los nodos ubicados en el subárbol izquierdo contienen claves menores  que la clave del nodo N y los nodos ubicados en el subárbol derecho contienen claves mayores  que la clave del nodo N.

# Generalizando estructuras
	•	Los tipos genéricos le permiten al programador abstraerse de los tipos.
	•	Usando tipos genéricos  es posible definir estructuras donde la especificación del tipo de objeto a guardar se posterga hasta el momento de la instanciación.
	•	Para especificar el uso de genéricos, se utiliza <tipo>.

