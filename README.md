# Techbiosis

In this repository you can find a small exercice, whose goal is to translate integer and spell it out in english. E.g.

542: five hundred forty-two

23212 twenty-three thousand two hundred twelve

1049875: one million forty-nine thousand eight hundred seventy-five


You can find two classes, the main one called Techbiosis.java, which reads the input from the keyboard and recursively calls the function Decompose, that function decomposes the number in pairs of three. E.g: 

1049875: 1 049 875

23212: 23 212

This way it is easier to assign the right units like thousands, millions, billions,etc... After decomposing a number in pairs of three, it calls the class Numbers whose goal is to translate the numbers into english.
The class number is again divided in 3 parts, each one has to do with the 3 pair of numbers, first we get the hundred digit by dividing by 100 afterwards the tens by dividing by 10 and finally the units by geting the remainder.
Each one of those numbers will be sent to a function, which will return the translation in english. 
