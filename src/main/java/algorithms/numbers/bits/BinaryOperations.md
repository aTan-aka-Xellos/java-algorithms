### Binary Operations

Binary numeral system use only 1 and 0 to represent a number. Each digit is referred to as a single bit.  
Binary counting follow the same procedure as decimal, after digit reaches 1 in binary, 
an increment resets it to 0 and causes an increment of the next digit to the left:  

![binary_counter](https://github.com/aTan-aka-Xellos/java-algorithms/blob/master/src/main/resources/img/numbers/binary_counter.gif)   


#### Calculations

**Addition:**  
![addition](https://github.com/aTan-aka-Xellos/java-algorithms/blob/master/src/main/resources/img/numbers/addition.png)  

**Subtraction:**  
![substraction](https://github.com/aTan-aka-Xellos/java-algorithms/blob/master/src/main/resources/img/numbers/substraction.png)

**Multiplication:**  
![multiplication](https://github.com/aTan-aka-Xellos/java-algorithms/blob/master/src/main/resources/img/numbers/multiplication.png)

**Division:**  
![division](https://github.com/aTan-aka-Xellos/java-algorithms/blob/master/src/main/resources/img/numbers/division.png)  

#### Conversion to and from decimal numeral system  

**From binary to decimal:**  
![bin2dec](https://github.com/aTan-aka-Xellos/java-algorithms/blob/master/src/main/resources/img/numbers/bin2dec.png)   

**From decimal to binary:**  
![dec2bin](https://github.com/aTan-aka-Xellos/java-algorithms/blob/master/src/main/resources/img/numbers/dec2bin.png) 

#### Representing negative values  

Java uses approach, which is called two's complement. 
Negative numbers are representing by negating (flipping) all the bits and then adding 1. 
If the leftmost bit is 0, the number is positive. Otherwise, it is negative.  
Example with switch sign of 8-bit 1 to -1:       
```
~0000 0001 = 1111 1110  
1111 1110 + 1 = 1111 1111
```
     
![2complement](https://github.com/aTan-aka-Xellos/java-algorithms/blob/master/src/main/resources/img/numbers/2complement.jpg)   


#### Bitwise operators  
 
**AND [&]**  
Bitwise AND, or logical AND. The result is 1 if both bits in the compared position are 1, otherwise, the result is 0.  
**OR [|]**  
Bitwise OR, or logical inclusive OR. The result is 0 if both bits are 0, while otherwise the result is 1.  
**XOR [^]**  
Bitwise XOR, or logical exclusive OR. The result is 1 if only the first bit is 1 or only the second bit is 1, but will be 0 if both are 0 or both are 1.  
**NOT [~]**  
Bitwise NOT, or complement. Bits that are 0 become 1, and those that are 1 become 0.  

![dec2bin](https://github.com/aTan-aka-Xellos/java-algorithms/blob/master/src/main/resources/img/numbers/bitwise_operators.jpg)  
   
#### Bit Shift operators  

**Signed Left Shift [<<]**  
Signed left shift moves all the bits by given number of positions to the left.   
Shifting a number by one is equivalent to multiplying it by 2, 
or more generally left shifting a number by n positions is equivalent to multiplication by 2^n.  
```
101 << 2 = 10100 (20)  
```

There are several additional interesting aspects to this:  

* Even though you can use shifting of byte, short or char, they are promoted to 32-bit integer before the shifting.  
* Bit-shift operators never throw an exception.  
* The right operand (the number of positions to shift) is reduced to modulo 32. That is 5 <<35 is equivalent to 5 << 3.  

**Signed Right Shift [>>]**  
Signed right shift moves all the bits by given number of positions to the right. 
However, it preserves the sign. Positive numbers remain positive and negative ones remain negative.
This mean that right shifting negative value causes filling all bites by 1.   
Similar to left shift, the right shift of n positions is equivalent to division by 2^n. 
Or division by 2^n -1 in case of odd numbers.  
```
1100 >> 2 = 11 (3)
```  

**Unsigned Right Shift [>>>]**  
Unlike the signed shift, the unsigned one does not take sign bits into consideration, 
it just shifts all the bits to the right and pads the result with zeros from the left. 
That means that for negative numbers, the result is always positive. 
Signed and unsigned right shifts have the same result for positive numbers.  
```
1100 >> 2 = 11 (3)
```    

#### Useful links:  
[Bitwise and Bit Shift operations](https://www.vojtechruzicka.com/bit-manipulation-java-bitwise-bit-shift-operations)  
[Two's complement](https://en.wikipedia.org/wiki/Two%27s_complement)  
