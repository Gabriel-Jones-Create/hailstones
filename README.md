# Hailstones

Your job for this assignment is to write a one class program that generates a sequence of the so-called hailstone numbers, and report certain statistics on the sequence your program generates. The hailstone numbers can be described succinctly as follows: Start with a positive integer; if that number is even, divide it in half, and continue; if the number is odd, triple it and add 1, and continue. Proceed in this way until you arrive at the value 1.

For example, if you start with 20, this is the sequence you get: 20,10,5,16,8,4,2,1. If you start with 21, you get this sequence: 21, 64, 32,16, 8, 4, 2, 1.

Here are your precise requirements for the assignment: in one class, called Hailstones, write a program that accepts a positive integer input from the keyboard. This is the starting value for your sequence. Then your code should generate and print out, in a column, hailstone numbers until the value 1 is reached. After 1 has been reached, your program should print out: 1) the largest value appearing in the sequence; and 2) the length of the sequence you generated.

For example, here is the output for the sequence that begins with the seed value 21:

```
Enter a positive hailstone starting value
21

21
64
32
16
8
4
2
1
start: 21
term count: 8
biggest: 64
```

Requirements: your program must be commented and clear.

## Tip: Scanner

Use [Scanner](https://www.w3schools.com/java/java_user_input.asp) to read from the keyboard.

If
`scan`

is a Scanner object, then
`String inputStr = scan.nextLine();`

will read an entire line from the keyboard, and copy it to the String inputStr.
