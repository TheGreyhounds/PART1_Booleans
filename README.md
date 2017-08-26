# PART1_Booleans
It's very useful to have a straight answer sometimes; yes or no, true or false. The boolean primitive type in Java gives the programmer this power.

In this code snippet, we learned 3 key things:
- A boolean is a data type that can only have one of two values: true or false
- A boolean can be compared with other booleans to create a boolean expression that
overall can be true or false
- Booleans can be checked against other booleans for equality, or inequality, and
can be switched to the opposite state with the unary NOT operator

Put another way, the concept of booleans is in principle very simple: let's have a data 
type that can only have two possible values: true or false. The consequence for this is very 
broad and very significant. If we assume that booleans, representing either on or off states, 
also represent something significant in the program, say whether or not a video has finished 
loading, then we can very easily, and very efficiently, create not just linear programs that 
run from start to finish, but branched programs, that travel down a tree of logic based upon 
what values the booleans we use take.

Back to the loading video example. We might have a function in our program, isFinishedLoading(), 
which when called, returns false if the video hasn't finished loading, and returns true if the 
video has finished loading (Just a quick aside, the idea of a function returning a value will be 
more formally explored, but if you are unfamiliar with this idea, a function can return an object 
like a String or a boolean when it finishes running. This is why we have to use the "void" 
identifier when declaring our main() function, because we are telling Java that the main() function 
doesn't return anything; its return is void). The program can keep calling the isFinishedLoading() 
function, and can wait before continuing down the program until isFinishedLoading() returns true.
Booleans, then, are incredibly useful for structuring our programs in non-linear ways.

Up until this point, you've created programs that run from beginning to end the same way every time.
With booleans, we can change the outcomes in one part of our code from another part in our code.
Booleans and boolean logic are staples not just to Java, but to programming in general, and will
be a great tool to creating more complex and detailed programs. To create those programs, though,
there still is a missing piece, the if-if else-else statement, also known as a control statement,
which we will explore next.