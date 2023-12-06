# CodingQuiz8

Staircase Time Complexity:
O(n^2) as a double for loop structure is used to to write each row, character by character,
before continuing to the subsequent row.

Staircase Space Complexity:
O(c) as only the five variables i, j, k, numSpaces, and numPounds are initialized and used to store integers
during the execution of the code.

Recursive Definition for Alternating Characters:

My recursive approach was to create a helper function, with parameters String s and int nDeletions,
to compare consecutive characters at every position in the initial string.
The code compares the characters at the first 2 positions in the string it is given. If the characters are the same,
the code calls itself again on the substring excluding the first character and implements nDeletions by 1.
If the characters do not match, the code recursively calls helper on the substring that exlcudes the first
character, and nDeletions remains the same.

Before these first 2 characters in s are compared, the helper function checks to see if the end of the
initial string has been reached and comparisons are no longer possible. This base case occurs when
the length of s is less than or equal to 1 character, and at this point nDeletions can be returned since
each character has been compared to the character 1 index to the left and 1 index to the right. 
