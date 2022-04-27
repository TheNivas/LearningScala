# Arrays: 1

## Arrays:
Collection of <mark>**same**</mark> datatype
* index starts with zero always.
<br>
i.e.
```scala
(1, 2, 3, 4, 5)        //Integer Array
("abc", "xyz", "ghi") // String Array
```
100 variables: <br>
* array => num(100) <br>

* for loop to access the array. <br>
### Declaration Of Array
```scala
var num:Array[Int] = new Array[Int](3)
```
* num: name of the array
* Array: Array
* new : creating a object
* Array: name of class
* [Int]: Datatype
* (3): length of array
**Or**
```scala
var num = new Array[Int](3)
num(0) = 25
num(1) = 22
num(2) = 54
```

### Terminal: 
```scala

scala> var num = new Array[Int](3)
var num: Array[Int] = Array(0, 0, 0)

scala> num(0) = 25

scala> num(1) = 22

scala> num(2) = 54

scala> num
val res0: Array[Int] = Array(25, 22, 54)

```
![img.png](img.png)
