# Java Algorithms and Data Structures

Inspired by:  
https://algs4.cs.princeton.edu  
https://github.com/trekhleb/javascript-algorithms  
https://github.com/TheAlgorithms/Java

## Algorithms

### Algorithms by Topic

* **Sorting**

  * [Selection Sort](src/algorithms/sorting/SelectionSort.java)
  * [Insertion Sort] TODO

* **Math**
  * [Primality Test](src/algorithms/numbers/PrimesTrialDivision.java) - trial division method
  * [Sieve Of Eratosthenes](src/algorithms/numbers/SieveOfEratosthenes.java) - sieve of Eratosthenes
  * [Euclidean Algorithm](src/algorithms/numbers/EuclideanAlgorithm.java) - calculate the Greatest Common Divisor (GCD)
  * [BinaryEuclideanAlgorithm](src/algorithms/numbers/BinaryEuclideanAlgorithm.java) - binary gcd algorithm / Stein's algorithm

## Data Structures


## Useful info

### Binary Cheat Sheet

Binary numeral system use only 1 and 0 to represent a number. Each digit is referred to as a single bit.  
Binary counting follow the same procedure as decimal, after digit reaches 1 in binary, 
an increment resets it to 0 and causes an increment of the next digit to the left:  
![alt text][binary-counter-image] 
 
**Representing**  
**Calculations**  
Addition:  
0 + 0 → 0  
0 + 1 → 1  
1 + 0 → 1  
1 + 1 → 1 0 (carry 1)  

Subtraction:  
0 − 0 → 0  
0 − 1 → 1 (borrow 1)  
1 − 0 → 1  
1 − 1 → 0  

Multiplication:  
&nbsp;&nbsp;&nbsp;              1 0 1 (A)  
&nbsp;                        × 0 1 1 (B)  
&nbsp;&nbsp;&nbsp;&nbsp;        -------  
&nbsp;&nbsp;&nbsp;&nbsp;        1 0 1  
&nbsp;&nbsp;                  1 0 1  
                            0 0 0  
                            -----------  
                            0 1 1 1 1

**Conversion to and from decimal numeral system**


**Bitwise operations**  
NOT (~)   
AND &   
OR  |  
XOR ^  
   
**Bit shifts**  
    <<  
    >>  
    >>>  
                            
      

[binary-counter-image]: https://upload.wikimedia.org/wikipedia/commons/7/75/Binary_counter.gif

