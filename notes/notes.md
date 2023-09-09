# Java Brains - Generics In Depth 

## Introduction 

![img](slides/img.png)
![img](slides/img_1.png)

## Why we need Generics ? 
The below will not work without casting!

![img](slides/img_2.png)
***
![img](slides/img_3.png)
***
![img](slides/img_4.png)

## Type Erasure

- Generic is not a Runtime construct, it's actually a compile time construct. 
- This is called Type erasure. 
- Generic is a compile type construct because, after compiling the byte code will not have the generic information at all!
<br></br>
![img](slides/img_5.png)

